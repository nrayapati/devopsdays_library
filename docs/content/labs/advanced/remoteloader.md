+++
title = "Remote Loader"
tags = ["Advanced"]
weight = 3
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Pipeline Remote Loader

```groovy
node {
    def remoteScript = fileLoader.fromGit('jenkins/release.groovy', "https://github.com/nrayapati/devopsdays_test.git", 'master', null, '')
    remoteScript.prepare()
    remoteScript.release()
    remoteScript.clean()
}
```