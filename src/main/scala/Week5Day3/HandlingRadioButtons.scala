package Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingRadioButtons extends App {

  //1. Navigate to test page
val driver: WebDriver = new ChromeDriver()
driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")




driver.quit()

}

