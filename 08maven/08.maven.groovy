pipelineJob('maven tool') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/edisaac/simple-java-maven-app.git")
          }
          branch('master')
        }
      }
      scriptPath("jenkins/Jenkinsfile1")
    }
  }	
}
pipelineJob('maven tool docker y post') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/edisaac/simple-java-maven-app.git")
          }
          branch('master')
        }
      }
      scriptPath("jenkins/Jenkinsfile2")
    }
  }	
}