

# JOB
## Crear un  JOB

root>new item > tipo pipeline > Pipeline script

nombre:parametros


```groovy
pipeline {
    agent {
        label 'agent1'
    }
    parameters {
        choice(
            choices: ['1', '2', '3'],
            description: 'Select a number',
            name: 'listaNumero'
        )
    }
    stages {
        stage('parameterStage') {
            steps {
                echo 'Hello World'
                script {
                  sh "echo sh listaNumero is ${params.listaNumero}"
                }
            }
        }
    }
}

```

## Crear cron  JOB
root>new item > tipo pipeline > Pipeline script

nombre: Cron JOB


```groovy
pipeline {
    agent {
        label 'agent1'
    }
    triggers {
        cron('* * * * *')
    }
    stages {
        stage('cronStage') {
            steps {
                script {
                    // Obtener la hora inicial
                    def horaInicial = new Date()
                    echo "Hora inicial: ${horaInicial}"

                    // Hacer un sleep de 5 segundos
                    sleep 5

                    // Obtener la hora después del sleep
                    def horaFinal = new Date()
                    echo "Hora después del sleep: ${horaFinal}"
                }
            }
        }
    }
}
```

