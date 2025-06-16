object WedsCodeAlong extends App {

  val weather: String = "rainy"


  //IF/ELSE good to use when operators are invloves

  if (weather == "rainy") { //path 1
    println("Take a coat with a hood")
  } else if (weather == "sunny"){ //path 2
    println("Wear sun cream") //you can have as many else/if you want
  } else if (weather == "cold") { //path 3
    println("Wear a warm coat")
  } else { // catch for anything not defined in the else/if // path 4
    println("We're unsure, check the weather forecast")
  }


  //PATTERN MATCH

  weather match {
    case "rainy" => println("Take a coat with a hood")
    case "sunny" => println("Wear sun cream")
    case "cold" =>  println("Wear a warm coat")
    case _ => println("We're unsure, check the weather forecast") // same else else statements
  }





val season: String = "winter"
  // How we approach this when we have multiple options:

  if (weather == "cold" || season == "winter") {
    println("Take a coat")
  } else {
    println("A light jacket is fine")
  }


  (weather, season) match  {         // how to pattern match when using multiple options
    case (weather, season) if weather == "cold" || season == "winter" => println("Take a coat")
    case _ =>    println("A light jacket is fine")
  }


  // INT - slightly more careful

  val age: Int = 0

  if (age < 0 ) {
    println(s"You entered an invalid age, try again $age")


  } else if (age <= 18){
   println(s"You are a child because you are $age")
  } else {
    println(s"You are an adult because you are $age")


  }



 age match {
   case age if age < 0 => println("Please enter a valid age")
   case age if age > 18 => println("You are a child")
   case age if age < 18  => println("You are a an adult")



 }


 val grade: Int = 100


  if (grade >= 101) {
    println(s"Please enter a valid score, you entered $grade")
  } else if (grade >= 90) {
    println(s"Your grade is a A because you scored $grade")
  } else if (grade >= 80) {
    println(s"Your grade is a B because you scored $grade")
  } else if (grade >= 70) {
    println(s"Your grade is a C because you scored $grade")
  } else if (grade >= 60) {
    println(s"Your grade is a D because you scored $grade")
  } else if (grade >= 50) {
    println(s"Your grade is a E because you scored $grade")
  } else {
   println(s"You failed because you scored $grade")
  }


//Options - Often used to replace exceptions that can be thrown when we have parameters that might be present, might not.
 // OPTIONS (getor Else)

  val name: Option[String] = Some("Shantel")
  val emptyName: Option[String] = None // Some you don't need the information - would have to test if none is the right requirement or not





//getOrElse is used when we want to return a default value if the None is returned
  //It will also take the some away, leaving us with just the internals
def getName(name: Option[String]): String = name.getOrElse(("This user has left the field empty"))
  println(getName(name)) //Some Shnatel
  println(getName(emptyName)) //None


  //Error catching Try/Catch - Need to account for everything

  try {
    //ALL LOGIC - if/else, pattern match, def, val etc
    val number = "one".toInt      // I want to change the input to an Int from a string //Tries what logic I put in
    println(s"The number is  $number")
  } catch {
    case error: NumberFormatException => println(s"$error was not a valid input") // I will also see error as e
  }







}
