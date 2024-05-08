# Instalación y Pasos

Antes de instalar verificar que la red este conectada de manera privada, que los firewall esten desactivados

seguir el siguiente video para instalación

https://www.youtube.com/watch?v=ka2Sdge2Npo

o

https://multipass.run/docs/installing-on-windows



## Usar Docker Blueprint

https://ubuntu.com/tutorials/running-a-container-with-the-docker-workflow-in-multipass#1-overview

```shell
#crear una instancia ubuntu con el blueprint de docker , docker-compose y Portainer  ya instalado
multipass launch docker

#ver las intancia y sus ips
multipass list 
#ingresar por el shell 
multipass shell docker

```



## Posibles problemas

[Troubleshoot networking on Windows](https://multipass.run/docs/troubleshoot-networking#heading--troubleshoot-networking-on-windows)

[Windows: Unable to start multipassd service](https://github.com/canonical/multipass/issues/573 ) 

[Multipass Launch timed out waiting for response on Windows 10](https://github.com/canonical/multipass/issues/1512)

tambien me salio un problema cuando mi red estaba conectada como publica y no privada , y

