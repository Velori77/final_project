package stepdefs;

import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommonStepDefs extends BaseStepDefs {

  @When("I click on {string} button/link")
  public void iClickOnSignInButton(String control) {
    switch (control) {
      case "Sign in":
        getMainPage().getSignInButton().click();
        break;
      case "No account? Create one here":
        getSignInPage().getCreateAccountLink().click();
        break;
      case "Save":
        getCreateAccountPage().getSaveButton().click();
        break;
      default:
        Assert.fail("Unexpected control: " + control);
    }
  }
}