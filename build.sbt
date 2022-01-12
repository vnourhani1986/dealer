import Dependencies.{test, _}

name := "dealer"

version := "0.1"

scalaVersion := "2.13.6"

lazy val commonSettings = catsEffect ++
  monix ++
  zio ++
  circe ++
  http4s ++
  tapir ++
  postgres ++
  doobie ++
  pureConfig ++
  log ++
  test

lazy val customer = (project in file("customer"))
  .settings(
    libraryDependencies ++=
      commonSettings
  )

lazy val root = (project in file("."))
  .aggregate(customer)

ThisBuild / scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-encoding",
  "UTF-8",
  "-Xfatal-warnings",
  "-language:postfixOps",
  "-language:higherKinds",
  "-Ylog-classpath",
  "-Ypartial-unification"
)
