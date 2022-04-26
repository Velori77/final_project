package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
@Getter
public class MainPage extends BasePage {

  private final static String URL_MAIN = "https://demo.prestashop.com/";

  @FindBy(xpath = "//div[@id='_desktop_logo']")
  private WebElement myStore;

  public MainPage() {
    PageFactory.initElements(getDriver(), this);
  }

  public void openMainPage() {
    log.info("Opening main page of the application");
    getDriver().get(URL_MAIN);
    waitUntilVisible(myStore, 15);
  }

  public void enterEmail(String email) {
    log.info("Enter email: {}", email);
  }
}
