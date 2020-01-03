

1.LoadTestMaster Project

A simple alien vault app for security perpuse.


2.Information

With AlienApps, you can monitor more of your security posture directly within USM Anywhere, including your cloud services like Office 365 and G Suite. AlienApps also enable you to automate and orchestrate response actions when threats are detected by USM Anywhere, greatly simplifying and accelerating the threat detection and incident response processes.



3.Prerequisites

Before you continue,ensure you meet the following environment:

1.you have installed the latest version of jdk.
2.you have installed intellij idea.
3.you have installed maven tool.
4.you are using linux or mac os machine,windows is not currently supported.
5.you have basic understanding of Springboot.
/home/vinaya/Desktop/loadtest project/README.md.odt

4.How to install the things

1.Installation of jdk latest version.
   1.Download the file.
      Before the file can be downloaded, you must accept the license agreement.
   2.Become root by running su and entering the super-user password.
   
   3.Uninstall any earlier installations of the JDK packages.
    # rpm -e package_name
   4.Install the package.
   # rpm -ivh jdk-8uversion-linux-i586.rpm
      To upgrade a package:
   # rpm -Uvh jdk-8uversion-linux-i586.rpm
  5.Exit the root shell. No need to reboot.
  6.Delete the .rpm file if you want to save disk space.




2.Installation of intellij idea.
 1.Download the latest version of IntelliJ IDEA from the official website.
 2.Open the Terminal (Ctrl + Alt + T) and enter the following command to change the directory.
 cd /opt/
 3.Enter the command given below to extract the IntelliJ IDEA  from ~/Downloads directory. If your downloaded file is in any other directory, replace the last parameter by the actual file path.
 sudo tar -xvzf ~/Downloads/ideaIC-2018.3.2.tar.gz
 4.I prefer to rename the IntelliJ folder unless I have multiple versions of IntelliJ IDEA. If you want the same, enter the following command to remove the version from the folder name.
sudo mv idea-IC-183.4886.37 idea
 5.Open IntelliJ IDEA from the terminal using the following command. Note that there is no sudo in front of the command.
 /opt/idea/bin/idea.sh
6.In the appeared dialog to import existing settings, choose "Do not import settings" if you want a fresh installation. If you already had an IntelliJ IDEA, you can import the previous settings by selecting the first option.



/home/vinaya/Desktop/loadtest project/README.md.odt

7.In the next dialog, you will be asked to select a UI theme. Depending on your preference, select the theme and click Next.







8.Now, you will be provided an option to create a Desktop Entry. I prefer to create the Desktop Entry for all users. Therefore, I select the "For all users..." option and click Next.









9.If you want to launch IntelliJ IDEA from Terminal, creating a launcher script makes your life easier. Depending on your requirement, you can enable this feature.













10.Now you can customize existing plugins. However, I do not find any reason to customize them at this point. So just click Next.












11.At this step, you can install additional plugins. If you are using IntelliJ only for Java development, you can skip this step and click Start Using IntelliJ IDEA.










Once you have clicked the Start Using IntelliJ IDEA button, you may be asked to enter the root password in order to create desktop entries and launcher script.


12.Now, IntelliJ IDEA will open and ready to use. However, you can notice that still, we are running it from the Terminal. Closing IntelliJ IDEA will let you close the Terminal safely.







13.Now search for 'IntelliJ IDEA' in the dashboard and open it.









14.A common problem encountered on IntelliJ IDEA is its default keyboard shortcuts assigned to the Windows environment. This may cause unexpected behaviors of keyboard shortcuts on Linux environment. To fix this problem, open IntelliJ IDEA, go to Settings → Keymap and select "Default for GNOME" in the Keymap




3.Installation of Maven
   1.Download apache-maven-3.6.2-bin.tar.gz binary archive from the official link. This article uses the Maven version 3.6.2. You need to replace the version number by whatever the version you are downloading.

  2.Open the Terminal and change the directory to /opt folder.
   cd /opt
 
  3.Extract the apache-maven archive into the opt directory.
   sudo tar -xvzf ~/Downloads/apache-maven-3.6.2-bin.tar.gz

 4.Edit the /etc/environment file and add the following environment variable:

    M2_HOME="/opt/apache-maven-3.6.2"
 


   also, append the bin directory to the PATH variable:
     /opt/apache-maven-3.6.2/bin


   You can use nano to edit the file in the terminal itself. Execute the following command and modify the content as given below.
      sudo nano /etc/environment


      WARNING: Do not replace your environment file with the following content because you may already have different environment variables which are required by other applications to function properly. Notice the end of PATH variable and the M2_HOME variable.
PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/usr/lib/jvm/jdk-10.0.2/bin:/opt/apache-maven-3.6.2/bin"
JAVA_HOME="/usr/lib/jvm/jdk-10.0.2"
M2_HOME="/opt/apache-maven-3.6.2"

After the modification, press Ctrl + O to save the changes and Ctrl + X to exit nano.

5.Update the mvn command:
sudo update-alternatives --install "/usr/bin/mvn" "mvn" "/opt/apache-maven-3.6.2/bin/mvn" 0
sudo update-alternatives --set mvn /opt/apache-maven-3.6.2/bin/mvn
6.Add Bash completion to mvn so that you can complete complex Maven commands by hitting Tab multiple times.
sudo wget https://raw.github.com/dimaj/maven-bash-completion/master/bash_completion.bash --output-document /etc/bash_completion.d/mvn

7.Logout and login to the computer and check the Maven version using the following command.
mvn --version
If it works, hooray! you have successfully installed the latest Apache Maven on your computer.

5.Steps for how to use the things.

    1.Configure Maven to be able to access repositories.
    
    2.Setup Maven Project for building LoadTestMaster Project.
    
    3.Write the logic inside the LoadTestMaster Project.
    
    4.And write the junit unit test using mockito object,to test the LoadTestMaster Project.
    
    5.Save the project and push it to your github Account.


6.built with.
       
       Maven-Dependency management.

7.Versioning

For the versions available, see the tags on the repository.

8.Authors

See also the list of contributors who participated in this project.

9.Licence

This project is licensed under the MIT License - see the LICENSE.md file for details
