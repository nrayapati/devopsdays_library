+++
title = "Parameters"
tags = ["Basics"]
weight = 11
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Parameters

```groovy
def job_params = [booleanParam(defaultValue: false, description: '', name: 'DEPLOY'), 
                  string(defaultValue: 'Rao', description: 'User name with sudo access.', name: 'USER_NAME'), 
                  password(defaultValue: 'secret', description: 'Only required with SSH_USER', name: 'PASSWORD')]

properties([parameters(job_params)])

println params.USER_NAME
println env.USER_NAME
println "${params.USER_NAME}"
```