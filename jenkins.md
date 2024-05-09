```powershell
multipass launch docker --cpus 2 --disk 40G --memory 4G --name master

multipass launch docker --cpus 2 --disk 40G --memory 4G --name slave
```

```powershell
multipass set local.privileged-mounts=Yes

multipass mount C:\repos-lau\jenkins master:/jenkins
multipass mount C:\repos-lau\jenkins slave:/jenkins


```

### en master

En power shell

```powershell
multipass shell master
```

en consola de master

```sh
mkdir -p /home/ubuntu/jenkins_home
cd /jenkins/

docker-compose -f docker-compose-master.yml up 
```

 docker exec -ti --user root  jenkins_master bash

 cd /var/jenkins_home/secrets/



### en jenkins

#### 

Panel de Control> Administrar Jenkins > nodos > new node

Directorio raiz remoto:/home/jenkins/agent
labels  : agent1
Metodo de ejecución:**Launch agent by connecting it to the controller**



https://hub.docker.com/r/jenkins/inbound-agent/ 

### en slave

```powershell
multipass shell slave
```

en consola de slave

```
mkdir -p /home/ubuntu/jenkins_agent
cd /jenkins/

docker-compose -f docker-compose-slave.yml up 
```



### probar agente en jenkins



new item > tipo pipeline > Pipeline script



```groovy
pipeline {
    agent {
        label 'agent1'
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
               	script {
                    sh 'java --version'
                    //sh 'npm --version'
                }
            }
        }
	}
}
```







https://medium.com/@yjagdale/deploy-jenkins-master-slave-as-docker-container-ea8557d0d52a


