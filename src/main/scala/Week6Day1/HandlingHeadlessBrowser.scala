package Week6Day1

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingHeadlessBrowser extends App {

  //1. Navigate to test page

  val options = new ChromeOptions() //set up chromeoptions
  options.addArguments("--headless")// parse in the arguments

  val driver: WebDriver = new ChromeDriver(options) // create object for browser
driver.get("https://testpages.eviltester.com/styled/index.html") //navigate to test site
  println("Navigate to test page - pass")

  driver.manage().window().maximize() // to maximise window
  println("Maximise - pass")


driver.quit()



}

