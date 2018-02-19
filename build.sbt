//import Dependencies._

lazy val commonSettings = Seq(
  organization := "org.myproject",
  version := "0.1.0",
  // set the Scala version used for the project
  scalaVersion := "2.12.4"
)

lazy val scalactic = "org.scalactic" %% "scalactic" % "3.0.4"
lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4" % "test"

lazy val root = (project in file(".")).
  settings(
    commonSettings,
    name := "adventofcode",
    libraryDependencies += scalaTest,
    libraryDependencies += "com.sksamuel.elastic4s" % "elastic4s-http_2.12" % "6.1.4",
    libraryDependencies ++= Seq(
      "com.typesafe.slick" %% "slick" % "3.2.1",
      "org.slf4j" % "slf4j-nop" % "1.6.4",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.2.1"
    ),
    libraryDependencies += "com.twitter" %% "finatra-http" % "18.2.0"
  )

