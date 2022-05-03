package stepdefs;

import static components.UserConfig.FIRST_AND_LAST_NAME;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import io.cucumber.java.en.Then;

public class MyAccountPageStepDefs extends BaseStepDefs {

  @Then("I check my name appear near cart button")
  public void checkRegistrationSuccessful() {
    assertThat(getMyAccountPage().checkUserInfo()).contains(FIRST_AND_LAST_NAME);
  }
}
