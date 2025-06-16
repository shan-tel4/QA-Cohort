package Week6Day1

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.{By, WebDriver, NoSuchElementException}


object HandlingExceptions extends App {

  //1. Navigate to test page


  val driver: WebDriver = new ChromeDriver() // create object for browser


  try {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html") //navigate to test site
    println("Navigate to test page - pass")

    driver.findElement((By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"))).click()
  }
  catch {
    case e: NoSuchElementException =>
      println("element not found")
  } finally {
    if(driver != null){
      driver.quit()

    }
  }



}

