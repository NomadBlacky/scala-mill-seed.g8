import mill._, scalalib._

trait ScalaTest extends TestModule {
  def ivyDeps = Agg(ivy"org.scalatest::scalatest:3.0.5")
  def testFrameworks = Seq("org.scalatest.tools.Framework")
}

object app extends ScalaModule {
  def scalaVersion = "2.12.8"

  object test extends Tests with ScalaTest
}
