package pages;

import components.IFrame;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
@Getter
public abstract class BasePage implements IFrame {

  private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

  public static void setDriverThreadLocal(WebDriver webDriver) {
    DRIVER_THREAD_LOCAL.set(webDriver);
  }

  public static WebDriver getDriver() {
    return DRIVER_THREAD_LOCAL.get();
  }

  public static WebElement waitUntilVisible(WebElement element, int time) {
    return new WebDriverWait(getDriver(), time)
        .until(ExpectedConditions.visibilityOf(element));
  }

  public static void scrollToElement(WebElement el) {
    log.info("Scroll page to element: {}", el);
    waitUntilVisible(el, 10);
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    js.executeScript("arguments[0].scrollIntoView();", el);
  }

  public WebElement waitUntilClickable(WebElement element, int time) {
    return new WebDriverWait(getDriver(), time)
        .until(ExpectedConditions.elementToBeClickable(element));
  }
}
