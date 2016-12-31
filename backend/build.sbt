name := """app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  javaJdbc,
  javaJpa
)

libraryDependencies ++= Seq(
  "org.pac4j"       % "play-pac4j"              % "2.5.2",
  "org.pac4j"       % "pac4j-http"              % "1.9.4",
  "org.pac4j"       % "pac4j-ldap"              % "1.9.4",
  "org.hibernate"   % "hibernate-entitymanager" % "5.1.0.Final",
  "org.postgresql"  % "postgresql"              % "9.4-1200-jdbc41"
)

routesGenerator := InjectedRoutesGenerator

PlayKeys.fileWatchService := play.runsupport.FileWatchService.sbt(2000)