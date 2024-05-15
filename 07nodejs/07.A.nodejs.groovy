pipelineJob('nodejs 1') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/edisaac/nodejspipeline.git")
          }
          branch('main')
        }
      }
      scriptPath("jenkinsfile")
    }
  }

	triggers {
		cron('H/7 * * * *')
	}
	
}