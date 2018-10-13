+++
title = "Declarative vs Scripted Pipeline"
tags = ["Basics"]
weight = 3
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Declarative vs Scripted 

#### Declarative

```groovy
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
```

#### Scripted

```groovy
node {
    try {
        echo 'Hello World'
    } finally {
        echo 'I will always say Hello again!'
    }
}
```