+++
title = "Node/Stage/Step/Groovy"
tags = ["Basics"]
weight = 4
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Node/Stage/Step/Groovy

#### Code

```groovy

def roomNumber = 10
node {
    echo 'ANY'
}

node('LINUX') {
    echo 'LINUX'
}

 node('DEVOPSDAYS') {
    stage('KC') {
        if(roomNumber==10) {
            echo 'Jenkins Pipelines'
        } 
    }
 }

node('TEST') {
    echo 'TEST'
}

```