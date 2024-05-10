multipass set local.privileged-mounts=Yes


```powershell
multipass launch docker --cpus 2 --disk 40G --memory 4G --name master

multipass launch docker --cpus 2 --disk 40G --memory 4G --name slave


multipass shell master

multipass shell slave
```

