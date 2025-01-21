---
layout: post
title:  "Windows logs"
categories: forensics windows logs
---
# Windows Logs 

Windows 2000/XP and Windows Server 2003
512 - Windows NT is starting up <br>
513 - Windows is shutting down <br>
514 - An authentication package has been loaded by the Local Security Authority<br>
515 - A trusted logon process has registered with the Local Security Authority<br>
516 - Internal resources allocated for the queuing of audit messages have been exhausted, leading to the loss of some audits<br>
517 - The audit log was cleared<br>
518 - A notification package has been loaded by the Security Account Manager<br>
519 - A process is using an invalid local procedure call (LPC) port<br>
520 - The system time was changed<br>
521 - Unable to log events to security log<br>
528 - Successful Logon<br>
529 - Logon Failure - Unknown user name or bad password<br>
530 - Logon Failure - Account logon time restriction violation<br>
531 - Logon Failure - Account currently disabled<br>
532 - Logon Failure - The specified user account has expired<br>
533 - Logon Failure - User not allowed to logon at this computer<br>
534 - Logon Failure - The user has not been granted the requested logon type at this machine<br>
535 - Logon Failure - The specified account's password has expired<br>
536 - Logon Failure - The NetLogon component is not active<br>
537 - Logon failure - The logon attempt failed for other reasons.<br>
538 - User Logoff<br>
539 - Logon Failure - Account locked out<br>
540 - Successful Network Logon<br>
551 - User initiated logoff<br>
552 - Logon attempt using explicit credentials<br>
560 - Object Open<br>
561 - Handle Allocated<br>
562 - Handle Closed<br>
563 - Object Open for Delete<br>
564 - Object Deleted<br>
565 - Object Open (Active Directory)<br>
566 - Object Operation (Active Directory)<br>
567 - Object Access Attempt<br>
576 - Special privileges assigned to new logon<br>
577 - Privileged Service Called<br>
578 - Privileged object operation<br>
592 - A new process has been created<br>
593 - A process has exited<br>
594 - A handle to an object has been duplicated<br>
595 - Indirect access to an object has been obtained<br>
596 - Backup of data protection master key<br>
600 - A process was assigned a primary token<br>
601 - Attempt to install service<br>
602 - Scheduled Task created<br>
608 - User Right Assigned<br>
609 - User Right Removed<br>
610 - New Trusted Domain<br>
611 - Removing Trusted Domain<br>
612 - Audit Policy Change<br>
613 - IPSec policy agent started<br>
614 - IPSec policy agent disabled<br>
615 - IPSEC PolicyAgent Service<br>
616 - IPSec policy agent encountered a potentially serious failure.<br>
617 - Kerberos Policy Changed<br>
618 - Encrypted Data Recovery Policy Changed<br>
619 - Quality of Service Policy Changed<br>
620 - Trusted Domain Information Modified<br>
621 - System Security Access Granted<br>
622 - System Security Access Removed<br>
623 - Per User Audit Policy was refreshed<br>
624 - User Account Created<br>
625 - User Account Type Changed<br>
626 - User Account Enabled<br>
627 - Change Password Attempt<br>
628 - User Account password set<br>
629 - User Account Disabled<br>
630 - User Account Deleted<br>
631 - Security Enabled Global Group Created<br>
632 - Security Enabled Global Group Member Added<br>
633 - Security Enabled Global Group Member Removed<br>
634 - Security Enabled Global Group Deleted<br>
635 - Security Enabled Local Group Created<br>
636 - Security Enabled Local Group Member Added<br>
637 - Security Enabled Local Group Member Removed<br>
638 - Security Enabled Local Group Deleted<br>
639 - Security Enabled Local Group Changed<br>
640 - General Account Database Change<br>
641 - Security Enabled Global Group Changed<br>
642 - User Account Changed<br>
643 - Domain Policy Changed<br>
644 - User Account Locked Out<br>
645 - Computer Account Created<br>
646 - Computer Account Changed<br>
647 - Computer Account Deleted<br>
648 - Security Disabled Local Group Created<br>
649 - Security Disabled Local Group Changed<br>
650 - Security Disabled Local Group Member Added<br>
651 - Security Disabled Local Group Member Removed<br>
652 - Security Disabled Local Group Deleted<br>
653 - Security Disabled Global Group Created<br>
654 - Security Disabled Global Group Changed<br>
655 - Security Disabled Global Group Member Added<br>
656 - Security Disabled Global Group Member Removed<br>
657 - Security Disabled Global Group Deleted<br>
658 - Security Enabled Universal Group Created<br>
659 - Security Enabled Universal Group Changed<br>
660 - Security Enabled Universal Group Member Added<br>
661 - Security Enabled Universal Group Member Removed<br>
662 - Security Enabled Universal Group Deleted<br>
663 - Security Disabled Universal Group Created<br>
664 - Security Disabled Universal Group Changed<br>
665 - Security Disabled Universal Group Member Added<br>
666 - Security Disabled Universal Group Member Removed<br>
667 - Security Disabled Universal Group Deleted<br>
668 - Group Type Changed<br>
669 - Add SID History<br>
670 - Add SID History<br>
671 - User Account Unlocked<br>
672 - Authentication Ticket Granted<br>
673 - Service Ticket Granted<br>
674 - Ticket Granted Renewed<br>
675 - Pre-authentication failed<br>
676 - Authentication Ticket Request Failed<br>
677 - Service Ticket Request Failed<br>
678 - Account Mapped for Logon by<br>
679 - The name: %2 could not be mapped for logon by: %1<br>
680 - Account Used for Logon by<br>
681 - The logon to account: %2 by: %1 from workstation: %3 failed.<br>
682 - Session reconnected to winstation<br>
683 - Session disconnected from winstation<br>
684 - Set ACLs of members in administrators groups<br>
685 - Account Name Changed<br>
686 - Password of the following user accessed<br>
687 - Basic Application Group Created<br>
688 - Basic Application Group Changed<br>
689 - Basic Application Group Member Added<br>
690 - Basic Application Group Member Removed<br>
691 - Basic Application Group Non-Member Added<br>
692 - Basic Application Group Non-Member Removed<br>
693 - Basic Application Group Deleted<br>
694 - LDAP Query Group Created<br>
695 - LDAP Query Group Changed<br>
696 - LDAP Query Group Deleted<br>
697 - Password Policy Checking API is called<br>
806 - Per User Audit Policy was refreshed<br>
807 - Per user auditing policy set for user<br>
808 - A security event source has attempted to register<br>
809 - A security event source has attempted to unregister<br>
848 - The following policy was active when the Windows Firewall started<br>
849 - An application was listed as an exception when the Windows Firewall started<br>
850 - A port was listed as an exception when the Windows Firewall started<br>
851 - A change has been made to the Windows Firewall application exception list<br>
852 - A change has been made to the Windows Firewall port exception list<br>
853 - The Windows Firewall operational mode has changed<br>
854 - The Windows Firewall logging settings have changed<br>
855 - A Windows Firewall ICMP setting has changed<br>
856 - The Windows Firewall setting to allow unicast responses to multicast/broadcast traffic has changed<br>
857 - The Windows Firewall setting to allow remote administration, allowing port TCP 135 and DCOM/RPC, has changed<br>
858 - Windows Firewall group policy settings have been applied<br>
859 - The Windows Firewall group policy settings have been removed<br>
860 - The Windows Firewall has switched the active policy profile<br>
861 - The Windows Firewall has detected an application listening for incoming traffic<br>
Windows 7/Vista/8/10, Windows Server 2008/2012R2/2016/2019<br>
1100 - The event logging service has shut down<br>
1101 - Audit events have been dropped by the transport.<br>
1102 - The audit log was cleared<br>
1104 - The security Log is now full<br>
1105 - Event log automatic backup<br>
1108 - The event logging service encountered an error<br>
4608 - Windows is starting up<br>
4609 - Windows is shutting down<br>
4610 - An authentication package has been loaded by the Local Security Authority<br>
4611 - A trusted logon process has been registered with the Local Security Authority<br>
4612 - Internal resources allocated for the queuing of audit messages have been exhausted, leading to the loss of some audits.<br>
4614 - A notification package has been loaded by the Security Account Manager.<br>
4615 - Invalid use of LPC port<br>
4616 - The system time was changed.<br>
4618 - A monitored security event pattern has occurred<br>
4621 - Administrator recovered system from CrashOnAuditFail<br>
4622 - A security package has been loaded by the Local Security Authority.<br>
4624 - An account was successfully logged on<br>
4625 - An account failed to log on<br>
4626 - User/Device claims information<br>
4627 - Group membership information.<br>
4634 - An account was logged off<br>
4646 - IKE DoS-prevention mode started<br>
4647 - User initiated logoff<br>
4648 - A logon was attempted using explicit credentials<br>
4649 - A replay attack was detected<br>
4650 - An IPsec Main Mode security association was established<br>
4651 - An IPsec Main Mode security association was established<br>
4652 - An IPsec Main Mode negotiation failed<br>
4653 - An IPsec Main Mode negotiation failed<br>
4654 - An IPsec Quick Mode negotiation failed<br>
4655 - An IPsec Main Mode security association ended<br>
4656 - A handle to an object was requested<br>
4657 - A registry value was modified<br>
4658 - The handle to an object was closed<br>
4659 - A handle to an object was requested with intent to delete<br>
4660 - An object was deleted<br>
4661 - A handle to an object was requested<br>
4662 - An operation was performed on an object<br>
4663 - An attempt was made to access an object<br>
4664 - An attempt was made to create a hard link<br>
4665 - An attempt was made to create an application client context.<br>
4666 - An application attempted an operation<br>
4667 - An application client context was deleted<br>
4668 - An application was initialized<br>
4670 - Permissions on an object were changed<br>
4671 - An application attempted to access a blocked ordinal through the TBS<br>
4672 - Special privileges assigned to new logon<br>
4673 - A privileged service was called<br>
4674 - An operation was attempted on a privileged object<br>
4675 - SIDs were filtered<br>
4688 - A new process has been created<br>
4689 - A process has exited<br>
4690 - An attempt was made to duplicate a handle to an object<br>
4691 - Indirect access to an object was requested<br>
4692 - Backup of data protection master key was attempted<br>
4693 - Recovery of data protection master key was attempted<br>
4694 - Protection of auditable protected data was attempted<br>
4695 - Unprotection of auditable protected data was attempted<br>
4696 - A primary token was assigned to process<br>
4697 - A service was installed in the system<br>
4698 - A scheduled task was created<br>
4699 - A scheduled task was deleted<br>
4700 - A scheduled task was enabled<br>
4701 - A scheduled task was disabled<br>
4702 - A scheduled task was updated<br>
4703 - A token right was adjusted<br>
4704 - A user right was assigned<br>
4705 - A user right was removed<br>
4706 - A new trust was created to a domain<br>
4707 - A trust to a domain was removed<br>
4709 - IPsec Services was started<br>
4710 - IPsec Services was disabled<br>
4711 - PAStore Engine (1%)<br>
4712 - IPsec Services encountered a potentially serious failure<br>
4713 - Kerberos policy was changed<br>
4714 - Encrypted data recovery policy was changed<br>
4715 - The audit policy (SACL) on an object was changed<br>
4716 - Trusted domain information was modified<br>
4717 - System security access was granted to an account<br>
4718 - System security access was removed from an account<br>
4719 - System audit policy was changed<br>
4720 - A user account was created<br>
4722 - A user account was enabled<br>
4723 - An attempt was made to change an account's password<br>
4724 - An attempt was made to reset an accounts password<br>
4725 - A user account was disabled<br>
4726 - A user account was deleted<br>
4727 - A security-enabled global group was created<br>
4728 - A member was added to a security-enabled global group<br>
4729 - A member was removed from a security-enabled global group<br>
4730 - A security-enabled global group was deleted<br>
4731 - A security-enabled local group was created<br>
4732 - A member was added to a security-enabled local group<br>
4733 - A member was removed from a security-enabled local group<br>
4734 - A security-enabled local group was deleted<br>
4735 - A security-enabled local group was changed<br>
4737 - A security-enabled global group was changed<br>
4738 - A user account was changed<br>
4739 - Domain Policy was changed<br>
4740 - A user account was locked out<br>
4741 - A computer account was created<br>
4742 - A computer account was changed<br>
4743 - A computer account was deleted<br>
4744 - A security-disabled local group was created<br>
4745 - A security-disabled local group was changed<br>
4746 - A member was added to a security-disabled local group<br>
4747 - A member was removed from a security-disabled local group<br>
4748 - A security-disabled local group was deleted<br>
4749 - A security-disabled global group was created<br>
4750 - A security-disabled global group was changed<br>
4751 - A member was added to a security-disabled global group<br>
4752 - A member was removed from a security-disabled global group<br>
4753 - A security-disabled global group was deleted<br>
4754 - A security-enabled universal group was created<br>
4755 - A security-enabled universal group was changed<br>
4756 - A member was added to a security-enabled universal group<br>
4757 - A member was removed from a security-enabled universal group<br>
4758 - A security-enabled universal group was deleted<br>
4759 - A security-disabled universal group was created<br>
4760 - A security-disabled universal group was changed<br>
4761 - A member was added to a security-disabled universal group<br>
4762 - A member was removed from a security-disabled universal group<br>
4763 - A security-disabled universal group was deleted<br>
4764 - A groups type was changed<br>
4765 - SID History was added to an account<br>
4766 - An attempt to add SID History to an account failed<br>
4767 - A user account was unlocked<br>
4768 - A Kerberos authentication ticket (TGT) was requested<br>
4769 - A Kerberos service ticket was requested<br>
4770 - A Kerberos service ticket was renewed<br>
4771 - Kerberos pre-authentication failed<br>
4772 - A Kerberos authentication ticket request failed<br>
4773 - A Kerberos service ticket request failed<br>
4774 - An account was mapped for logon<br>
4775 - An account could not be mapped for logon<br>
4776 - The domain controller attempted to validate the credentials for an account<br>
4777 - The domain controller failed to validate the credentials for an account<br>
4778 - A session was reconnected to a Window Station<br>
4779 - A session was disconnected from a Window Station<br>
4780 - The ACL was set on accounts which are members of administrators groups<br>
4781 - The name of an account was changed<br>
4782 - The password hash an account was accessed<br>
4783 - A basic application group was created<br>
4784 - A basic application group was changed<br>
4785 - A member was added to a basic application group<br>
4786 - A member was removed from a basic application group<br>
4787 - A non-member was added to a basic application group<br>
4788 - A non-member was removed from a basic application group..<br>
4789 - A basic application group was deleted<br>
4790 - An LDAP query group was created<br>
4791 - A basic application group was changed<br>
4792 - An LDAP query group was deleted<br>
4793 - The Password Policy Checking API was called<br>
4794 - An attempt was made to set the Directory Services Restore Mode administrator password<br>
4797 - An attempt was made to query the existence of a blank password for an account<br>
4798 - A user's local group membership was enumerated.<br>
4799 - A security-enabled local group membership was enumerated<br>
4800 - The workstation was locked<br>
4801 - The workstation was unlocked<br>
4802 - The screen saver was invoked<br>
4803 - The screen saver was dismissed<br>
4816 - RPC detected an integrity violation while decrypting an incoming message<br>
4817 - Auditing settings on object were changed.<br>
4818 - Proposed Central Access Policy does not grant the same access permissions as the current Central Access Policy<br>
4819 - Central Access Policies on the machine have been changed<br>
4820 - A Kerberos Ticket-granting-ticket (TGT) was denied because the device does not meet the access control restrictions<br>
4821 - A Kerberos service ticket was denied because the user, device, or both does not meet the access control restrictions<br>
4822 - NTLM authentication failed because the account was a member of the Protected User group<br>
4823 - NTLM authentication failed because access control restrictions are required<br>
4824 - Kerberos preauthentication by using DES or RC4 failed because the account was a member of the Protected User group<br>
4825 - A user was denied the access to Remote Desktop. By default, users are allowed to connect only if they are members of the Remote Desktop Users group or Administrators group<br>
4826 - Boot Configuration Data loaded<br>
4830 - SID History was removed from an account<br>
4864 - A namespace collision was detected<br>
4865 - A trusted forest information entry was added<br>
4866 - A trusted forest information entry was removed<br>
4867 - A trusted forest information entry was modified<br>
4868 - The certificate manager denied a pending certificate request<br>
4869 - Certificate Services received a resubmitted certificate request<br>
4870 - Certificate Services revoked a certificate<br>
4871 - Certificate Services received a request to publish the certificate revocation list (CRL)<br>
4872 - Certificate Services published the certificate revocation list (CRL)<br>
4873 - A certificate request extension changed<br>
4874 - One or more certificate request attributes changed.<br>
4875 - Certificate Services received a request to shut down<br>
4876 - Certificate Services backup started<br>
4877 - Certificate Services backup completed<br>
4878 - Certificate Services restore started<br>
4879 - Certificate Services restore completed<br>
4880 - Certificate Services started<br>
4881 - Certificate Services stopped<br>
4882 - The security permissions for Certificate Services changed<br>
4883 - Certificate Services retrieved an archived key<br>
4884 - Certificate Services imported a certificate into its database<br>
4885 - The audit filter for Certificate Services changed<br>
4886 - Certificate Services received a certificate request<br>
4887 - Certificate Services approved a certificate request and issued a certificate<br>
4888 - Certificate Services denied a certificate request<br>
4889 - Certificate Services set the status of a certificate request to pending<br>
4890 - The certificate manager settings for Certificate Services changed.<br>
4891 - A configuration entry changed in Certificate Services<br>
4892 - A property of Certificate Services changed<br>
4893 - Certificate Services archived a key<br>
4894 - Certificate Services imported and archived a key<br>
4895 - Certificate Services published the CA certificate to Active Directory Domain Services<br>
4896 - One or more rows have been deleted from the certificate database<br>
4897 - Role separation enabled<br>
4898 - Certificate Services loaded a template<br>
4899 - A Certificate Services template was updated<br>
4900 - Certificate Services template security was updated<br>
4902 - The Per-user audit policy table was created<br>
4904 - An attempt was made to register a security event source<br>
4905 - An attempt was made to unregister a security event source<br>
4906 - The CrashOnAuditFail value has changed<br>
4907 - Auditing settings on object were changed<br>
4908 - Special Groups Logon table modified<br>
4909 - The local policy settings for the TBS were changed<br>
4910 - The group policy settings for the TBS were changed<br>
4911 - Resource attributes of the object were changed<br>
4912 - Per User Audit Policy was changed<br>
4913 - Central Access Policy on the object was changed<br>
4928 - An Active Directory replica source naming context was established<br>
4929 - An Active Directory replica source naming context was removed<br>
4930 - An Active Directory replica source naming context was modified<br>
4931 - An Active Directory replica destination naming context was modified<br>
4932 - Synchronization of a replica of an Active Directory naming context has begun<br>
4933 - Synchronization of a replica of an Active Directory naming context has ended<br>
4934 - Attributes of an Active Directory object were replicated<br>
4935 - Replication failure begins<br>
4936 - Replication failure ends<br>
4937 - A lingering object was removed from a replica<br>
4944 - The following policy was active when the Windows Firewall started<br>
4945 - A rule was listed when the Windows Firewall started<br>
4946 - A change has been made to Windows Firewall exception list. A rule was added<br>
4947 - A change has been made to Windows Firewall exception list. A rule was modified<br>
4948 - A change has been made to Windows Firewall exception list. A rule was deleted<br>
4949 - Windows Firewall settings were restored to the default values<br>
4950 - A Windows Firewall setting has changed<br>
4951 - A rule has been ignored because its major version number was not recognized by Windows Firewall<br>
4952 - Parts of a rule have been ignored because its minor version number was not recognized by Windows Firewall<br>
4953 - A rule has been ignored by Windows Firewall because it could not parse the rule<br>
4954 - Windows Firewall Group Policy settings has changed. The new settings have been applied<br>
4956 - Windows Firewall has changed the active profile<br>
4957 - Windows Firewall did not apply the following rule<br>
4958 - Windows Firewall did not apply the following rule because the rule referred to items not configured on this computer<br>
4960 - IPsec dropped an inbound packet that failed an integrity check<br>
4961 - IPsec dropped an inbound packet that failed a replay check<br>
4962 - IPsec dropped an inbound packet that failed a replay check<br>
4963 - IPsec dropped an inbound clear text packet that should have been secured<br>
4964 - Special groups have been assigned to a new logon<br>
4965 - IPsec received a packet from a remote computer with an incorrect Security Parameter Index (SPI).<br>
4976 - During Main Mode negotiation, IPsec received an invalid negotiation packet.<br>
4977 - During Quick Mode negotiation, IPsec received an invalid negotiation packet.<br>
4978 - During Extended Mode negotiation, IPsec received an invalid negotiation packet.<br>
4979 - IPsec Main Mode and Extended Mode security associations were established.<br>
4980 - IPsec Main Mode and Extended Mode security associations were established<br>
4981 - IPsec Main Mode and Extended Mode security associations were established<br>
4982 - IPsec Main Mode and Extended Mode security associations were established<br>
4983 - An IPsec Extended Mode negotiation failed<br>
4984 - An IPsec Extended Mode negotiation failed<br>
4985 - The state of a transaction has changed<br>
5024 - The Windows Firewall Service has started successfully<br>
5025 - The Windows Firewall Service has been stopped<br>
5027 - The Windows Firewall Service was unable to retrieve the security policy from the local storage<br>
5028 - The Windows Firewall Service was unable to parse the new security policy.<br>
5029 - The Windows Firewall Service failed to initialize the driver<br>
5030 - The Windows Firewall Service failed to start<br>
5031 - The Windows Firewall Service blocked an application from accepting incoming connections on the network.<br>
5032 - Windows Firewall was unable to notify the user that it blocked an application from accepting incoming connections on the network<br>
5033 - The Windows Firewall Driver has started successfully<br>
5034 - The Windows Firewall Driver has been stopped<br>
5035 - The Windows Firewall Driver failed to start<br>
5037 - The Windows Firewall Driver detected critical runtime error. Terminating<br>
5038 - Code integrity determined that the image hash of a file is not valid<br>
5039 - A registry key was virtualized.<br>
5040 - A change has been made to IPsec settings. An Authentication Set was added.<br>
5041 - A change has been made to IPsec settings. An Authentication Set was modified<br>
5042 - A change has been made to IPsec settings. An Authentication Set was deleted<br>
5043 - A change has been made to IPsec settings. A Connection Security Rule was added<br>
5044 - A change has been made to IPsec settings. A Connection Security Rule was modified<br>
5045 - A change has been made to IPsec settings. A Connection Security Rule was deleted<br>
5046 - A change has been made to IPsec settings. A Crypto Set was added<br>
5047 - A change has been made to IPsec settings. A Crypto Set was modified<br>
5048 - A change has been made to IPsec settings. A Crypto Set was deleted<br>
5049 - An IPsec Security Association was deleted<br>
5050 - An attempt to programmatically disable the Windows Firewall using a call to INetFwProfile.FirewallEnabled(FALSE
5051 - A file was virtualized<br>
5056 - A cryptographic self test was performed<br>
5057 - A cryptographic primitive operation failed<br>
5058 - Key file operation<br>
5059 - Key migration operation<br>
5060 - Verification operation failed<br>
5061 - Cryptographic operation<br>
5062 - A kernel-mode cryptographic self test was performed<br>
5063 - A cryptographic provider operation was attempted<br>
5064 - A cryptographic context operation was attempted<br>
5065 - A cryptographic context modification was attempted<br>
5066 - A cryptographic function operation was attempted<br>
5067 - A cryptographic function modification was attempted<br>
5068 - A cryptographic function provider operation was attempted<br>
5069 - A cryptographic function property operation was attempted<br>
5070 - A cryptographic function property operation was attempted<br>
5071 - Key access denied by Microsoft key distribution service<br>
5120 - OCSP Responder Service Started<br>
5121 - OCSP Responder Service Stopped<br>
5122 - A Configuration entry changed in the OCSP Responder Service<br>
5123 - A configuration entry changed in the OCSP Responder Service<br>
5124 - A security setting was updated on OCSP Responder Service<br>
5125 - A request was submitted to OCSP Responder Service<br>
5126 - Signing Certificate was automatically updated by the OCSP Responder Service<br>
5127 - The OCSP Revocation Provider successfully updated the revocation information<br>
5136 - A directory service object was modified<br>
5137 - A directory service object was created<br>
5138 - A directory service object was undeleted<br>
5139 - A directory service object was moved<br>
5140 - A network share object was accessed<br>
5141 - A directory service object was deleted<br>
5142 - A network share object was added.<br>
5143 - A network share object was modified<br>
5144 - A network share object was deleted.<br>
5145 - A network share object was checked to see whether client can be granted desired access<br>
5146 - The Windows Filtering Platform has blocked a packet<br>
5147 - A more restrictive Windows Filtering Platform filter has blocked a packet<br>
5148 - The Windows Filtering Platform has detected a DoS attack and entered a defensive mode<br>
5149 - The DoS attack has subsided and normal processing is being resumed.<br>
5150 - The Windows Filtering Platform has blocked a packet.<br>
5151 - A more restrictive Windows Filtering Platform filter has blocked a packet.<br>
5152 - The Windows Filtering Platform blocked a packet<br>
5153 - A more restrictive Windows Filtering Platform filter has blocked a packet<br>
5154 - The Windows Filtering Platform has permitted an application or service to listen on a port for incoming connections<br>
5155 - The Windows Filtering Platform has blocked an application or service from listening on a port for incoming connections<br>
5156 - The Windows Filtering Platform has allowed a connection<br>
5157 - The Windows Filtering Platform has blocked a connection<br>
5158 - The Windows Filtering Platform has permitted a bind to a local port<br>
5159 - The Windows Filtering Platform has blocked a bind to a local port<br>
5168 - Spn check for SMB/SMB2 fails.<br>
5169 - A directory service object was modified<br>
5170 - A directory service object was modified during a background cleanup task<br>
5376 - Credential Manager credentials were backed up<br>
5377 - Credential Manager credentials were restored from a backup<br>
5378 - The requested credentials delegation was disallowed by policy<br>
5379 - Credential Manager credentials were read<br>
5380 - Vault Find Credential<br>
5381 - Vault credentials were read<br>
5382 - Vault credentials were read<br>
5440 - The following callout was present when the Windows Filtering Platform Base Filtering Engine started<br>
5441 - The following filter was present when the Windows Filtering Platform Base Filtering Engine started<br>
5442 - The following provider was present when the Windows Filtering Platform Base Filtering Engine started<br>
5443 - The following provider context was present when the Windows Filtering Platform Base Filtering Engine started<br>
5444 - The following sub-layer was present when the Windows Filtering Platform Base Filtering Engine started<br>
5446 - A Windows Filtering Platform callout has been changed<br>
5447 - A Windows Filtering Platform filter has been changed<br>
5448 - A Windows Filtering Platform provider has been changed<br>
5449 - A Windows Filtering Platform provider context has been changed<br>
5450 - A Windows Filtering Platform sub-layer has been changed<br>
5451 - An IPsec Quick Mode security association was established<br>
5452 - An IPsec Quick Mode security association ended<br>
5453 - An IPsec negotiation with a remote computer failed because the IKE and AuthIP IPsec Keying Modules (IKEEXT) service is not started<br>
5456 - PAStore Engine applied Active Directory storage IPsec policy on the computer<br>
5457 - PAStore Engine failed to apply Active Directory storage IPsec policy on the computer<br>
5458 - PAStore Engine applied locally cached copy of Active Directory storage IPsec policy on the computer<br>
5459 - PAStore Engine failed to apply locally cached copy of Active Directory storage IPsec policy on the computer
5460 - PAStore Engine applied local registry storage IPsec policy on the computer<br>
5461 - PAStore Engine failed to apply local registry storage IPsec policy on the computer<br>
5462 - PAStore Engine failed to apply some rules of the active IPsec policy on the computer<br>
5463 - PAStore Engine polled for changes to the active IPsec policy and detected no changes<br>
5464 - PAStore Engine polled for changes to the active IPsec policy, detected changes, and applied them to IPsec Services<br>
5465 - PAStore Engine received a control for forced reloading of IPsec policy and processed the control successfully<br>
5466 - PAStore Engine polled for changes to the Active Directory IPsec policy, determined that Active Directory cannot be reached, and will use the cached copy of the Active Directory IPsec policy instead<br>
5467 - PAStore Engine polled for changes to the Active Directory IPsec policy, determined that Active Directory can be reached, and found no changes to the policy<br>
5468 - PAStore Engine polled for changes to the Active Directory IPsec policy, determined that Active Directory can be reached, found changes to the policy, and applied those changes<br>
5471 - PAStore Engine loaded local storage IPsec policy on the computer<br>
5472 - PAStore Engine failed to load local storage IPsec policy on the computer<br>
5473 - PAStore Engine loaded directory storage IPsec policy on the computer<br>
5474 - PAStore Engine failed to load directory storage IPsec policy on the computer<br>
5477 - PAStore Engine failed to add quick mode filter<br>
5478 - IPsec Services has started successfully<br>
5479 - IPsec Services has been shut down successfully<br>
5480 - IPsec Services failed to get the complete list of network interfaces on the computer<br>
5483 - IPsec Services failed to initialize RPC server. IPsec Services could not be started<br>
5484 - IPsec Services has experienced a critical failure and has been shut down<br>
5485 - IPsec Services failed to process some IPsec filters on a plug-and-play event for network interfaces<br>
5632 - A request was made to authenticate to a wireless network<br>
5633 - A request was made to authenticate to a wired network<br>
5712 - A Remote Procedure Call (RPC) was attempted<br>
5888 - An object in the COM+ Catalog was modified<br>
5889 - An object was deleted from the COM+ Catalog<br>
5890 - An object was added to the COM+ Catalog<br>
6144 - Security policy in the group policy objects has been applied successfully<br>
6145 - One or more errors occured while processing security policy in the group policy objects<br>
6272 - Network Policy Server granted access to a user<br>
6273 - Network Policy Server denied access to a user<br>
6274 - Network Policy Server discarded the request for a user<br>
6275 - Network Policy Server discarded the accounting request for a user<br>
6276 - Network Policy Server quarantined a user<br>
6277 - Network Policy Server granted access to a user but put it on probation because the host did not meet the defined health policy<br>
6278 - Network Policy Server granted full access to a user because the host met the defined health policy<br>
6279 - Network Policy Server locked the user account due to repeated failed authentication attempts<br>
6280 - Network Policy Server unlocked the user account<br>
6281 - Code Integrity determined that the page hashes of an image file are not valid...<br>
6400 - BranchCache: Received an incorrectly formatted response while discovering availability of content.<br>
6401 - BranchCache: Received invalid data from a peer. Data discarded.<br>
6402 - BranchCache: The message to the hosted cache offering it data is incorrectly formatted.<br>
6403 - BranchCache: The hosted cache sent an incorrectly formatted response to the client's message to offer it data.<br>
6404 - BranchCache: Hosted cache could not be authenticated using the provisioned SSL certificate.<br>
6405 - BranchCache: %2 instance(s) of event id %1 occurred.<br>
6406 - %1 registered to Windows Firewall to control filtering for the following:
6407 - %1<br>
6408 - Registered product %1 failed and Windows Firewall is now controlling the filtering for %2.<br>
6409 - BranchCache: A service connection point object could not be parsed<br>
6410 - Code integrity determined that a file does not meet the security requirements to load into a process. This could be due to the use of shared sections or other issues<br>
6416 - A new external device was recognized by the system.<br>
6417 - The FIPS mode crypto selftests succeeded<br>
6418 - The FIPS mode crypto selftests failed<br>
6419 - A request was made to disable a device<br>
6420 - A device was disabled<br>
6421 - A request was made to enable a device<br>
6422 - A device was enabled<br>
6423 - The installation of this device is forbidden by system policy<br>
6424 - The installation of this device was allowed, after having previously been forbidden by policy<br>
8191 - Highest System-Defined Audit Message Value<br>

# References:

https://www.sans.org/cyber-security-courses/windows-forensic-analysis/

https://www.forwarddefense.com/media/attachments/2021/05/15/windows-event-log-analyst-reference.pdf

You can download it for free from this [link] (https://cdn.andreafortuna.org/cheatsheets/Windows_Security_Event_Logs_Cheatsheet.pdf)

Source: https://andreafortuna.org/2019/06/12/windows-security-event-logs-my-own-cheatsheet/
