---
layout: post
categories: arch_linux 
---

## Install Arch Linux

**Boot from ArchLinux USB**
**Connect PC to internet via LAN network**
**Run archinstall**
**After install completed, reboot and install the following**

```Run: sudo dnf update```

<ol>
<li>Localsend</li>
<li>ibus-unikey</li>
<li>Libre Office</li>
<li>Microsoft Edges</li>
<li>Chronium</li>
<li>Firefox</li>
<li>Keepass</li>
<li>install i3 desktop manager</li>
<li>Install font for Korean, Chinese, Japanese, Vietnamese</li>
```sudo pacman -S adobe-source-han-sans-otc-fonts```
<li>Anki</li>
</ol>


---
**Install Bluetooth for ArchLinux**
   ```
   sudo pacman -S bluez bluez-utils
   sudo pacman -S blueman
   sudo systemctl start bluetooth.services
   sudo systemctl start bluetooth.service
   sudo systemctl enable bluetooth.service
```

---

**i3 desktop management**
```
mod+Return = New terminal
mod+D dmenu
mod+f toggle full screen
mod+shift+q kill current app
mod+number change the virtual desktop
Ctrl shift ++ increase font size for terminal
mod+r resize change the windows size with up down key

netctl connect to wifi with this command
```
**Touch screen for firefox**
```
this works with laptop B1100FKA - ASUS
firefox --> go to about:config
search for dom.w3c change value from 2 to 1

edit this file /etc/security/pam.conf
MOZ_USE_XINPUT2 DEFAULT = 1
```
