package Automation.Week5Day2

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object MorningTask extends App {

val driver: WebDriver = new ChromeDriver
driver.get("https://www.selenium.dev/selenium/web/web-form.html")


  driver.manage().window().maximize() // to maximise window
  println("maximise")

  driver.manage().window().minimize() // to minimise window

  driver.navigate().to("https://the-internet.herokuapp.com") // we have entered one url to navigate to another url

  driver.navigate().back() // navigate back to previous url


  driver.navigate().forward() // navigate forward in browser history

  driver.navigate().refresh() // refresh browser

  driver.close() // close current tab


  driver.quit()


}

