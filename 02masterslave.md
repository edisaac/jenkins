## Crear 2 maquinas virtuales con multipass



```powershell
multipass set local.privileged-mounts=Yes
multipass launch docker --cpus 2 --disk 40G --memory 4G --name master

multipass launch docker --cpus 2 --disk 40G --memory 4G --name slave


multipass shell master

multipass shell slave
```

## montar repositorio Jenkins en maquinas virtuales 

```powershell
multipass set local.privileged-mounts=Yes
#en windows
multipass mount C:\repos-lau\jenkins master:/jenkins
multipass mount C:\repos-lau\jenkins slave:/jenkins
#en linux
multipass mount ~/Desktop/jenkins master:/jenkins
multipass mount ~/Desktop/jenkins slave:/jenkins
```
