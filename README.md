# What is java ? 

Java is an object-oriented, cross platform, multi-purpose programming language produced by Sun Microsystems. First released in 1995, it was developed to be a machine independent web technology. It was based on C and C++ syntax to make it easy for programmers from those communities to learn. Since then, it has earned a prominent place in the world of computer programming.   

#### Characteristics of Java  

  * **Platform independence :** Many languages are compatible with only one platform. Java was specifically designed so that it would run on any computer, regardless if it was running Windows, Linux, Mac, Unix or any of the other operating systems.   
  * **Simple and easy to use :** Java's creators tried to design it so code could be written efficiently and easily.  
  * **Multi-functional :** Java can produce many applications from command-line programs to applets to Swing windows (basically, sophisticated graphical user interfaces).   
  * **Robust :** Robust simply means strong. Java uses strong memory management. There are lack of pointers that avoids security problem. There is automatic garbage collection in java. There is exception handling and type checking mechanism in java. All these points makes java robust. But the main areas which Java improved were mishandled Exceptions by introducing automatic Garbage Collector and Exception.  
  * **Secure :** When it comes to security, Java is always the first choice. With Java's secure feature it would enables us to develop virus-free systems.  

## The Java Platform  

One thing that distinguished Java from some other languages is its ability to run the same compiled code across multiple operating systems.  

In other languages, the source code (code that is written by the programmer), is compiled by a compiler into an executable file. This file is in machine language, and is intended for a single operating system/processor combination, so the programmer would have to re-compile the program seperately for each new operating system/processor combination.  

Java is different in that it does not compile the code directly into machine language code. Compilation creates bytecode out of the source code. Bytecode generally looks something like this:  

```
a7 f4 73 5a 1b 92 7d
```  

When the code is run by the user, it is processed by something called the **Java Virtual Machine (JVM).** The JVM is essentially an interpreter for the bytecode. It goes through the bytecode and runs it. There are different versions of the JVM that are compatible with each OS and can run the same code. There is virtually no difference for the end-user, but this makes it a lot easier for programmers doing software development.  

## Installing the Java Development Kit  

Before installing the Java Development Kit (JDK), you should probably know what it is. It is distributed by Oracle. It contains the core libraries and compiler required to develop Java. The JDK should not be confused with the JRE (Java Runtime Environment). The JRE is a JVM for running, as opposed to compiling, Java programs.  

### Downloading and Installing  

To download the JDK, go to http://www.oracle.com/technetwork/java/javase/downloads/index.html. Click on "JDK with NetBeans Bundle". Follow the instructions for downloading the JDK installation file.  

**Windows:** If you are running Windows, simply run the executable file and follow the installation instructions.  

**Unix, Solaris, or Linux:** For Linux and Unix, download the "jdk1 6.0" for Linux systems. Save the downloaded file in any drive. Once you have saved the file, extract it to a place that you can remember, by using Terminal or by double clicking on the file. When you have finished extracting the file, copy the JDK 1.6.0 folder and paste it in the usr/local(To paste to the usr/local directory, you have to be in root) so that every user can use the java files. You can delete the downloaded zip file so that it doesn't take up space on your drive.  

**Macintosh:** The latest available JDK is automatically installed by the operating system. Because Java for Macintosh is developed and maintained by Apple, in coordination with Sun, the current version on the Macintosh may not be the current version that is available from Sun.  

#### Note on Editions  

The JDK comes in three editions :  

  * **Java Standard Edition (JSE)** – This version is the basic platform for Java. The course will focus on this edition.  
  * **Java Enterprise Edition (JEE)** – This edition is mainly for developing and running distributed multitier architecture Java applications, based largely on modular software components running on an application server. We will not be covering this version in the course.  
  * **Java Micro Edition (JME)** – This edition is primarily for developing programs to run on consumer applicances, such as PDAs and cell phones.  

### Configuring Variables  

Before writing code, it is recommended that you set the Path variable on your system so you can compile your code more easily.  

#### For Windows Users  

  * From the Control Panel, double click "System" (System and Maintenance in Vista)  
  * For Windows 7 or Vista, click on "System," "Advanced System Settings" on the left, and then on "Environment Variables."  
  * For XP and 2000, click on the "Advanced" tab and click on "Environment Variables" For NT, click on the "Environment" tab.  
  * Select the Path variable and click "Edit"  
  * Add the path to the bin directory of where Java is installed on your hard drive. It should probably be: C:\Program Files\Java\jdk1.8.0_181\bin unless you changed it during installation.  
  * Click OK  

#### For Linux and UNIX  

One way to set your path in Linux/Unix is to add a path export to your bash profile.

  * In order to do this, first open your bash profile in a text editor. For example,
  ```
  pico ~/.bash_profile
  ```  
  * Then add this line:  
  ```
  export PATH=$PATH:/usr/local/jdk/bin
  ```  
Note that the path to the java directory "/usr/local/jdk/bin" may be different on your machine.  
  * Restart your shell.  

#### For Macintosh  

Apple sets everything up for you. Sit back and relax.  

The only drawback is that because Apple handles development and maintenance of Java on the Mac, there is usually a delay from the time that a new version is released by Sun and the time that the new version is released on the Mac. Also, getting the latest version sometimes requires an operating system upgrade.  

Oh well, you can't have everything.   

### Versions of Java  

As of 20 March 2018, both Java 8 and 11 are officially supported. Major release versions of Java, along with their release dates:  

  * JDK 1.0 (January 23, 1996)  
  * JDK 1.1 (February 19, 1997)  
  * J2SE 1.2 (December 8, 1998)  
  * J2SE 1.3 (May 8, 2000)  
  * J2SE 1.4 (February 6, 2002)  
  * J2SE 5.0 (September 30, 2004)  
  * Java SE 6 (December 11, 2006)  
  * Java SE 7 (July 28, 2011)  
  * Java SE 8 (March 18, 2014)  
  * Java SE 9 (September 21, 2017)  
  * Java SE 10 (March 20, 2018)  
  * Java SE 11 (September 25, 2018)  

### History of Java  

Well, some of the history was given in the introductory section. But if you still want to know more about java then please [Click Here](https://en.wikipedia.org/wiki/Java_(programming_language)#History "Wikipedia - Java History")