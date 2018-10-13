+++
title = "Config File Provider"
tags = ["Advanced"]
weight = 5
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### Config File Provider

```groovy
node {
    configFileProvider([configFile(fileId: 'sample_json', variable: 'testJsonFileName')]) {
        println testJsonFileName.toString()
        def testJsonfile = readFile "${testJsonFileName.toString()}"
        println testJsonfile
    }
}
```