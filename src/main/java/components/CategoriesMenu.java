package components;


import static pages.BasePage.getDriver;
import static utils.ScreenShot.makeScreenshot;

import io.qameta.allure.Step;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
@Getter
public class CategoriesMenu {

  private final WebDriverWait wait;
  private final Actions actions;

  @FindBy(xpath = "//li[@id='category-3']")
  private WebElement clothes;

  @FindBy(xpath = "//li[@id='category-6']")
  private WebElement accessories;

  @FindBy(xpath = "//li[@id='category-9']")
  private WebElement art;

  public CategoriesMenu() {
    PageFactory.initElements(getDriver(), this);
    wait = new WebDriverWait(getDriver(), 15);
    actions = new Actions(getDriver());
  }

  @Step("Check appearance sub menu items in clothes")
  public ArrayList<String> getClothesItems() {
    wait.until(ExpectedConditions.visibilityOf(clothes));
    actions.moveToElement(clothes)
        .build()
        .perform();
    log.info("Check appearance sub menu items in clothes");
    makeScreenshot();
    ArrayList<String> listItems = new ArrayList<>();
    List<WebElement> webElementList = getDriver()
        .findElements(By.xpath("//li[@id='category-3']//li"));

    for (WebElement element : webElementList) {
      listItems.add(element.getText());
    }

    return listItems;
  }

  @Step("Check appearance items in accessories")
  public ArrayList<String> getAccessoriesItems() {
    wait.until(ExpectedConditions.visibilityOf(accessories));
    actions.moveToElement(accessories)
        .build()
        .perform();
    log.info("Check appearance items in accessories");
    makeScreenshot();
    ArrayList<String> listItems = new ArrayList<>();
    List<WebElement> webElementList = getDriver()
        .findElements(By.xpath("//li[@id='category-6']//li"));

    for (WebElement element : webElementList) {
      listItems.add(element.getText());
    }

    return listItems;
  }

  @Step("Check no any sub menu in Art")
  public boolean checkArtItems() {
    wait.until(ExpectedConditions.visibilityOf(art));
    actions.moveToElement(art)
        .build()
        .perform();
    makeScreenshot();
    log.info("Check no any sub menu in Art");
    return art.isDisplayed();
  }
}
