package pages;

import components.UserConfig;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
@Getter
public class MyAccountPage extends BasePage {

  public String checkUserInfo() {
    log.info("Check user info");
    WebElement userInfo = getDriver()
        .findElement(By.xpath(
            "//div[@class='user-info']//span[@class='hidden-sm-down' and contains(text(),'" +
                UserConfig.FIRST_AND_LAST_NAME + "')]"));

    waitUntilVisible(userInfo, 10);

    return userInfo.getText();
  }
}