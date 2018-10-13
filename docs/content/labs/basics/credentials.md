+++
title = "Credentials"
tags = ["Basics"]
weight = 8
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Credentials

```groovy
def printName
def printPassword

withCredentials([usernamePassword(credentialsId: 'devopsdays', passwordVariable: 'password', usernameVariable: 'userName')]) {
    // Binding variables
    echo userName
    echo password
    c
    // environment variables
    echo env.userName
    echo env.password

    printName = userName
    printPassword = password
}

echo env.userName
echo env.password

echo printName
echo printPassword
```