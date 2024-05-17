Agregar Agente Docker

```powershell
multipass shell slave
```

en consola de slave

```shell
mkdir -p /home/ubuntu/jenkins_agent_docker
chown 1000  /home/ubuntu/jenkins_agent_docker -R

cd /jenkins/07nodejs
docker-compose -f docker-compose-docker-slave.yml up

```


Links
https://jenkinsci.github.io/job-dsl-plugin/#


Crear NodeJS  Tool 
Panel de Control > Administrar Jenkins >Tools >instalaciones de NodeJS


Crear un seed JOB

Panel de Control>Todo>Nuevo Tarea

name: job dsl nodeJS
type: proyecto libre


Ir a opcion ejecutar
BUILD STEPS : Process Job DSLs
Use the provided DSL script

Agregar el contenido de 

07.A.nodejs.groovy

luego agregar el contenido

07.B.nodejsDocker.groovy

 



