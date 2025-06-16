import javax.swing.InputMap
import scala.language.postfixOps

object TueCollectionsCodeAlong extends App {

  //set

  val firstSet: Set[Int] = Set(1, 2, 3, 4, 5, 5) //Not ordered and does not allow repeated values
  println("First set: " + firstSet)


  //sequence
  val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 5) //Ordered, allows repeat values
  println("First sequences: " + firstSeq)


  //Map take 2 parameters (key -> value) we call these Key Value pairs. The key must be unique (we cannot have 2 keys that are the same). // How to create a map
  val firstMap: Map[String, Int] = Map(
    "one" -> 1,
    "two" -> 2,
    "three" -> 3,
    "four" -> 4,
    "five" -> 5
    // "five" -> will remove when compiled (doesn't theow an error which is risky when working with data)

  )
  println("First Map: " + firstMap)

  //SEQ
  //Accessing data
  val getSeqHead: Int = firstSeq.head //index position 0 (first element)
  println("Seq Head: " + getSeqHead)


  val getSeqTail: Seq[Int] = firstSeq.tail // Everything BUT the head
  println("Seq Tail: " + getSeqTail)

  val getSeqIndex: Int = firstSeq(3) // only works with ordered collections
  println("Seq Index" + getSeqIndex)


  //SET


  val getSetIndex: Boolean = firstSet(30) // checks is the VALUE is contained in the Set (can also use .contains(3))
  println(getSetIndex)

  //Often filter for information
  val filterSet: Set[Int] = firstSet.filter((_ < 3))
  println("Filter  Set" + filterSet)

  val filterNotSet: Set[Int] = firstSet.filterNot(_ < 3)
  println("FilterNot set: " + filterNotSet)

  val evenSet: Set[Int] = firstSet.filter(_ % 2 == 0) // under is that I don't want to give it a name // This makes the set even
  println("Even Set: " + evenSet)


  //Map Filters - Keys and Values, easier to grab the value than the key

  val getMapValue: Int = firstMap("one") //Enter the kry to get the value
  println("Get Map Value: " + getMapValue) // only works when you enter a string

  val getMapKey: String = firstMap.find(_._2 == 2).get._1 // find the value that is equal to 1 and get the key that matches it.
  println("Get Map Key: " + getMapKey)


  val listOfNames: Seq[String] = Seq("Shantel", "Mandy", "Claire") //Ordered, allows repeat values
  println("List Of Names: " + listOfNames)



  //map (method - lowercase 'm)
  // Use a  map to iterate (move through) a collection


  // Bonus of using methods is that you can make it universal to any methods as we can parse in information


  def tripledSet(inputSet: Set[Int]): Set[Int] = inputSet.map { // curly braces for actions
    //  _ * 3  (if you don't want it to be specific) This is the same as below

    number => number * 3
    // take number, iteratate through set  and times it by 3

    // How to write my print line

  }

  println("Tripled Set: " + tripledSet(firstSet))


  def tripledMap(inputMap: Map[String, Int]): Map[String, Int] = inputMap.map {
    case (key, value) => (key, value * 3) //Can also change the key e.g
  }

  println("Tripled Map: " + tripledMap((firstMap)))


  // . exists = all that COULD be e.g (values more than 2)

  // .contains  = (check - does it contain it, true or false - getting a boolean back)


  // Flat Maps - Will take everything out of a list and list it as a individual character - when things are nested

  val newSeq: Seq[Int] = Seq(6, 7, 8)

  // Append - add to end
  val appendedListOne = firstSeq :+ newSeq
  println("Append :+ " + appendedListOne)
  val appendedListTwo = firstSeq ++ newSeq
  println("Append ++ " + appendedListTwo)


  //Prepend

  val prependSeqOne = newSeq ++ firstSeq //ORDER MATERS
  println("Prepend ++ " + prependSeqOne)


  //Prepend sequence and append works the same for a set too


  // MVP Afternoon Task

  //1 + 2

  val foreNames: Seq[String] = Seq("Tyler", "Claire", "Tyler", "Sarah", "Claire") //Ordered, allows repeat values
  println("Taxpayer forenames : " + foreNames)


  //3 & 4
  def countTaxpayerOccurrences(foreNames: Seq[String], targetName: String): Int = {
    foreNames.count(name => name == targetName)
  }

  println(countTaxpayerOccurrences(foreNames, "Tyler"))


  //5 + 6

  val noDuplicateForeNames: Set[String] = foreNames.toSet
  println("List without duplicate forenames : " + noDuplicateForeNames)


  //7 & 8 - For this question use an iterable


  //9
  val failedLoginAttempts: Map[String, Int] = Map(
    "user1" -> 2,
    "user2" -> 1,
    "user3" -> 1,
    "user4" -> 1,
    "user5" -> 1,
    //    "user6" -> 1, - removed user at index 5
    "user7" -> 3

  )
  println("Failed log in attempts: " + failedLoginAttempts)


  val user1: String = failedLoginAttempts.keys.toSeq.head
  val attempts0: Int = failedLoginAttempts(user1)

  println(s"User at index 0: $user1, Failed attempts: $attempts0")






}

