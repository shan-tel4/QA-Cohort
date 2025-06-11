package Automation.Week5Day2

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object TaskThree extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver
driver.get("https://demoqa.com/automation-practice-form")

  driver.navigate().to("https://demoqa.com/automation-practice-form")
  println("Navigate to test site")




driver.quit()

}

