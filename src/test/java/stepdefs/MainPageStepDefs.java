package stepdefs;

import static utils.Helper.isStringUpperCase;

import components.TopBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;

public class MainPageStepDefs {
  //add softAssert field here
  MainPage mainPage = new MainPage();
  TopBar topBar = new TopBar();

  @Given("Go to the the main page")
  public void iAmOnTheMainPage() {
    mainPage.openMainPage();
  }

  @Then("On the button of the page check that text near the email field equals {string}")
  public void onTheButtonOfThePageCheckThatTextNearTheEmailField(String expectedFieldText) {
    mainPage.scrollToElement(mainPage.getNearEmailFieldText());
    Assert.assertEquals("Unexpected text near the email field", //TODO use softAssert
        expectedFieldText, mainPage.getNearEmailFieldText().getText());
  }

  @And("On the button of the page check that text under email field contains {string}")
  public void onTheButtonOfThePageCheckThatTextUnderEmailFieldContainsYouMayUnsubscribe(String expectedFieldText) {
    Assert.assertEquals("Unexpected text under the email field", //TODO use softAssert
        expectedFieldText, mainPage.getUnderEmailFieldText().getText());
  }

  @And("Check that all characters on SUBSCRIBE button in upper case")
  public void checkThatAllCharactersOnSUBSCRIBEButtonInUpperCase() {
    Assert.assertTrue("Unexpected version of the inscription",
        isStringUpperCase(mainPage.getTextOnSubscribeButton().getText()));
  }

  @When("I go to the Language bar")
  public void iGoToTheLanguageBar() {
    topBar.getLanguageBarButton().click();
  }

  @Then("I am checking {int} languages exists in the dropdown menu")
  public void iAmCheckingLanguagesExistsDropdownInTheTopMenu(int langQtyExpected) {
    Assert.assertEquals("Unexpected quantity languages via dropdown in the top menu",
        langQtyExpected, topBar.getAmountLanguages());
  }

  @And("Also I am checking {string} exist in dropdown")
  public void alsoIAmCheckingLngExistInDropdown(String lngToCheck) {
    Assert.assertTrue("Checking of language existence in dropdown of " + lngToCheck,
        topBar.checkLanguagePresentInDropdown(lngToCheck));
  }
}