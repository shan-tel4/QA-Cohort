package Week6Day1

import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.io.FileHandler

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object ScreenCapture extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  // Save static screenshot
  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcFull, new File("/Users/shantel.shaw/Desktop/HandlingScreenShots/fullpage.png"))

  // Save timestamped screenshot
  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(
    s"/Users/shantel.shaw/Desktop/HandlingScreenShots/TestResult_$timeStamp.png"))

  driver.quit()
}

