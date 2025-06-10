package Automation.Week5Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object AfternoonTask extends App {

  //1. Navigate to URL
  val driver: WebDriver = new ChromeDriver
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
  println("Navigate to test page")


  // 2. Enter text into the username field (by name)
  val usernameField: WebElement = driver.findElement(By.name("username"))
  usernameField.sendKeys("TestUser123")
  println("Username entered - pass")


  //3. enter password by name
  val passwordField: WebElement = driver.findElement(By.name("password"))
  passwordField.sendKeys("MySecret123")
  println("Password entered - pass")


  //4. Enter comment by id
  val commentBox: WebElement = driver.findElement(By.cssSelector("#HTMLFormElements textarea"))
  commentBox.sendKeys("Automated comment")
  println("Comment entered - pass")


  //5. click check box 1 via xpath
  val checkbox1: WebElement = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"))
  checkbox1.click()
  println("First checkbox clicked using XPath position - pass")

  //6. click link partial link
  val link: WebElement = driver.findElement(By.partialLinkText("EvilTester"))
  link.click()
  println("Clicked link using partial text - pass")

  //7. click link text
  val secondLink: WebElement = driver.findElement(By.linkText("Compendium Developments"))
  link.click()
  println("Clicked on link using linkText - pass")

  //8. submit form by id
  val form: WebElement = driver.findElement(By.id("HTMLFormElements"))
  form.submit()
  println("Form submitted successfully using ID")


  driver.quit()

}

