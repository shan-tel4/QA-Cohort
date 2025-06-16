package Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver, WebElement}

object Extension extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver()
driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php") //navigate to test site
  println("Navigate to test page - pass")

  driver.manage().window().maximize() // to maximise window
  println("Maximise - pass")

  //
  driver.findElement((By.xpath("/html/body/main/div/div/div[2]/div[1]/button"))).click()
  driver.switchTo().alert().accept()
  println("Test passed for single alert")








}

