+++
title = "Script Approval vs Sandbox"
tags = ["Advanced"]
weight = 6
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Script Approval vs Sandbox

Code at https://github.com/nrayapati/devopsdays_library/blob/master/vars/retryWithPrompt.groovy#L17

```groovy
@Library("devopsdays") _

retryWithPrompt {
    error "Anticipated error..."
}
```