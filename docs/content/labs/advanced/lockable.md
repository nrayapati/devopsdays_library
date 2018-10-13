+++
title = "Lockable Resources"
tags = ["Advanced"]
weight = 4
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Lockable REsources

```groovy
lock(quantity: 1, resource: 'devops1') {
    sleep time: 1, unit: 'MINUTES'
}
```