logLevel := Level.Warn

/* ********************* play framework's plugins ********************* */
// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.8")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.1.0")

addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.2")



/* *********************** phantom-sbt's plugin *********************** */
resolvers ++= Seq(
  "Sonatype snapshots"                                 at "http://oss.sonatype.org/content/repositories/snapshots/",
  "jgit-repo"                                          at "http://download.eclipse.org/jgit/maven",
  "Twitter Repo"                                       at "http://maven.twttr.com/",
  "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/",
  Resolver.bintrayRepo("websudos", "oss-releases"),
  Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)
)

// And finally the plugin dependency itself
addSbtPlugin("com.websudos" %% "phantom-sbt" % "1.22.0")

addSbtPlugin("com.websudos" % "sbt-package-dist" % "1.2.0")