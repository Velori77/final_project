package stepdefs;

import static components.UserConfig.BIRTHDATE;
import static components.UserConfig.EMAIL;
import static components.UserConfig.FIRST_NAME;
import static components.UserConfig.FIRST_NAME_BORDER_RED_COLOR;
import static components.UserConfig.INVALID_NAME;
import static components.UserConfig.LAST_NAME;
import static components.UserConfig.PASSWORD;
import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateAccountPageStepDefs extends BaseStepDefs {

  @And("I fill the form with {string} data")
  public void fillValidData(String type) {
    if ("valid".equals(type)) {
      getCreateAccountPage().fillRegistration(FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, BIRTHDATE);
    } else if ("invalid".equals(type)) {
      getCreateAccountPage().fillRegistration(INVALID_NAME, LAST_NAME, EMAIL, PASSWORD, BIRTHDATE);
    } else {
      Assert.fail("Unexpected type: " + type);
    }
  }

  @And("I check that First name highlighted in red")
  public void checkBorderColor() {
    assertThat(getCreateAccountPage().borderFirstName()).isEqualTo(FIRST_NAME_BORDER_RED_COLOR);
  }

  @Then("I check that pop-up with text {string} appear under field")
  public void checkErrorMessage(String message) {
    assertThat(getCreateAccountPage().errorMessage()).isEqualTo(message);
  }
}
