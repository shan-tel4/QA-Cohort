package Week5Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object MorningTask extends App {

val driver: WebDriver = new ChromeDriver()
driver.get("")


driver.quit()

}

