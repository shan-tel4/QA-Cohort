package Week2

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
  println(loki.speak)


  // MVP Task 1

  //a
  val sum: Int = 3 + 4
  val product: Int = sum * 57
  val conditonA: Boolean = product < 300
  println(3 + 4 * 57 < 300) // true


  //b
  val division: Int = 144 / 12
  val conditionB: Boolean = division >= 12
  println(conditionB) // true

  //c
  val Cat: String = "Cat"
  val Dog: String = "Dog"
  val conditionC: Boolean = Cat < Dog
  println(conditionC) // true

  //d
  val Rabbit: String = "Rabbit"
  val Hamster: String = "Hamster"
  val conditionD: Boolean = Rabbit < Hamster
  println(conditionD) // false

  //e

  val num: Int = 17
  val conditionE: Boolean = num % 2 != 0
  println(conditionE) // true

  //f
  val division1: Double = 75 / 9
  val division2: Double = 89 / 6
  val conditionF: Boolean = division1 < 30 && division2 < 20
  println(conditionF) // true


  // MVP Task 2

  // Example

  val message: String = "I love Scala already" // This stores the string, but nothing is printed

  println("I love Scala already") // This is a function call, and it prints the string to the output (console)

  // MVP Task 3

  def squareRoot (x: Int): Double = {
    math.sqrt(x)
  }

  val result: Double = squareRoot((16))
  println(result) // Output 4.0




  //MVP Task 4

 def oddNumber(n: Int): Boolean = {
   if (n == 0) false
   else (n % 10) % 2 != 0 || oddNumber(n / 10)
 }
  println(oddNumber((245))) // checks if number inputed is odd


  // Task 5

  class Book(val title: String,
             val author: String,
             val isbn: String,
             val yearPublished: Int,
             private var isAvailable: Boolean = true) {

    def checkout(): Unit = {
      if (isAvailable) {
        isAvailable = false
        println(s"You have successfully checked out '$title'.")
      } else {
        println(s"Sorry, '$title' is currently not available.")
      }
    }

    def returnBook(): Unit = {
      isAvailable = true
      println(s"'$title' has been returned and is now available.")
    }

    def availabilityStatus: String = {
      if (isAvailable) "Available" else "Checked Out"
    }

    def getSummary(): String = {
      s"'$title' by $author, published in $yearPublished. ISBN: $isbn. Status: ${availabilityStatus}"
    }
  }
  val book1 = new Book("Scala Fundamentals", "Shantel Shaw", "97804515345", 1949)
  println(book1.getSummary())


  book1.checkout()
  println(book1.getSummary())

  book1.returnBook()


//Extension
  // 1. convert a string to uppercase

val string1 = "hello world!"
val string1Upper = string1.toUpperCase

  println(string1Upper)

  //2.
 val string2 = "hello world!"
  println(string2.capitalize)


//3.
"STRING"  == "string" // false as in Scala it is case sensitive so will return as false


}

