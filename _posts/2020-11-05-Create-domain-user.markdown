---
layout: post
title:  "Create Domain users"
date:   2020-11-04
categories: AD Users
---

Create user for Active Directory

```New-ADUser -name user1 -GivenName user1 -SamAccountName user1 -UserPrincipalName user1@jimmylab.com```

Check user if it is created?

```Get-ADUser user1```

Change password for AD user

```net user user1 Passw0rd! /domain```

when create user, the user is not enabled. Enable user

```Enable-ADAccount -Identify user1```

Add user to Domain Admin group

```Add-ADGroupMember 'Domain Admins' user1```
