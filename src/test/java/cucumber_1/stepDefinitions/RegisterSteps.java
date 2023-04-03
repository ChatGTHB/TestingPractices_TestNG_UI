package cucumber_1.stepDefinitions;

import cucumber_1.pages.AccountPage;
import cucumber_1.pages.HomePage;
import cucumber_1.utility_C1.BaseDriver;
import io.cucumber.java.en.*;

public class RegisterSteps {
    AccountPage ap =new AccountPage();
    HomePage hp = new HomePage();
    @Given("Navigate to Shop Demoqa")
    public void navigate_to_shop_demoqa() {
        BaseDriver.getDriver().get("https://shop.demoqa.com/");
    }
    @When("Click to My Account button")
    public void click_to_my_account_button() {
        hp.dismiss.click();
        hp.myAccount.click();
    }
    @When("Fill in the username input as {string}")
    public void fill_in_the_username_input_as(String username) {
        ap.registerUsername.sendKeys(username);
    }
    @When("Fill in the email input as {string}")
    public void fill_in_the_email_input_as(String email) {
        ap.registerEmail.sendKeys(email);
    }
    @When("Fill in the password input as {string}")
    public void fill_in_the_password_input_as(String password) {
        ap.registerPassword.sendKeys(password);
    }
    @When("Click to Register button")
    public void click_to_register_button() {
        ap.registerBtn.click();
    }

    @Then("Click to logout button")
    public void clickToLogoutButton() {
        ap.logoutBtn.click();
    }

}
