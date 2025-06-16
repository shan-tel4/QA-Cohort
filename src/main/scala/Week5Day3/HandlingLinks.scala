package Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingLinks extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver()
driver.get("https://www.selenium.dev/")

// handling Hyperlinks

val myLink = driver.findElement(By.linkText("Documentation"))

val myLinkUrl =  myLink.getAttribute("href")
  println("Destination URL" +myLinkUrl)    // to get destination url

driver.quit()

}

