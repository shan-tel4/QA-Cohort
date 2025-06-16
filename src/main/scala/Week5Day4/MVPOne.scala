package Week5Day4

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object WebTableExample extends App {
  val driver: WebDriver = new ChromeDriver()
  driver.get("https://cosmocode.io/automation-practice-webtable/")
  driver.manage().window().maximize()

  val countries = driver.findElement(By.id("countries"))

  val rows = driver.findElements(By.tagName("tr"))
  for (i <- 0 until rows.size()) {
    val cells = rows.get(i).findElements(By.tagName("td"))
    if (cells.size() > 1) {
      println(cells.get(1).getText)
    }
  }

  driver.quit()
}

