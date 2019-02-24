name := """play-java-API-web"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.12.6", "2.11.12")

enablePlugins(PlayEbean)

libraryDependencies += "com.h2database" % "h2" % "1.4.194"
libraryDependencies += guice
libraryDependencies += evolutions
libraryDependencies += jdbc
libraryDependencies += ehcache
libraryDependencies += "org.postgresql" % "postgresql" % "42.1.1"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
