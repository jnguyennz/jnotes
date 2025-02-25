Recently I changed to use to chromebook daily, because macbook is too expensive for me to afford it.
I don't have job now.

As I am learning, I use chromebook.

I found that jgrasp String.format on linux on chromebook has different format comparing the String.format on windows.

I need to create the virtual machine to test it. Since I only have chromebook, so I need to install virtual machine on chromebook

Step 1: Install the virtual qemu software

```
sudo apt install qemu-kvm libvirt-clients libvirt-daemon-system bridge-utils virtinst libvirt-daemon virt-manager 
```

Step 2: You will have error when you create the virtual machine

Error links: 

https://www.reddit.com/r/chromeos/comments/1fjkrbo/installing_virtual_machine_on_chrome_os_operation/

https://www.reddit.com/r/Crostini/comments/sayw8l/unable_to_set_xattr_trustedlibvirtsecuritydac/

Solution:
- After clicking add connection you should see a new window open where it says hyper visor: QEMU/KVM. 
- Click QEMU/KVM and change it to: QEMU/KVM user session.

  Now you can create Virtual machine.
