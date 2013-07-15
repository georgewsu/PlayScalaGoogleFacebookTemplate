import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "PlayScalaGoogleFacebookTemplate"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "org.apache.jena" % "jena-arq" % "2.10.1",
    "com.restfb" % "restfb" % "1.6.12")

  val main = play.Project(appName, appVersion, appDependencies).settings( 
    // Add your own project settings here
  )

}
