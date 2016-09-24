import ResolverList._
import sbt._


object Resolvers {
  val shared = typesafe ++ phantom
  val common = phantom ++ phantomSbt
  val web = playFramework
}


object ResolverList {

  val phantom = Seq(
    "Typesafe repository snapshots"    at "http://repo.typesafe.com/typesafe/snapshots/",
    "Typesafe repository releases"     at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype repo"                    at "https://oss.sonatype.org/content/groups/scala-tools/",
    "Sonatype releases"                at "https://oss.sonatype.org/content/repositories/releases",
    "Sonatype snapshots"               at "https://oss.sonatype.org/content/repositories/snapshots",
    "Sonatype staging"                 at "http://oss.sonatype.org/content/repositories/staging",
    "Java.net Maven2 Repository"       at "http://download.java.net/maven/2/",
    "Twitter Repository"               at "http://maven.twttr.com",
    Resolver.bintrayRepo("websudos", "oss-releases"),
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots")
  )

  val phantomSbt = Seq (
    Resolver.url("Websudos OSS", url("http://dl.bintray.com/websudos/oss-releases"))(Resolver.ivyStylePatterns),
    "jgit-repo"                        at "http://download.eclipse.org/jgit/maven"
  )

  val playFramework = Seq(
    "scalaz-bintray"                   at "http://dl.bintray.com/scalaz/releases"
  )

  val typesafe = Seq(
    "Typesafe Repo"                    at "http://repo.typesafe.com/typesafe/releases/"
  )

}