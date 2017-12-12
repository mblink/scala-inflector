import scala.xml._

name := "scala-inflector"

version := "1.3.6"

organization := "bondlink"

scalaVersion := "2.12.4"
crossScalaVersions := Seq("2.11.11", "2.12.4")

crossVersion := CrossVersion.binary

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-Xcheckinit", "-encoding", "utf8")

scalacOptions := scalacOptions.value :+ Option(scalaVersion.value).filter(_.startsWith("2.12"))
  .map(v => "-opt:l:method")
  .getOrElse("-optimize")

libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, scalaMajor)) if scalaMajor == 11 => Seq("org.specs2" %% "specs2" % "2.3.11" % "test")
    case _ => Seq("org.specs2" %% "specs2-core" % "3.9.5" % "test")
  }
}

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
