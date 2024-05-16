pipelineJob('nodejs 2 docker') {
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
      scriptPath("jenkinsfile2")
    }
  }

	
}