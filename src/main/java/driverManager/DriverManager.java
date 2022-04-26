package driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.BasePage;

public class DriverManager {

  public static synchronized void setUpDriver() {
    setBrowser("chrome");
  }

  public static void setBrowser(String browser) {
    WebDriver driver;
    switch (browser) {
      case "chrome":
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        break;
      case "firefox":
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        break;
      case "internetExplorer":
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        break;
      default:
        throw new RuntimeException("Unsupported browser name: " + browser);
    }
    driver.manage().window().maximize();
    BasePage.setDriverThreadLocal(driver);
  }

  public static void quiteDriver() {
    BasePage.getDriver().quit();
  }
}
