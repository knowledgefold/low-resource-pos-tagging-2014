import com.typesafe.sbt.SbtStartScript

name := "low-resource-pos-tagging-2014"

version := "0.0.1"

scalaVersion := "2.11.2"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases",
  "OpenNLP repo" at "http://opennlp.sourceforge.net/maven2"
)

libraryDependencies ++= Seq(
  "org.apache.opennlp" % "opennlp-tools" % "1.5.2-incubating",
  "org.scalaz" %% "scalaz-core" % "7.0.6", // "7.1.0"
  "junit" % "junit" % "4.11",
  "com.novocode" % "junit-interface" % "0.10" % "test") //switch to ScalaTest at some point...

// Junto dependencies:
libraryDependencies ++= Seq(
  "org.jgrapht" % "jgrapht-jdk1.5" % "0.7.3",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.6",
  "org.rogach" %% "scallop" % "0.9.5",
  "net.sf.trove4j" % "trove4j" % "3.0.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0")



seq(SbtStartScript.startScriptForClassesSettings: _*)

SbtStartScript.stage in Compile := Unit

//mainClass in (Compile, run) := None

scalacOptions ++= Seq("-deprecation", "-feature")
