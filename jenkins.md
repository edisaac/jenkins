```plaintext
multipass launch docker --cpus 2 --disk 40G --memory 4G --name master

multipass launch docker --cpus 2 --disk 40G --memory 4G --name slave
```





docker-compose build

docker-compose up -d

docker exec -ti --user root  jenkins bash



chown jenkins /var/run/docker.sock 

docker exec -ti   jenkins bash