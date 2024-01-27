def gitDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def gitBuild()
{
   sh 'mvn package'
}
