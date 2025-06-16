package Week5Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HandlingStaticTable extends App {

val driver: WebDriver = new ChromeDriver()
driver.get("https://www.w3schools.com/html/html_tables.asp")
  driver.manage().window().maximize()


 val rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[position() > 1]"))









  driver.quit()




}

