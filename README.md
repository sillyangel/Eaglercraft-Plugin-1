# PLEASE READ THIS DOC!

#### this project includes darverdev's EaglerMavenRepo which contains commenly used dependencies in eagler plugins.
the repository also provides craftbukkit 1.5.2 as a mvn dependency<br>
Here is how to use darverdev's repo in this project:<br>
1. Visit the page here and pick a folder to import (CRAFTBUKKIT IS ALREADY IMPORTED! To replace the server jar, simply change the version and artifactId of the ***pre-added dependency***)
<br><a href="https://github.com/darverdevs/EaglerMavenRepo/tree/main/com/github/EaglerMaven">github.com/darverdevs/EaglerMavenRepo/com/github/EaglerMaven</a><br>
```xml
<dependency>
    <groupId>com.github.EaglerMaven</groupId>
    <artifactId>_FOLDER NAME_</artifactId>
    <version>_VERSION_</version>
</dependency>
```

## SETUP - REQUIRED!
**You need to setup your project a little bit before it works.** <br>
Step 1. Change groupId and archiveId in pom.xml to your project ones.<br>
Step 2. Change the plugin.yml to your plugin<br>
Step 3. Make sure pom.xml's minecraftversion is 1.5.2.<br>
Step 3. Simply hit run and compile your plugin!<br>

## TO ADD DEPENDENCIES
**in order to use maven, do <i>not</i> use the repl.it packager. use the pom.xml.** <br>
Step 1. Add dependency/repository to pom.<br>
Step 1A. Add it to the dependencies of plugin.yml<br>
Step 2. Run project to import.<br>
Step 3. Done!

## TO RUN PROJECT
 To use, fork my gavlercraft repl and put your compiled plugin (hit run to compile, then find jar in `target/[archiveId]-[version].jar)` in /bukkit-command/plugins.