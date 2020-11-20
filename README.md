## Getting Started:


###### Description

CA Privileged Access Manager (CA PAM) is a proven solution for privileged access management in physical, virtual and cloud environments. CA PAM enhances security by protecting sensitive administrative credentials such as root and administrator passwords, controlling privileged user access, proactively enforcing policies and monitoring and recording privileged user activity across all IT resources.

With this Action Pack you can store in CA PAM the credentials that Automic One Automation platform requires to execute IT operations in target systems. Credentials will be fetched at runtime during the execution of your Automic workflows.

This way, you do not need to hardcode in Automic the credentials of the target systems, data is not duplicated. Flexibility and security are increased.
		
###### Actions

1. Get Credentials

###### Compatibility

1. Java 1.7 or higher
1. Microsoft Powershell 3

###### Prerequisite:

1. Automation Engine should be installed.
2. Automic Package Manager should be installed.
3. ITPA Shared Action Pack should be installed.
4. cspmclient-3.2.jar
5. Java 1.7 or higher
6. Maven

###### Steps to install action pack source code:

1. Clone the code to your machine.
2. Go to the package directory.
3. Get the cspmclient-3.2.jar 
4. Go to the pom.xml directory.(source/tools/)
    1. put cspmclient-3.2.jar in the "/capam_lib/capam/cspmclient/3.2/".
    2. Open the terminal and run the maven package command.
       Example: **mvn clean package -DskipTests -s settings.xml**
    
5. Run the command apm upload in the directory which contains package.yml (source/):
Ex. **apm upload -force -u <Name>/<Department> -c <Client-id> -H <Host> -pw <Password> -S AUTOMIC -y -ia -ru**


###### Package/Action Documentation

Please refer to the link for [package documentation](source/ae/DOCUMENTATION/PCK.AUTOMIC_CA_PAM.PUB.DOC.xml)

###### Third party licenses:

The third-party library and license document reference.[Third party licenses](source/ae/DOCUMENTATION/PCK.AUTOMIC_CA_PAM.PUB.LICENSES.xml)

###### Useful References

1. [About Packs and Plug-ins](https://docs.automic.com/documentation/webhelp/english/AA/12.3/DOCU/12.3/Automic%20Automation%20Guides/help.htm#PluginManager/PM_AboutPacksandPlugins.htm?Highlight=Action%20packs)
2. [Working with Packs and Plug-ins](https://docs.automic.com/documentation/webhelp/english/AA/12.3/DOCU/12.3/Automic%20Automation%20Guides/help.htm#PluginManager/PM_WorkingWith.htm#link10)
3. [Actions and Action Packs](https://docs.automic.com/documentation/webhelp/english/AA/12.3/DOCU/12.3/Automic%20Automation%20Guides/help.htm#_Common/ReleaseHighlights/RH_Plugin_PackageManager.htm?Highlight=Action%20packs)
4. [PACKS Compatibility Mode](https://docs.automic.com/documentation/webhelp/english/AA/12.3/DOCU/12.3/Automic%20Automation%20Guides/help.htm#AWA/Variables/UC_CLIENT_SETTINGS/UC_CLIENT_PACKS_COMPATIBILITY_MODE.htm?Highlight=Action%20packs)
5. [Working with actions](https://docs.automic.com/documentation/webhelp/english/AA/12.3/DOCU/12.3/Automic%20Automation%20Guides/help.htm#ActionBuilder/AB_WorkingWith.htm#link4)
6. [Installing and Configuring the Action Builder](https://docs.automic.com/documentation/webhelp/english/AA/12.3/DOCU/12.3/Automic%20Automation%20Guides/help.htm#ActionBuilder/install_configure_plugins_AB.htm?Highlight=Action%20packs)

###### Distribution: 

In the distribution process, we can download the existing or updated action package from the Automation Engine by using the apm build command.
Example: **apm build -y -H AE_HOST -c 106 -u TEST/TEST -pw password -d /directory/ -o zip -v action_pack_name**
			
			
###### Copyright and License: 

Broadcom does not support, maintain or warrant Solutions, Templates, Actions and any other content published on the Community and is subject to Broadcom Community [Terms and Conditions](https://community.broadcom.com/termsandconditions)

###### Questions or Need Help? 

Join the [Automic Community Integrations](https://community.broadcom.com/communities/community-home?CommunityKey=83e49dd4-b93e-464a-a343-2bb1e51c13ec) to discuss this integration.
