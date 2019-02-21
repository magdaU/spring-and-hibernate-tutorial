# spring-and-hibernate-tutorial

*It is on website Udemy, tutorial name: "Spring-hibernate-tutorial"

# QuickStart:
*Installing Tomcat v 9.00 ::: source: https://tomcat.apache.org/download-90.cgi,  choose : 32bit /64bit Windows Service Installer
(Select the type of install : Full, tomcat adminstrator login: admin, password: admin, 
Verify installing properly Tomcat by page : localhost:8080, if you see it  is ok
*Installing Eclipse https://www.eclipse.org/downloads/, choose Eclipse for Java EE Develepers, 64bit Windows

# Connecting Tomcat to Eclipse:
*Servers (click on link to create a new server ) --> apache ->Tomcat v.9 Servere -> Next 
Browse (add where apache was directly install for exmaple C:\Program Files\Apache Software Foundation\Tomcat 9.0 --> Finish

#  Downoalding Spring Jar Files ( instead of Maven):
*New Project (Java Project)-Project name -> sping-demo-one->Finish

https://repo.spring.io/release/org/springframework/spring, choose the latest relase fr example 5.0.2-> 
spring-framework-5.0.2.Release-dist.zip-> unpack zip files -> libs (copy of all jar files -copy) -> move to eclipce -> add a new folder
name "lib" -> paste (jar files)-> ok
spring -demo-one (right click )-> properties ->java build path->libraries-> classpath --> add jar --> spring -demo-one -> lib -> choose all  jar files --> ok
(so for our project we have referenced libaries for all spring jar files)

Spring Bean : is a simply Java object

Inversion of Control(IoC):

Spring Dependency Injection:


No-arg constructor is for (in xml ) when we don't define any constructor in class code ( when we have have already constructor compiler didn't create default one)



