package Week6Day1


import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object MVP extends App {

  //1. Navigate to test page - headless

  val options = new ChromeOptions() //set up chromeoptions
  options.addArguments("--headless=new")// parse in the arguments

  val driver: WebDriver = new ChromeDriver(options) // create object for browser
driver.get("https://the-internet.herokuapp.com/login") //navigate to test site
  println("Navigate to test page - pass")

  driver.manage().window().maximize() // to maximise window
  println("Maximise - pass")

//2. input username
  val username: WebElement = driver.findElement(By.name("username"))
  username.sendKeys("tomsmith")
  println("Username entered - pass")

//3 input password
  val password: WebElement = driver.findElement(By.name("password"))
  password.sendKeys("SuperSecretPassword!")
  println("password entered - pass")

//4 login via xpath
  val loginButton = driver.findElement(By.xpath("//*[@id='login']/button"))
  loginButton.click()
  println("Login button clicked successfully")

  // 5 Save static screenshot
  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcFull, new File("/Users/shantel.shaw/Desktop/HandlingScreenShots/fullpage.png"))

  // 6 Save timestamped screenshot
  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(s"/Users/shantel.shaw/Desktop/HandlingScreenShots/TestResult_$timeStamp.png"))
  println("Screenshot successful")


  // do try catch statement

  //7 quit test

  driver.quit()


}

