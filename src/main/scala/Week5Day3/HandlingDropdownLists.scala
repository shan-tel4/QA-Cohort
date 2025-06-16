package Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingDropdownLists extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")


 driver.switchTo().frame("iframeResult") // locator stored in a iframe- switch to iframe
  val dropDown = driver.findElement(By.name("cars")) // located select drop down element by name

  val select = new Select(dropDown) // selected the dropdown

  select.selectByVisibleText("Opel") // selected visible text from drop down - value specifity is important
  println("Selected by Visible Text: " + select.getFirstSelectedOption.getText) // get the value of first selected the selecting first option


select.selectByValue("volvo")
  println("Selected by Value: " + select.getFirstSelectedOption.getText) // select by Value


  select.selectByIndex(3)
  println("Selected by Index: " + select.getFirstSelectedOption.getText)

  // TYPES OF DROPDOWN LIST  - standard dropdown, Native HTML (dropdown)







  }



