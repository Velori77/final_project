package stepdefs;

import components.CategoriesMenu;
import components.TopBar;
import pages.CreateAccountPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.SignInPage;

public abstract class BaseStepDefs {

  ThreadLocal<MainPage> mainPage = new ThreadLocal<>();
  ThreadLocal<TopBar> topBar = new ThreadLocal<>();
  ThreadLocal<SignInPage> signInPage = new ThreadLocal<>();
  ThreadLocal<CreateAccountPage> createAccountPage = new ThreadLocal<>();
  ThreadLocal<MyAccountPage> myAccountPage = new ThreadLocal<>();
  ThreadLocal<CategoriesMenu> categoriesMenu = new ThreadLocal<>();

  public MainPage getMainPage() {
    if (mainPage.get() == null) {
      mainPage.set(new MainPage());
    }

    return mainPage.get();
  }

  public TopBar getTopBar() {
    if (topBar.get() == null) {
      topBar.set(new TopBar());
    }

    return topBar.get();
  }

  public SignInPage getSignInPage() {
    if (signInPage.get() == null) {
      signInPage.set(new SignInPage());
    }

    return signInPage.get();
  }

  public CreateAccountPage getCreateAccountPage() {
    if (createAccountPage.get() == null) {
      createAccountPage.set(new CreateAccountPage());
    }

    return createAccountPage.get();
  }

  public MyAccountPage getMyAccountPage() {
    if (myAccountPage.get() == null) {
      myAccountPage.set(new MyAccountPage());
    }

    return myAccountPage.get();
  }

  public CategoriesMenu getCategoriesMenu() {
    if (categoriesMenu.get() == null) {
      categoriesMenu.set(new CategoriesMenu());
    }

    return categoriesMenu.get();
  }
}