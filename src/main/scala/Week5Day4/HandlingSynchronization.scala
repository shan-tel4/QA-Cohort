package Week5Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HandlingWindows extends App {

val driver: WebDriver = new ChromeDriver()
driver.get("https://the-internet.herokuapp.com/windows")
  driver.manage().window().maximize()

  val parentWindow = driver.getWindowHandle()
  println("Handle for the parent window" +parentWindow)


  driver.findElement(By.linkText("Click Here")).click()

    val allWindows:List[String] = driver.getWindowHandles.asScala.toList
  val it = allWindows.iterator

  while(it.hasNext) {
    val handle = it.next()

    if (handle != parentWindow){
      driver.switchTo().window(handle)
      println("The current window" +handle)

  println("This page title is - " +driver.getTitle())

    }

  }






  driver.quit()




}

