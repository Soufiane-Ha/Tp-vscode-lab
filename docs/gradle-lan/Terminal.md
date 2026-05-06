### command for running the gradle environment build:

```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> gradle -v

------------------------------------------------------------
Gradle 8.7
------------------------------------------------------------

Build time:   2024-03-22 15:52:46 UTC
Revision:     650af14d7653aa949fce5e886e685efc9cf97c10

Kotlin:       1.9.22
Groovy:       3.0.17
Ant:          Apache Ant(TM) version 1.10.13 compiled on January 4 2023
JVM:          17.0.19 (Oracle Corporation 17.0.19+9-LTS-183)
OS:           Windows 11 10.0 amd64

PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> java -version
java version "17.0.19" 2026-04-21 LTS
Java(TM) SE Runtime Environment (build 17.0.19+9-LTS-183)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.19+9-LTS-183, mixed mode, sharing)
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> 
```

### command for running the gradle build:

```powershell
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab> cd docs/gradle-lan
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab\docs\gradle-lan> gradle init --type java-application

Enter target Java version (min: 7, default: 21):

Project name (default: gradle-lan): gradle-lan

Select application structure:
  1: Single application project
  2: Application and library project
Enter selection (default: Single application project) [1..2] 

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 2

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit Jupiter) [1..4]  

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no


> Task :init
To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.7/samples/sample_building_java_applications.html
                                                                                  
BUILD SUCCESSFUL in 46s
1 actionable task: 1 executed
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab\docs\gradle-lan>   gradle dependencies   

> Task :dependencies

------------------------------------------------------------
Root project 'gradle-lan'
------------------------------------------------------------

No configurations

A web-based, searchable dependency report is available by adding the --scan option.

BUILD SUCCESSFUL in 8s
1 actionable task: 1 executed
PS C:\Users\ELITE COMPUTER\Tp-vscode-lab\docs\gradle-lan> 
  
```