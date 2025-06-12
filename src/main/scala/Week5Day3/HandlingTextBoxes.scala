package Week5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingTextBoxes extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver()
driver.get("https://www.selenium.dev/selenium/web/web-form.html")

val text  = driver.findElement(By.id("my-text-id"))

  println(text.getAttribute("value")) // Welcome to Mercator
  text.clear()
  println(text.getAttribute("value")) // Empty string

  driver.close()
driver.quit()

}

