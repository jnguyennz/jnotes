# Error when run this command
``` Error: xhost: unable to open display "0"
has error DISPLAY:0
```
also have error when run
```run sudo java -jar jgrasp```

Solution:
add the following line to /etc/pam.d/su and /etc/pam.d/sudo:

```session optional pam_xauth.so```
