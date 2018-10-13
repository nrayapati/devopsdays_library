+++
title = "Job DSL"
tags = ["Advanced"]
weight = 8
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Job DSL

```groovy
folder("DevOpsDays/3_Best_Practices/test_folder") { }

pipelineJob('DevOpsDays/3_Best_Practices/test_folder/simple_pipeline') {
displayName('simple_pipeline')
description('simple_pipeline')
        definition {
                cpsScm {
                        scm {
                        git {
                                remote {
	                                url('https://github.com/nrayapati/devopsdays_test.git')
    	                            branch('master')
                                }
                            }
                        }
                    }
                }
   	triggers {
        	githubPush()
    		 }
        properties {
                buildDiscarder {
                        strategy {
                                logRotator {
                                        artifactDaysToKeepStr('2')
                                        artifactNumToKeepStr('2')
                                        daysToKeepStr('2')
                                        numToKeepStr('2')
                                }
                        }
                }
        }
}
```