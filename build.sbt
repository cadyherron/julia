import sbt.Keys._
import sbt._

assemblyJarName in assembly := "julia-hw.jar"

test in assembly := {}

version       := "0.1-SNAPSHOT"

scalaVersion  := "2.11.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature",  "-encoding", "utf8")


resolvers ++= Seq(
  "Sonatype"   at "https://oss.sonatype.org/content/repositories/public",
  "releases"   at "https://oss.sonatype.org/content/repositories/releases/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= {
  Seq()
}

seq(Revolver.settings: _*)
