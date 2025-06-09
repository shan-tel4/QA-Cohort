package Automation.Week4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object ByID extends App {

//Instantiating the ChromeDriver for interacting the chrome browser
  val driver: WebDriver = new ChromeDriver()
//Accessing url for testing
driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")


val emailAddress: WebElement = driver.findElement(By.id("email"))
emailAddress.sendKeys("test@gmail.com")
println("Email address entered - Passed")


val password: WebElement = driver.findElement(By.id("password"))
password.sendKeys("password123")
println("Password entered - Passed")


 val login: WebElement = driver.findElement(By.id("login"))
  login.click()
  println("login in successful")

  driver.quit()



}

