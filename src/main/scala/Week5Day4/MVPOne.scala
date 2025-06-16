package Week5Day4

import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object MVPOne extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://cosmocode.io/automation-practice-webtable/")
  driver.manage().window().maximize()

  val countries = driver.findElement(By.id("countries"))

  val rows = countries.findElements(By.tagName("tr"))
  val js = driver.asInstanceOf[JavascriptExecutor]

  for (i <- 1 until rows.size()) {
    val cells = rows.get(i).findElements(By.tagName("td"))
    js.executeScript("arguments[0].style.backgroundColor ='red'", rows.get(i))
    println(cells.get(1).getText)
  }


}