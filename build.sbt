name := "Hudcha"

lazy val sharedSettings = Seq(
  scalaVersion := "2.11.8",
  libraryDependencies ++= LibraryDependencies.shared,
  resolvers ++= Resolvers.shared,
  scalacOptions ++= Seq(
    "-target:jvm-1.8",
    "-encoding", "UTF-8",
    "-unchecked",
    "-deprecation",
    "-Xfuture",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Ywarn-unused"
  )
)

//*******************************************************
// main project

lazy val hudcha = (project in file("."))
  .settings(sharedSettings: _*)
  .settings(
    version := "1.0"
  )



//*******************************************************
// sub projects

lazy val common = (project in file("./app/common"))
  .settings(sharedSettings: _*)
  .settings(
    version := "1.0",
    libraryDependencies ++= LibraryDependencies.common,
    resolvers ++= Resolvers.common
  )

lazy val crawler = (project in file("./app/crawler"))
  .settings(sharedSettings: _*)
  .settings(
    version := "1.0",
    libraryDependencies ++= LibraryDependencies.crawler
  )

lazy val advertiser = (project in file("./app/advertiser"))
  .settings(sharedSettings: _*)
  .settings(
    version := "1.0",
    libraryDependencies ++= LibraryDependencies.advertiser
  )

lazy val web = (project in file("./app/web")).enablePlugins(PlayScala)
  .settings(sharedSettings: _*)
  .settings(
    version := "1.0",
    libraryDependencies ++= LibraryDependencies.web
  )