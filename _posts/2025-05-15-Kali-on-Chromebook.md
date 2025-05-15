# Kali on Chromebook

Using Vagrant to run kali

Commands
```
# Update the package list:
sudo apt update.

# Install VirtualBox:
sudo apt install virtualbox.

# Install Vagrant:
sudo apt install vagrant

# Install Libvirt-daemon
sudo apt install libvirt-daemon

#  Install libvirt-bin which has splited to 2 file libvirt-daemon-system and libvirt-clients
sudo apt install libvirt-daemon-system libvirt-clients

# Add your username to group
sudo usermod -a -G libvirt your-username

# Create vagrant file
vagrant init kalilinux/rolling --box-version 2025.1.0

# Run the vm
vagrant up

# SSH to the vm
vagrant ssh kali

# Reference:
https://portal.cloud.hashicorp.com/vagrant/discover/kalilinux/rolling
https://support.google.com/chromebook/thread/222567243/can-i-install-kali-on-chromebook-background-i-am-learning-ceh-and-kali-has-the-tools?hl=en
https://askubuntu.com/questions/1089753/e-package-libvirt-bin-has-no-installation-candidate

```
