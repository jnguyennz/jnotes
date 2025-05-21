If you cannot remember your user password do the following:  

Open a crosh session using the key-combo: CTRL+ALT+t
At the crosh prompt enter: vmc start termina 
At the '(termina) chronos@localhost ~ $' prompt enter: lxc exec penguin -- bash 
At the 'root@penguin:~#' prompt to change the user password enter: passwd [username]
( To determine your username enter: grep 1000:1000 /etc/passwd|cut -d: -f1 )
Enter a new password (twice).

If you set a root password and cannot remember it do the following:

Follow steps 1 thru 3 above.
At the 'root@penguin:~#' prompt to delete the root password enter: passwd -d root
( That will delete the root passwd and leave it unset, the default setting. )
