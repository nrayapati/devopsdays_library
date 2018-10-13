+++
title = "Clean Workspace"
tags = ["Basics"]
weight = 10
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Clean Workspace / Try/Catch

```groovy
stage('test') {
    node('LINUX') {
        step([$class: 'WsCleanup'])
        git branch: 'test', url: 'https://github.com/nrayapati/devopsdays_test.git'
        step([$class: 'WsCleanup'])
    }
}

stage('test') {
    node('LINUX') {
        try {
            git branch: 'test', url: 'https://github.com/nrayapati/devopsdays_test.git'
            sh 'ls -lrt'
        } finally {
            deleteDir()
            sh 'ls -lrt'
        }
    }
}
```