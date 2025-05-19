object MonCodeAlong extends App {

  val melons = 5 * 50
  val apples = 2 * 10
  val fizzyDrink = 6 * (100 * 1.20)
  // val total = melons + apples + fizzyDrink

  var total: Double = 0
  total = total + apples
  total = total + melons
  total = total + fizzyDrink
  println(total)

  //  println(melons)
  //  println(apples)
  //  println(fizzyDrink)
  //  println(total)

// Types
  val wholeNumber: Int = 1090
  val littleNumber: Short = 68 // RARE JUST USE INT
  val bigNumber: Long = 56574883637L // MUST PUT L AT THE END
  val littleDecimal: Float = 2.4646f // Must put f at the end - VERY RARE
  val decimal: Double = 44774.983
  val text: String = "Hello world!"
  val trueFalse: Boolean = true //false
  val falseTrue: Boolean = false

  println(trueFalse == falseTrue)

  // OPERATORS


  val a: Int = 10
  val b: Int = 3
  val c: Int = 5

  val add: Int = a + b
  val subtract: Int = c - b
  val divide: Int = a / b
  val multiply: Int = a * b
  val modulus: Int = a % b // modulus used for finding even and odd numbers
  val even: Int = a % 2
  println(even)
  println(modulus)

val equality: Boolean = a == a
println(equality)

  val inequality: Boolean = a != b // NOT EQUAL TO

  val lessThan: Boolean = b < c
  val lessThanEqualTo: Boolean = b>c
  val greatThanEqualsTo: Boolean = b>=c


  //LOGICAL

  val and: Boolean = true && true // both must be true to return as true

  val or: Boolean = true || false // either side can be true to return true

  val not: Boolean = !false

  //METHODS

  def makeACupOfTea(sugar:Int, milk:Boolean): String = {
    s"You have made a cup of tea with $sugar spoons of sugar. Your milk selection is: $milk"
  }
  println(makeACupOfTea(7, milk = true))
  println(makeACupOfTea(1, milk = false))

//  val vat: Double = 1.2
//
//  def finalPriceWithVat(price: Double) {}



  // CLASSES (think of these as a type)
  // THIS IS MY INSTRUCTION - Doesn't mean a lot of it's own
  class Dog (val name:String, val age:Int, val likesBananas: Boolean) {
    def speak:String = "woof" //declared in advance as it is the same for every dog
  }

  // Use the class to make objects (e.g Dog)
  //Object of the type
  val loki:Dog = new Dog("Loki", 5, true)
  // How do I access?
  println(loki.)


}

