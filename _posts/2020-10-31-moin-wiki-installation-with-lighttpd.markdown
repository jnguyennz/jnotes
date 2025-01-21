---
layout: post
title:  "Steps to setup moinmoin wiki on raspian os with lighttpd"
date:   2020-10-31
categories: Python Moin Wiki Lighttpd
---
# Steps to setup moinmoin wiki on raspian os with lighttpd
I am using the following steps for my own setup moin wiki on raspian os for my own use at home.
I am using hyper-V to host raspian os but you can setup in raspberry pi as well.

# Step 1:
Install raspian os on hyper-V
Download link is at https://www.raspberrypi.org/downloads/raspberry-pi-desktop/
This is easy step, you can install additional software for this host if you like

- install TightVNC
- Run TightVNC and setup password

    /usr/bin/tightvncserver


# Step 2:

Download MoinMoin Wiki

    wget http://static.moinmo.in/files/moin-1.9.10.tar.gz


Unzip the file.

    tar xvzf moin-1.9.10.tar.gz


the zip file is unzip to folder moin-1.9.10

we rename this folder to moin folder with following command: 


    sudo mv moin-1.9.10 moin


# Step 3:

Create 2 following folders

Create folder moinmoin_engine This is the folder we will install moin wiki
        sudo mkdir /usr/local/moinmoin_engine##

Create folder /usr/local/moinmoin_instance1
        sudo mkdir /usr/local/moinmoin_instance1
This folder will be the website folder in lighttpd

# Step 4:
We will install moin now.
moin folder is at /home/pi/moin
under the source path, run
        sudo python setup.py install --prefix=/usr/local/moinmoin_engine

# Step 5:
Copy the following files to /usr/local/moinmoin_instance1

    sudo cp -r /usr/local/moinmoin_engine/share/moin/data /usr/local/moinmoin_instance1
    sudo cp -r /usr/local/moinmoin_engine/share/moin/underlay /usr/local/moinmoin_instance1
    sudo cp /usr/local/moinmoin_engine/share/moin/config/wikiconfig.py /usr/local/moinmoin_instance1
    sudo cp /usr/local/moinmoin_engine/share/moin/server/moin.fcgi /usr/local/moinmoin_instance1

# Step 6:
Change the permission for folder /usr/local/moinmoin_instance1
    sudo chown -R www-data:www-data /usr/local/moinmoin_instance1


# Step 7:
Modify the moin.fcgi, locate the following lines:
    # a1) Path of the directory where the MoinMoin code package is located.
    #     Needed if you installed with --prefix=PREFIX or you didn't use setup.py.
    #sys.path.insert(0, 'PREFIX/lib/python2.3/site-packages')
    sys.path.insert(0, '/usr/local/moinmoin_engine/lib/python2.7/site-packages')

    # a2) Path of the directory where wikiconfig.py / farmconfig.py is located.
    #     See wiki/config/... for some sample config files.
    #sys.path.insert(0, '/path/to/wikiconfigdir')
    sys.path.insert(0, '/usr/local/moinmoin_instance1')

    ...

    ## this works around a bug in flup's CGI autodetection (as of flup 1.0.1):
    #os.environ['FCGI_FORCE_CGI'] = 'Y' # 'Y' for (slow) CGI, 'N' for FCGI
    os.environ['FCGI_FORCE_CGI'] = 'N'

    ...

    # Is fixing the script name needed?
    # Use None if your url looks like http://domain/wiki/moin.fcgi
    # Use '' if you use rewriting to run at http://domain/
    # Use '/mywiki' if you use rewriting to run at http://domain/mywiki/
    #fix_script_name = None  # <-- adapt="adapt" as="as" class="anchor" here="here" id="line-24" needed="needed" span="span">fix_script_name = ''# <-- adapt="adapt" as="as" here="here" needed="needed" pre="pre">

    fix_script_name = ''# <-- adapt="adapt" as="as" here="here" needed="needed" pre="pre">


# Step 8: 
Modify file /etc/lighttpd/lighttpd.conf

Under server.modules, add following

    "mod_accesslog", 
    "mod_fastcgi",

under server.port add the following:
    server.bind = "xx.xx.xx.xx" #your server ip additional

under static-file.exclude-extensions = ( ".php", ".pl", )
remove ".fcgi"

At the end of the file, add following:
Next prepare virtual host by appending the following block /etc/lighttpd/lighttpd.conf:

        $HTTP["host"] =~ "/" {

            fastcgi.server += ( "/" =>
              ((
                "socket" => "/tmp/moin.socket",
                "min-procs" => 1,
                "max-procs" => 2,
                "check-local" => "disable",
                "bin-path" => "/usr/local/moinmoin_instance1/moin.fcgi",
                "fix-root-scriptname" => "enable"
              ))
          )

        #no need this one.
        #alias.url += ( "/moin_static195" => "/usr/local/moinmoin_engine/lib/python2.7/site-packages/MoinMoin/web/static/htdocs")

        }

# Step 9:
Modify the moinwikiconfig file:

Enable create user in Moin wiki, in wikiconfig.py enable the following command.

    actions_superuser = multiconfig.DefaultConfig.actions_superuser[:]
    actions_superuser.remove('newaccount')

After enable this, you can create account at Moin login page 

# Step 10:
Enable access for user

    acl_rights_before = u"Your-User:read,write,delete,revert,admin"

# Step 11:
Add the email config for wikiconfig

    # SMTP server, e.g. "mail.provider.com" (None to disable mail)
    mail_smarthost = "smtp.office365.com:587"
    # The return address, e.g u"Jimmy Wiki <noreply@mywiki.org>" [Unicode]
    mail_from = u"Jimmy Wiki Support <your_email@domain.com>"
    # "user pwd" if you need to use SMTP AUTH
    mail_login = "your_email@domain.com Yourpassword"

# Step 12:
You should restart the service after you have done the changes in config file.
    
    sudo service lighttpd restart

It will display the following, you select 1 and enter password raspberry
    
    ==== AUTHENTICATING FOR org.freedesktop.systemd1.manage-units ===
    Authentication is required to restart 'lighttpd.service'.
    Multiple identities can be used for authentication:
     1.  ,,, (pi)
     2.  root
    Choose identity to authenticate as (1-2):

After enter password, it will display following:
    
    ==== AUTHENTICATION COMPLETE ===


Now you can open your browser to access your wiki to create the username which match with "Your-User"

Your-User will has permission to create pages

if you don't want people see your pages in wiki, you can add this setting in wikiconfig.py

    acl_rights_default = u"Trusted:read,write,detele,revert Known:read"

That mean, Only Known user can read.

Enjoy your wiki ^-^
