
# Instalar ngrok  en el master

https://ngrok.com/

 
y seguir los pasos para levantar el servidor de ngrok apuntando al puerto 8080

# en un pipeline multibranch

En el pipeline de multibranch de ejemplo 
modificar para que se lanze por webhooks
Scan Multibranch Pipeline Triggers: Scan by webhook
agregar un token para que identique el webhook

# en github ir al repositorio multibranch

https://github.com/edisaac/multibranchpipeline/settings/hooks

agregar un webhook con la url de ngrok


https://c378-38-25-25-94.ngrok-free.app/multibranch-webhook-trigger/invoke?token=multibranch-token


verificar en Recent Deliveries que se haya recibido el ping

