crossScalaVersions := Seq("2.11.12", "2.12.6", "2.13.0")

// Declares scalatest, scalacheck dependencies explicitly.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0-RC2" % "test",
  "org.scalatestplus" %% "scalatestplus-scalacheck" % "3.1.0.0-RC2" % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
)

doctestTestFramework := DoctestTestFramework.ScalaTest
