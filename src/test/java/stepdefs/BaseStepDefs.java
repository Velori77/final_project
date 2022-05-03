package stepdefs;

import components.TopBar;
import lombok.Getter;
import pages.BasePage;
import pages.CreateAccountPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.SignInPage;

@Getter
public abstract class BaseStepDefs extends BasePage {

  MainPage mainPage = new MainPage();
  TopBar topBar = new TopBar();
  SignInPage signInPage = new SignInPage();
  CreateAccountPage createAccountPage = new CreateAccountPage();
  MyAccountPage myAccountPage = new MyAccountPage();
}