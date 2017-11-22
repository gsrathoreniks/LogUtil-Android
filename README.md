# LogUtil-Android
Android Library for easy implementation of LOG.

[![](https://jitpack.io/v/gsrathoreniks/LogUtil-Android.svg)](https://jitpack.io/#gsrathoreniks/LogUtil-Android)

# Gradle

### STEP 1: Add it in your root build.gradle at the end of repositories:


```
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
### STEP 2: Add the dependency
  
  ```
  dependencies {
	        compile 'com.github.gsrathoreniks:LogUtil-Android:0.1.2'
	}
  ```
--------------------------------------------

# Maven

### STEP 1: 

```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  
  ### STEP 2: Add the dependency

```
<dependency>
	    <groupId>com.github.gsrathoreniks</groupId>
	    <artifactId>LogUtil-Android</artifactId>
	    <version>0.1.2</version>
	</dependency>
  ```
---------------------------------------------

# Sbt

### STEP 1: Add it in your build.sbt at the end of resolvers:
```
 resolvers += "jitpack" at "https://jitpack.io"
```

 ### STEP 2: Add the dependency
 ```
 libraryDependencies += "com.github.gsrathoreniks" % "LogUtil-Android" % "0.1.2"	
 ```
 
----------------------------------------------
# Leiningen

### STEP 1: Add it in your project.clj at the end of repositories:

```
:repositories [["jitpack" "https://jitpack.io"]]
```

### STEP 2: Add the dependency
```
:dependencies [[com.github.gsrathoreniks/LogUtil-Android "0.1.2"]]	
```
----------------------------------------------


