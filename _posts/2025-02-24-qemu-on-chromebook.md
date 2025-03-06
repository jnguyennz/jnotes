Recently I changed to use to chromebook daily now and enjoy using a different operating system so far.

Here are my experience to use qemu on chromebook linux.

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
