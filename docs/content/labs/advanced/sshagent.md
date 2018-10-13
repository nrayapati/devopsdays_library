+++
title = "SSH Agent"
tags = ["Advanced"]
weight = 7
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### SSH Agent

```groovy
node {
    step([$class: 'WsCleanup'])
    sshagent(['devopsdays_ssh']) {
        git branch: 'test', url: 'https://github.com/nrayapati/devopsdays_test.git'
        sh "ssh-keyscan -H github.com >> ~/.ssh/known_hosts"
        sh "git remote set-url origin git@github.com:nrayapati/devopsdays_test.git"
        sh "git config user.email naresh.rayapati@gmail.com"
        sh "git config user.name nrayapati"
        sh 'git checkout -b devopsdays'
        sh 'git push origin devopsdays'
    }
}
```