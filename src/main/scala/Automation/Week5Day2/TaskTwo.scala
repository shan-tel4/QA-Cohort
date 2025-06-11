package Automation.Week5Day2

import Automation.Week5Day2.MorningTask.driver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{WebDriver, WebElement}

object TaskTwo extends App {


val driver: WebDriver = new ChromeDriver
driver.get("https://demoqa.com/automation-practice-form")

  driver.navigate().to("https://example.com/")
  println("Navigate to test url")

  driver.navigate().back() // navigate back to previous url
  println("Navigate back")


  driver.navigate().forward() // navigate forward in browser history
  println("Navigate forward")

  driver.navigate().refresh() // refresh browser
  println("Refresh page")

  driver.manage().window().minimize() // to minimise window
  println("Minimise window")

  driver.manage().window().maximize() // to maximise window
  println("Maximise")

  driver.getPageSource.take(300)
  println("Get page source")


driver.quit()

}

