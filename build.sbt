import scala.xml._

onChangedBuildSource in Global := ReloadOnSourceChanges

name := "scala-inflector"

version := "1.3.9"

organization := "bondlink"

scalaVersion := "2.13.1"
crossScalaVersions := Seq("2.11.12", "2.12.11", "2.13.1")

crossVersion := CrossVersion.binary

libraryDependencies += "org.specs2" %% "specs2-core" % "4.9.2" % "test"

libraryDependencies ++= Seq(
  // compilerPlugin("org.scala-tools.sxr" % "sxr_2.9.0" % "0.2.7"),
  "junit" % "junit" % "4.10" % "test"
)

autoCompilerPlugins := true

parallelExecution in Test := false

homepage := Some(url("https://github.com/mblink/scala-inflector"))
startYear := Some(2010)
licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

bintrayReleaseOnPublish := false
bintrayOrganization := Some("bondlink")
bintrayRepository := "scala-inflector"

pomExtra := (
  <scm>
    <connection>scm:git:git://github.com/mblink/scala-inflector.git</connection>
    <developerConnection>scm:git:git@github.com:mblink/scala-inflector.git</developerConnection>
    <url>https://github.com/mblink/scala-inflector</url>
  </scm>
  <developers>
    <developer>
      <id>casualjim</id>
      <name>Ivan Porto Carrero</name>
      <url>http://flanders.co.nz/</url>
    </developer>
    <developer>
      <id>jdleider</id>
      <name>Justin Leider</name>
    </developer>
  </developers>
)

exportJars := true
