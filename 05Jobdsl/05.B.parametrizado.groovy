pipelineJob('jenkins.job.parametrizado 2') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/edisaac/jenkinsdsl.git")
          }
          branch('main')
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
  parameters {
		stringParam('nombre', defaultValue = 'Julian', description = 'Parametro de cadena para el Job Booleano')
		choiceParam('planeta', ['Mercurio', 'Venus', 'Tierrra', 'Marte', 'Jupiter', 'Saturno', 'Urano', 'Neptuno'])
		booleanParam('agente', false)
	}
	triggers {
		cron('H/7 * * * *')
	}
	
}