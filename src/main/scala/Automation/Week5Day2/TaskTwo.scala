package Automation.Week5Day2

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object TaskOne extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver
driver.get("https://demoqa.com/browser-windows")


  val pageTitle: WebElement =  driver.navigate().to("https://demoqa.com/browser-windows")
  println("Page title is: " + pageTitle)


val currentURL: String = driver.getCurrentUrl
  println("Current URL is:" + currentURL)

driver.quit()

}

