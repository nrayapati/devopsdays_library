+++
title = "Tools"
tags = ["Basics"]
weight = 6
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Tools

```groovy
node {
   def mvnHome
   stage('Preparation') { 
      git 'https://github.com/jglick/simple-maven-project-with-tests.git'
      mvnHome = tool 'maven-3.5.4'
   }
   stage('Build') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean "
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean /)
      }
   }
}
```