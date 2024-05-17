ssh-keygen -t ed25519 -C "edisaac.mejia@gmail.com"   

Instalar ngrok  en el master

https://ngrok.com/


En la cuenta de github agregar una nueva aplicacion

https://github.com/settings/apps


Colocar la ruta de ngrok en el webhook de la aplicacion de github
 


https://${JENKINS_NGROK}/jenkins/github-webhook/

Descargar el certificado de la aplicacion de github y transformarlo al que necesita jenkins

openssl pkcs8 -topk8 -nocrypt -in jenkisedisaac.2024-05-17.private-key.pem

Configurar 

Panel de Control >Administrar Jenkins>System

GitHub > GitHub Servers
Name: 
