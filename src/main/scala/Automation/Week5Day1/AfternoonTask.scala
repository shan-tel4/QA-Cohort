package Automation.Week5Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object AfternoonTask extends App {

  //1. Navigate to URL
  val driver : WebDriver = new ChromeDriver
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
  println("Navigated to test page")


  //2. Enter text into fields using different locators

  //username field id
  //2. Enter username by name

  // 2. Enter text into the username field (by name)
  val usernameField: WebElement = driver.findElement(By.name("username"))
  usernameField.sendKeys("TestUser123")
  println("Username entered - pass")



  //3. enter password by name
  val passwordField = driver.findElement(By.name("password"))
  passwordField.sendKeys("MySecret123")
  println("Password entered - pass")


  //4. Enter comment by id

  val commentBox = driver.findElement(By.cssSelector("#HTMLFormElements textarea"))
  commentBox.sendKeys("Automated comment")
  println("Comment entered - pass")


//5
val checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"))
  checkbox1.click()
  println("First checkbox clicked using XPath position - pass")

  //6

  val link = driver.findElement(By.partialLinkText("EvilTester"))
  link.click()
  println("Clicked link using partial text - pass")





  driver.quit()


}

