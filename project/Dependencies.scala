import sbt._

object Dependencies {

  object Versions {
    val monix = "3.4.0"
    val monixBio = "1.2.0"
    val zio = "2.0.0-M2"
    val zioInteropCats = "2.5.1.0"
    val circe = "0.12.3"
    val http4s = "1.0.0-M9"
    val tapir = "0.20.0-M4"
    val postgres = "42.2.8"
    val doobie = "1.0.0-RC1"
    val logback = "1.2.3"
    val pureConfig = "0.14.0"
    val catsEffectScalaTest = "0.5.2"
    val mockitoCats = "1.16.39"
  }

  val catsEffect = Seq(
    "org.typelevel" %% "cats-effect" % "2.2.0" withSources () withJavadoc (),
    "io.chrisdavenport" %% "cats-effect-time" % "0.1.2"
  )

  val monix = Seq(
    "io.monix" %% "monix" % Versions.monix,
    "io.monix" %% "monix-bio" % Versions.monixBio
  )

  val zio = Seq(
    "dev.zio" %% "zio" % Versions.zio,
    "dev.zio" %% "zio-interop-cats" % Versions.zioInteropCats
  )

  val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % Versions.circe)

  val http4s = Seq(
    "org.http4s" %% "http4s-blaze-server",
    "org.http4s" %% "http4s-blaze-client",
    "org.http4s" %% "http4s-circe",
    "org.http4s" %% "http4s-dsl"
  ).map(_ % Versions.http4s)

  val tapir = Seq(
    "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % Versions.tapir
  )

  val doobie = Seq(
    "org.tpolecat" %% "doobie-core",
    "org.tpolecat" %% "doobie-postgres"
  ).map(_ % Versions.doobie)

  val log = Seq(
    "ch.qos.logback" % "logback-classic"
  ).map(_ % Versions.logback)

  val test = Seq(
    "com.codecommit" %% "cats-effect-testing-scalatest" % Versions.catsEffectScalaTest % "test",
    "org.mockito" %% "mockito-scala-cats" % Versions.mockitoCats % "test",
    "org.tpolecat" %% "doobie-scalatest" % Versions.doobie % "test"
  )

  val pureConfig = Seq(
    "com.github.pureconfig" %% "pureconfig",
    "com.github.pureconfig" %% "pureconfig-cats-effect"
  ).map(_ % Versions.pureConfig)

  val postgres = Seq("org.postgresql" % "postgresql" % Versions.postgres)
}
