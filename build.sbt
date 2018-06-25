import sbt.Keys.organization

publishMavenStyle := true

lazy val commonSettings = Seq(
  scalaVersion := "2.12.6",
  organization := "com.stratio",
  version := "0.1.0-SNAPSHOT",
  name := "cd-test-sbt"
)

lazy val IntegrationTest = config("it") extend(Test)
def itFilter(name: String): Boolean = name endsWith "IT"
def unitFilter(name: String): Boolean = name endsWith "Test"


lazy val root = (project in file("."))
    .configs(IntegrationTest)
    .settings(
      commonSettings,
      inConfig(IntegrationTest)(Defaults.testTasks),
      libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5",
      testOptions in Test := Seq(Tests.Filter(unitFilter)),
      testOptions in IntegrationTest := Seq(Tests.Filter(itFilter))
    )
