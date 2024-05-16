

```powershell
multipass set local.privileged-mounts=Yes

multipass mount C:\repos-lau\jenkins master:/jenkins
multipass mount C:\repos-lau\jenkins slave:/jenkins

multipass mount ~/Desktop/jenkins master:/jenkins
multipass mount ~/Desktop/jenkins slave:/jenkins
```

### en master

En power shell

```powershell
multipass shell master
```

en consola de master

```sh
mkdir -p /home/ubuntu/jenkins_home
chown 1000  /home/ubuntu/jenkins_home -R
cd /jenkins/

docker-compose -f docker-compose-master.yml up 
```

 docker exec -ti --user root  jenkins_master bash

 cd /var/jenkins_home/secrets/



### en jenkins

#### configuracion agente

Panel de Control> Administrar Jenkins > nodos > new node

Directorio raiz remoto:/home/jenkins/agent
labels  : agent1
Metodo de ejecución:**Launch agent by connecting it to the controller**


Panel de Control > nodos > agent1


### en slave
ver 
https://hub.docker.com/r/jenkins/inbound-agent/ 


```powershell
multipass shell slave
```

en consola de slave

```
mkdir -p /home/ubuntu/jenkins_agent

chown 1000  /home/ubuntu/jenkins_agent -R


cd /jenkins/

docker-compose -f docker-compose-slave.yml up 
```



### probar agente en jenkins

root>new item > tipo pipeline > libre
Build Steps / Ejecutar linea de comandos (shell)
```shell
echo Hola mundo
```

root>new item > tipo pipeline > Pipeline script





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
                    sh 'echo Hola mundo'
                    //sh 'java --version'
                    //sh 'npm --version'
                }
            }
        }
	}
}
```




