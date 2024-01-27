def gitDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def gitBuild()
{
   sh 'mvn package'
}

def gitDeployment(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"

}

def executeSelenium(jobname)
{
 sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar" 
}



















