package stepdefs;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageStepDefs {

  MainPage mainPage = new MainPage();

  @Given("Go to the the main page")
  public void iAmOnTheMainPage() {
    mainPage.openMainPage();
  }
}
