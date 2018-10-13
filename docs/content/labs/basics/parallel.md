+++
title = "Parallel"
tags = ["Basics"]
weight = 13
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Parallel

```groovy
def branches = [:]

branches["ANY"] = {
    node {
        sleep time: 1, unit: 'MINUTES'
    }
}

branches["LINUX"] = {
    node('LINUX') {
        sleep time: 1, unit: 'MINUTES'
    }
}

branches["DEVOPSDAYS"] = {
    node('DEVOPSDAYS') {
        sleep time: 1, unit: 'MINUTES'
    }
}

parallel branches
```