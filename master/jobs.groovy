multibranchPipelineJob('demo') {
    branchSources {
        git {
            remote('https://github.com/nirud/dockerized-jenkins-demo.git')
        }
    }
    triggers {
        cron('H/5 * * * *')
    }
}
