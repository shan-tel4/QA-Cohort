package Automation.Week5Day2

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object MorningTask extends App {

val driver: WebDriver = new ChromeDriver
driver.get("https://www.selenium.dev/selenium/web/web-form.html")


  driver.manage().window().maximize() // to maximise screen

  driver.navigate().to("https://the-internet.herokuapp.com") // we have entered one url to navigate to another url

  driver.navigate().back() // navigate back to previous url


  driver.navigate().forward() // navigate forward again


  driver.quit()


}

