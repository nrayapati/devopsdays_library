+++
title = "Build Name"
tags = ["Advanced"]
weight = 2
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Build Name

```groovy
node {
    //this will replace the build number in the Jenkins UI.
    currentBuild.displayName = "Cerner - " + currentBuild.number
    //this will show up as a grey text block below the build number
    currentBuild.description = "Kansas City"
}
```