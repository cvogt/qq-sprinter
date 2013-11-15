import sbt._
import Keys._
import Tests._

object qqBuild extends Build {
  lazy val aProject = Project(
    id="root",
    base=file("."),
    settings = Project.defaultSettings ++ Seq(
      scalaVersion := "2.10.3",
      libraryDependencies ++= List(
        "org.scala-lang" % "scala-compiler" % scalaVersion.value,
        "org.scala-lang" % "scala-reflect" % scalaVersion.value
      ),
      resolvers += Resolver.sonatypeRepo("snapshots"),
      addCompilerPlugin("org.scala-lang.plugins" % "macro-paradise" % "2.0.0-SNAPSHOT" cross CrossVersion.full)
    )
  ).dependsOn(
    ProjectRef( file("../sprinter"), "sprinter" )
  )
}
