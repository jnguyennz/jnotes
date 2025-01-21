---
layout: post
title:  "Second authentication for your RDP"
date:   2020-07-30
categories: RDP Authentication 2FA Duo
---

This is my note to apply this secondary authentication for Remote desktop and local login. This helps to add extra layer of security for your windows logon.

[Duo](https://duo.com/) is free. You can use it for Microsoft RDP application totally Free.

1) Create a account free (for 10 users, 1 account has 4 alias name) [here](https://duo.com/)

2) Download the mobile app duo mobile for your phone (IOS / Android)

3) Link your duo account with your phone duo mobile app

4) Follow the guide for installation [here](https://duo.com/docs/rdp)

5) When we enroll the user, we have to add our phone number / user's phone number to the user. so It will show us the method to add our duo mobile to the user.
The purpose of user enrollment is linking your duo mobile with your user.

6) Download and install the duo authentication logob software on your PC [here](https://dl.duosecurity.com/duo-win-login-latest.exe)

7) Now you can test it. 

Now you can feel safe when you open your RDP online. 
