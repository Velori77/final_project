package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
@Getter
public class MainPage extends BasePage {

  private static final String URL_MAIN = "https://demo.prestashop.com/";

  @FindBy(xpath = "//div[@id='loadingMessage']")
  private WebElement spinner;

  @FindBy(xpath = "//div[@id='logo']")
  private WebElement prestaShopLogo;

  //text near the email field "Get our latest news and special sales"
  @FindBy(xpath = "//p[@id='block-newsletter-label']")
  private WebElement nearEmailFieldText;

  //under email field "You may unsubscribe at any moment.
  //For that purpose, please find my contact info in the legal notice."
  @FindBy(xpath = "//div[@class='col-xs-12']//p")
  private WebElement underEmailFieldText;

  //characters on 'SUBSCRIBE' button in upper case
  @FindBy(xpath = "//input[@value='Subscribe']")
  private WebElement textOnSubscribeButton;

  public MainPage() {
    PageFactory.initElements(getDriver(), this);
  }

  public boolean waitForSpinner() {
    try {
      WebDriverWait wait = new WebDriverWait(getDriver(), 10);
      wait.until(ExpectedConditions.visibilityOf(spinner));
      log.info("Spinner displayed");

      return spinner.isDisplayed();
    } catch (org.openqa.selenium.NoSuchElementException
        | org.openqa.selenium.StaleElementReferenceException
        | org.openqa.selenium.TimeoutException e) {

      return false;
    }
  }

  public void handleSpinner(){
    int i=0;
    while (waitForSpinner() && i++ <= 15) {//TODO use lib approach
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void openMainPage() {
    log.info("Opening main page of the application");
    getDriver().get(URL_MAIN);
    handleSpinner();
    waitUntilVisible(prestaShopLogo, 15);
    switchIframe();
  }

  public void enterEmail(String email) {
    log.info("Enter email: {}", email);
  }
}