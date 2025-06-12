package Week5Day3


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver, WebElement}

object MVP extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver()
driver.get("https://testpages.eviltester.com/styled/index.html") //navigate to test site
  println("Navigate to test page - pass")

  driver.manage().window().maximize() // to maximise window
  println("Maximise - pass")


 //2. Navigate to html form page
  driver.navigate().to("https://testpages.eviltester.com/styled/basic-html-form-test.html") // navigate to html form page
  println("Navigate html form page - pass")


  //2. Input username via by.name
  val username: WebElement = driver.findElement(By.name("username"))
  username.sendKeys("Shantel")
  println("Username entered - pass")


  //3. Input password via by.name
  val password: WebElement = driver.findElement(By.name("password"))
  password.sendKeys("Password123")
  println("Password entered - pass")

  //4. Locate and select checkbox via xpath
  val checkbox1: WebElement = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]"))
  checkbox1.click()
  println("First checkbox clicked using XPath position - pass")

  //5. Find the radio button via XPath
  val radioButton: WebElement = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]"))

  // Check if it is not already selected
  if (!radioButton.isSelected) {
    radioButton.click()
    println("Radio button selected - pass")
  } else {
    println("Radio button was already selected")
  }

//6. Select drop down item

  val dropDown = driver.findElement(By.name("dropdown")) // located select drop down element by name
  val select = new Select(dropDown) // selected the dropdown
  select.selectByVisibleText("Drop Down Item 1") // selected visible text from drop down - value specifity is important
  println("Selected by Visible Text: " + select.getFirstSelectedOption.getText,  " pass") // get the value of first selected the selecting first option



  //7. Submit form by id
  val form: WebElement = driver.findElement(By.id("HTMLFormElements"))
  form.submit()
  println("Form submitted successfully using ID")

  //8. Click link to return to home page using cssSlector
  val homeLink = driver.findElement(By.cssSelector("a[href='/styled/index.html']"))
  homeLink.click()
  println("return to homepage - pass")

driver.quit()



}

