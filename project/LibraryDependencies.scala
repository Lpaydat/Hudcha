import LibraryDependencyList._
import sbt._


object LibraryDependencies {
  val shared = scalaTest ++ typesafe ++ phantom ++ json   // include in every projects
  val common = phantom
  val crawler = scalaScraper
  val analyser = compute
  val web = play
}


object LibraryDependencyList {

  val PhantomVersion = "1.27.0"
  val phantom = Seq(
    "com.websudos"   %% "phantom-dsl"        % PhantomVersion,
    "com.websudos"   %% "util-testing"       % "0.13.0"        % "test, provided"
  )

  val scalaScraper = Seq(
    "net.ruippeixotog" %% "scala-scraper" % "1.0.0"
  )

  val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.0"
  )

  val typesafe = Seq(
    "com.typesafe" % "config" % "1.3.0"
  )

  val json = Seq(
    "com.google.code.gson" %  "gson"            % "2.7",
    "net.liftweb"          %% "lift-json"       % "3.0-RC3",
    "org.json4s"           %% "json4s-native"   % "3.4.0",
    "org.json4s"           %% "json4s-jackson"  % "3.4.0"
  )

  val compute = Seq(
    "org.scalaz" %% "scalaz-core" % "7.2.5"
  )

  val play = Seq(
    "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
  )

}