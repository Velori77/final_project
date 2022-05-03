package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
@Getter
public class SignInPage extends BasePage {

  @FindBy(xpath = "//a[@data-link-action='display-register-form']")
  private WebElement createAccountLink;

  public SignInPage() {
    PageFactory.initElements(getDriver(), this);
  }

  public void clickOnCreateAccount() {
    log.info("Click on create account");
    waitUntilVisible(createAccountLink, 10).click();
  }
}
