package stepdefs;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CategoriesStepDefs extends BaseStepDefs {

  @When("Hover mouse over {string} I check that {string} and {string} sub menu items appears")
  public void checkAppearanceMenWomenSubMenuInClothes(String menuItem, String subItem1,
      String subItem2) {
    if (menuItem.equals("CLOTHES")) {
      assertThat(getCategoriesMenu().getClothesItems()).contains(subItem1);
      assertThat(getCategoriesMenu().getClothesItems()).contains(subItem2);
    } else if (menuItem.equals("ACCESSORIES")) {
      assertThat(getCategoriesMenu().getAccessoriesItems()).contains(subItem1);
      assertThat(getCategoriesMenu().getAccessoriesItems()).contains(subItem2);
    } else {
      Assert.fail("Not implemented for: " + menuItem);
    }
  }

  @Then("Hover mouse over ART I check that no any sub category appears")
  public void checkExistenceSubMenuInArt() {
    assertThat(getCategoriesMenu().checkArtItems()).isEqualTo(true);
  }
}

