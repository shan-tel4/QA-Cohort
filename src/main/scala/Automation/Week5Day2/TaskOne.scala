package Automation.Week5Day2

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object TaskOne extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver
driver.get("https://demoqa.com/browser-windows")

  driver.navigate().to("https://demoqa.com/browser-windows")
  println("Navigate to current url")



  val title = driver.getTitle
  println(s"Page title: $title")


  driver.close()
driver.quit()

}

