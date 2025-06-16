import Week2.Calculator
import org.scalatest.flatspec.AnyFlatSpec

class CalculatorSpec extends AnyFlatSpec {

  val calc: Calculator = new Calculator
  "add" should "add 2 int 's together" in {
    val input = calc.add(1, 2)
    val expectedResult = 3 //
    assert(input == expectedResult)
  }

  val calc2: Calculator = new Calculator
  "multiply" should "multiply 2 int 's together" in {
    val input = calc2.multiply(2, 3)
    val expectedResult = 6 //
    assert(input == expectedResult)
  }

  val calc3: Calculator = new Calculator
  "subtract" should "subtract x from y" in {
    val input = calc3.subtract(10, 3)
    val expectedResult = 7 //
    assert(input == expectedResult)
  }








}
