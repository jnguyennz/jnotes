---
layout: post
title:  "Setup Lab with AutomatedLab"
date:   2020-11-04
categories: Powershell AutomatedLab Servers
---

**Technical Requirements:**

- Windows Server 2012 R2+/Windows 8.1+
- Administrator Privilege
- Intel VT-x or AMD/V capable CPU
- A reasonable amount of RAM (8GB+)
- Hyper-V


Wow it is easy to setup your own lab with few clicks, save me a lot of time to setup the lab

In this test I am using windows 2019 iso file to create 1 Domain controller and 1 client1 for my lab, you can add more client if you like.

More help from here: https://automatedlab.org/en/latest/

The following are my procedures:

Open powershell with admin and Install automatedlab

```
Install-Module -Name AutomatedLab -AllowClobber

New-LabSourcesFolder
```


Download the windows 2019 iso file at Microsoft evaluation at https://www.microsoft.com/en-us/evalcenter/

Put the iso to C:\LabResources\ISOs

Navigate to C:\Labsources\



Run this commands to setup lab (Name is GettingStarted)


```
Get-LabAvailableOperatingSystem -Path C:\LabSources

New-LabDefinition -Name GettingStarted -DefaultVirtualizationEngine HyperV

Add-LabMachineDefinition -Name DC1 -Memory 1GB -OperatingSystem 'Windows Server 2019 Standard Evaluation' -Roles RootDC -DomainName contoso.com

Add-LabMachineDefinition -Name Client1 -Memory 1GB -OperatingSystem 'Windows Server 2019 Standard Evaluation' -Roles RootDC -DomainName contoso.com

Install-Lab

```

Check the lab after the installation.

```
Show-LabDeploymentSummary
```


Remove lab command:

```
Get-Lab-List

Import-Lab LabName

Remove-Lab
```


Open Hyper-V and enjoy your lab.

![Run Script](/assets/automatedlab-1.png)
