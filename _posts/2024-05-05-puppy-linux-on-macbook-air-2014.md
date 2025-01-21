---
layout: post
title:  "Puppy linux on macbook air 2014"
categories: puppy linux macbook-air
---
# Puppy linux on macbook air 2014

Puppy linux ubuntu base is super light and it makes my old macbook usable again.

## Step 1:
<ul>
  <li>Use Gparted program.</li>
  <li>Setup the internal drive with 2 partitions.</li>
  <li>First one, small 300MB, fat32 format, flagged boot, esp. (location for boot loader files, boot partition)</li>
  <li>Rest of drive, whatever other partition(s), but one ext3 or 4 format. (location to put frugal installs)</li>
  <li>(this is UEFI standard requirement, and some computers, look for a fat32 partition, for boot loader files)</li>
  </ul>

## Step 2:
<ul>
  <li>Run Frugalpup Installer main program.</li>
  <li>On the main window are selection buttons.</li>
  <li>Select the Puppy button, to do the install.</li>
  <li>Go through install process, selecting to install to the ext formatted partition.</li>
</ul>

## Step 3:

<ul>
  <li>When selecting the partition to install to.</li>
  <li>A window pops up, giving option to make a directory, to put the frugal install in.</li>
  <li>I make this directory and usually name it, the name of the Puppy version.</li>
  <li>Carefully read that windows info.</li>
  <li>Press enter, makes the directory, not the OK button. complete the install.</li>
</ul>

## Step 4:

When it gets back to the main Frugalpup window.
<ul>
  <li>Select the boot button.</li>
  <li>Select the location of the frugal install, on the internal drive. (usually this is already selected and you just have to click on OK)</li>
  <li>Select the small 300MB 1st partition, as location to install the boot loader. (may need to scroll the selection window)</li>
  <li>Select the boot loader type:</li>
    <li>UEFI </li>
    <li>mbr ->legacy bios boot UEFI</li>
    <li>both</li>
</ul>

You can install the UEFI for UEFI computers.
mbr for legacy bios computers.
both, to boot anything.

The UEFI or both will also install the needed files, to support secure boot enabled in UEFI.

When you first boot the internal drive, on a UEFI computer, with secure boot enabled.
A process will start, to allow you to install the Puppy security key, to the computer.
It will add this Puppy key, to the other ones, loaded on the computer.

<b>Note:</b>
<ul>
  <li>
    I did have one computer, that would not boot from install on the internal drive, if secure boot was disabled.
    So had to make it enabled.
    But no problem, installed the UEFI type boot loader, and it provided needed stuff to install needed Puppy security key.
  </li>
  <li>
  To put more frugal installs on the same drive.
  Run Frugalpup Installer.
  Do the complete Frugalpup Installer process again, for the new Puppy version.
  When you run the boot loader install.
  It will make boot menu entries, for all installs it finds, on the drive.
  </li>
</ul>



## Install wifi broadcom for macbook air 2014


<code>sudo apt-get install broadcom-sta-source broadcom-sta-dkms broadcom-sta-common </code>

## Download Puppy linux from here:

https://forum.puppylinux.com/puppy-linux-collection

## List of software I need on Puppy linux

<ul>
  <li>Install Flatpak </li>
  <li>Install Anki from Flatpak</li>
  <li>Install LocalSend</li> 
</ul>

## Reference

This is the information I found it from Puppy linux forum, I posted here for my note.

URL is here: https://www.forum.puppylinux.com/viewtopic.php?p=79229&hilit=macbook+efi#p79229
