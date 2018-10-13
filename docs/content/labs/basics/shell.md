+++
title = "Shell Script"
tags = ["Basics"]
weight = 7
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Shell Script 

```groovy
node {
    git branch: 'test', url: 'https://github.com/nrayapati/devopsdays_test.git'
    def gitCommit = sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
    echo "Git commit sha: ${gitCommit}"
}
```