organization := "org.scala-tools.time"

name := "time"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.1", "2.10.4")

lazy val root = project.in(file("."))

net.virtualvoid.sbt.graph.Plugin.graphSettings

resolvers ++= Seq(
  "Metamarkets Releases" at "https://metamx.artifactoryonline.com/metamx/pub-libs-releases-local/"
)

publishMavenStyle := true

publishTo := Some("pub-libs" at "https://metamx.artifactoryonline.com/metamx/pub-libs-releases-local")

parallelExecution in Test := false

releaseSettings

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.6"
)
