## Upload OVA file to proxmox and convert it to qcow2 as VM in proxmox.

Step 1:

sftp file basic_pentesting_1.ova to proxmox
to /tmp folder

Step 2:

extract file ova
```tar xvf basic_pentesting_1.ova```

Step 3 :

find the ovf file and import it to proxmox
```qm importovf 102 ./csec.ovf local-lvm -format qcow2```

Example:
```
the commands i have been running:
root@pve:~# mkdir ova_import && cd ova_import
root@pve:~/ova_import# wget -O tracelabsOSINT.ova https://github.com/tracelabs/tlosin...2023.10/tl-osint-2023.03-virtualbox-amd64.ova
root@pve:~/ova_import# tar xvf tracelabsOSINT.ova
root@pve:~/ova_import# qm importovf 200 ./tl-osint-2023.03-virtualbox-amd64.ovf local-lvm --format qcow2
```
