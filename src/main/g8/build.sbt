name := "MyBlog"
version := "0.1.0-SNAPSHOT"
organization := "xyz.nstk"
scalaVersion := "2.12.12"

lazy val root = (project in file("."))
  .enablePlugins(MyBlogPlugin)
