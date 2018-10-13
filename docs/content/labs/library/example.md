+++
title = "Example"
tags = ["Shared Library"]
weight = 3
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Example

```groovy
@Library("devopsdays") _

println retryAndReturn {
    echo "DevOpsDays KC 2018"
    error "Expected.."
}
```