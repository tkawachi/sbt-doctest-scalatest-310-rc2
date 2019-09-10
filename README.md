Test sbt-doctest with scalatest 3.1.0-RC2

Genrated test code.

```scala
package sbt_doctest

import _root_.org.scalacheck.Arbitrary._

class MainDoctest
    extends _root_.org.scalatest.funspec.AnyFunSpec
    with _root_.org.scalatest.Matchers
    with _root_.org.scalatestplus.scalacheck.Checkers {

  def sbtDoctestTypeEquals[A](a1: => A)(a2: => A): _root_.scala.Unit = {
    val _ = () => (a1, a2)
  }
  def sbtDoctestReplString(any: _root_.scala.Any): _root_.scala.Predef.String = {
    val s = _root_.scala.runtime.ScalaRunTime.replStringOf(any, 1000).init
    if (s.headOption == Some('\n')) s.tail else s
  }

  describe("Main.scala:4: f") {
    it("property at line 8: (i: Int) => ...") {
      check {
        (i: Int) =>
  Main.f(i) == (i *
2)
      }
    }
  }

}
```
