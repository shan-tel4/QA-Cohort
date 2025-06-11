package Automation.Week5Day2

import Automation.Week5Day2.MorningTask.driver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{WebDriver, WebElement}

object TaskTwo extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver
driver.get("https://demoqa.com/automation-practice-form")

  driver.navigate().to("https://demoqa.com/automation-practice-form")




driver.quit()

}

