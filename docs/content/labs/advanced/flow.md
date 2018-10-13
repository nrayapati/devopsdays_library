+++
title = "Flow Control"
tags = ["Advanced"]
weight = 9
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Flow Control

```groovy
@Library("devopsdays") _

input message: 'INPUT EXAMPLE', ok: 'DevOpsDays', parameters: [string(defaultValue: '', description: '', name: 'STRING_PARAM', trim: false), booleanParam(defaultValue: false, description: '', name: 'BOOLEAN_PARAM')]

retryWithPrompt {
    error "error during the demo"
}
```