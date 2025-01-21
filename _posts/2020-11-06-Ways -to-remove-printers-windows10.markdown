---
layout: post
title:  "Remove Printer from windows 10"
date:   2020-11-04
categories: windows10 printers
---

**Remove printer from your computer**

It is annoy sometimes when you try to remove the printer and it says the printer is in use.

We have to force to remove it

Here are some ways:

1) **Control panel / Device and printer / Remove printer**

2) **Control panel / Device and printer / print server property / drivers tab / remove driver.**

note: after select the printer, you can see printer server property

3) Remove corrupted printer in the registry

Run \ regedit \ 
**HKEY_LOCAL_MACHINE > SYSTEM > CurrentControlSet > Control > Print > Printers**

Then, select printer and delete (whole printer folder)

4) Clear the printer job queue
Go to **C:\Windows\System32\spool\PRINTERS**
Then, Delete everything.

If you can not delete, open services \ STOP printer spooler and try to delete job queue again.

5) **Run \ ms-settings:connecteddevices**
Then, remove printer

6) **Run \ printui /s**
Then, Remove printer or printer and drivers or ports

7) **Run \ printmanagement.msc**
Then, Remove printer

8) **Run \ devmgmt.msc**
Then, uninstall printer

9) Remove printer from command prompt
Run \ CMD 

List the printer
**wmic printer get name**

Remove printer with command
**printui.exe /dl /n "Name of Printer"**

10) Remove printer from powershell

Open Powershell (with admin)
**Get-Printer | Format-List Name**

Then, remove printer
**Remove-Printer -Name "Printer name"**

11) **Run \ explorer shell:::{2227A280-3AEA-1069-A2DE-08002B30309D}**
Select printer and delete.
