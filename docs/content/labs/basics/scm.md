+++
title = "Git vs Checkout SCM"
tags = ["Basics"]
weight = 5
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Git vs Checkout SCM

#### Git

```groovy
node {
    stage("Checkout") {
        git branch: 'test', url: 'https://github.com/nrayapati/devopsdays_test.git'
        sh 'ls -lrt'
    }
}
```

#### Checkout SCM

Code at https://github.com/nrayapati/devopsdays_test/blob/master/Jenkinsfile

```groovy
node {
  checkout scm
  sh 'ls -lrt'
}
```