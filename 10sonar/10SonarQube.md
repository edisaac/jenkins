

# SONAR
en master


cd /jenkins/10sonar

docker-compose -f docker-compose-sonar.yml up  --build


entrar a my account /security 
y generar un nuevo token


# Jenkins

Administracion / Global Tool / instalaciones de SonarQube Scanner

y agregar sonar501

Administracion / Credential  / Agregar Credencial

Tipo Secret Text
sonar_credential

Nueva Tarea / Tipo  / Pipelije

En el pipelien definition 
copiar el contenido de  /home/edmejia/Desktop/jenkins/10sonar/sonar.grovvy


# jenkins SSH ERRORS


http://10.155.130.135:8080/script
org.jenkinsci.plugins.durabletask.BourneShellScript.LAUNCH_DIAGNOSTICS=true 

