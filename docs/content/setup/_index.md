+++
title = "Setup"
description = "Workshop Resources / Workstation Step instructions"
weight = 1
alwaysopen = true
date = "2018-10-13"
lastmodifierdisplayname = "Naresh Rayapati"
+++

* **Instructions to setup your laptop**
    * Install Docker 
    * Create a folder for this workspace 
    * Pull the docker container 
    * Spin up Jenkins
    * http://localhost:9090/
  
##### Install Docker (if it wasn't installed before)

* Mac: https://docs.docker.com/docker-for-mac/
* Windows: https://docs.docker.com/docker-for-windows/install/

##### Create folder on your home folder (User's home)

```shell
cd 
mkdir DevOpsDays 
```

##### Pull the docker container

```shell
docker pull nrayapati/jenkins-2-centos7:latest
```

##### Or save it from the flash drive:

```shell
docker load --input jenkins-2-centos7.tar
```

##### Spin up Jenkins container

```shell
docker run -p 9090:8080 -e JENKINS_PASSWORD=admin -v ~/DevOpsDays/config:/var/lib/jenkins -v /var/run/docker.sock:/var/run/docker.sock -td --name jenkins_master nrayapati/jenkins-2-centos7:latest 
```