+++
title = "Closure vs Map"
tags = ["Shared Library"]
weight = 4
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Closure vs Map

```groovy

@Library("devopsdays") _

// Closure
// Code at https://github.com/nrayapati/devopsdays_library/blob/master/vars/createGitBranchV1.groovy
createGitBranchV1 {
    source = "master"
    target = "test"
}

// Map
// Code at https://github.com/nrayapati/devopsdays_library/blob/master/vars/createGitBranchV2.groovy
createGitBranchV2([source: 'gh-pages', target: 'test'])
```