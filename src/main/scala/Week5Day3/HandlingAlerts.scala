package Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingAlerts extends App {

  // Types of Alerts - Simples alerts (ok)
  // Confirmation alerts - Message with ok and cancel
  // prompt alert ok & cancel

  //syntax - driver.switchTo().alert()



  //1.Simple Alert
val driver: WebDriver = new ChromeDriver()
driver.get("https://the-internet.herokuapp.com/javascript_alerts")

driver.findElement((By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"))).click()
driver.switchTo().alert().accept()
  println("Test passed for single alert")



  driver.findElement((By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"))).click()
  driver.switchTo().alert().dismiss()
  println("Confirmation Alert Passed")

// Confirmation Alert


// Prompt alert
  driver.findElement((By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"))).click()
  val alert1 = driver.switchTo().alert()
println(alert1.getText)
  alert1.sendKeys("Welcome")
  alert1.accept()


driver.quit()

}

