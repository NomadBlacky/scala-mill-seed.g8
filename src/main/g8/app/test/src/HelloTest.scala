import org.scalatest.FunSuite

class HelloTest extends FunSuite {

  test("""Hello#text should returns "Hello World!"""") {
    assert(Hello.text == "Hello World!")
  }
}
