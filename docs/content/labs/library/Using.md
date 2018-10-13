+++
title = "Using Shared Library"
tags = ["Shared Library"]
weight = 2
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Using Shared Library

```groovy
@Library("devopsdays@master") _

@Library("github.com/nrayapati/devopsdays_library@master") _

node {
    
    def yaml = libraryResource 'org/devopsdays/test.yml'
    println yaml

    writeFile file: 'test.groovy', text: '''// Methods in this file will end up as object methods on the object that load returns.
    def lookAtThis(String whoAreYou) {
        echo "Look at this, ${whoAreYou}! You loaded this from another file!"
    }
    
    return this;'''

    def loadMethod = load 'test.groovy'
    loadMethod.lookAtThis("Naresh")
    
}
```