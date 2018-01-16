import javaposse.jobdsl.dsl.*
import javaposse.jobdsl.plugin.*

def jobFile = new File('/var/jenkins_home/jobs.groovy')
def workspace = new File('/var/jenkins_home')

def jobManagement = new JenkinsJobManagement(System.out, [:], workspace)
new DslScriptLoader(jobManagement).runScript(jobFile.text)
