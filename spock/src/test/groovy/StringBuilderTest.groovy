import spock.lang.*

class StringBuilderSpec extends Specification {
  def "StringBuilder append"() {
    expect:
		// un-comment ending of following line to see a test fail (no space).
		new StringBuilder().append("Hello").append("World") // .equals("Hello World")
  }
}
