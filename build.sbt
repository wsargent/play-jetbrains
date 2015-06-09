import play.twirl.sbt.Import.TwirlKeys

name := """play-jetbrains"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.

lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .settings(
    routesGenerator := InjectedRoutesGenerator,
    libraryDependencies ++= Seq(
      specs2 % Test
    ),
    resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
    TwirlKeys.templateImports ++= Seq("session.Context")
  )
