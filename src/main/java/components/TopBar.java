package components;

import static pages.BasePage.getDriver;
import static pages.BasePage.scrollToElement;

import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
@Getter
public class TopBar {

  private final WebDriverWait wait;

  @FindBy(xpath = "//i[@class='material-icons expand-more']")
  private WebElement languageBarButton;

  @FindBy(xpath = "//ul[@class='dropdown-menu hidden-sm-down']")
  private WebElement languageBarList;

  public TopBar() {
    PageFactory.initElements(getDriver(), this);
    wait = new WebDriverWait(getDriver(), 15);
  }

  public int getAmountLanguages() {
    log.info("Check amount languages");

    return getDriver().findElements(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//li"))//TODO add element to pageFactory
        .size();
  }

  public boolean checkLanguagePresentInDropdown(String lngToCheck) {
    log.info("Check language: {} exist in dropDown", lngToCheck);
    wait.until(ExpectedConditions.visibilityOf(languageBarList));
    List<WebElement> languagesList =
        getDriver().findElements(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//li"));

    for (WebElement element : languagesList) {
      WebElement lngItem = element.findElement(By.xpath("//a[@data-iso-code='uk']"));
      scrollToElement(lngItem);
      String lngItemText = lngItem.getText();

      return lngItemText.equals(lngToCheck);
    }

    return false;
  }
}
