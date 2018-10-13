+++
title = "Stash and Unstash"
tags = ["Basics"]
weight = 9
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Stash vs Unstash

```groovy
node('LINUX') {
    sh "mkdir -p output"
    writeFile file: "output/somefile", text: "Hey look, some text."
    stash name: "stash1", includes: "output/*"
    sh "rm -rf output"
    sh "ls -lrt"
}

node('DEVOPSDAYS') {
    sh 'ls -lrt'
    unstash name: "stash1"
    sh 'ls -lrt'
}
```