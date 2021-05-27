pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('demo-docker-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://CalinSebastian@bitbucket.org/CalinSebastian/dockerprojectdemo.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}