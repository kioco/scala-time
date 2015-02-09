organization := "com.metamx"

name := "time"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.1", "2.10.4")

lazy val root = project.in(file("."))

net.virtualvoid.sbt.graph.Plugin.graphSettings

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

homepage := Some(url("https://github.com/metamx/scala-util"))

publishMavenStyle := true

publishTo := Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2/")

pomIncludeRepository := { _ => false }

pomExtra := (
  <scm>
    <url>https://github.com/metamx/scala-util.git</url>
    <connection>scm:git:git@github.com:metamx/scala-util.git</connection>
  </scm>
  <developers>
    <developer>
      <name>Gian Merlino</name>
      <email>gian@metamarkets.com</email>
      <organization>Metamarkets Group Inc.</organization>
      <organizationUrl>https://www.metamarkets.com</organizationUrl>
    </developer>
  </developers>)

parallelExecution in Test := false

releaseSettings

ReleaseKeys.publishArtifactsAction := PgpKeys.publishSigned.value

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.6"
)
