package _17_Cucumber_01.stepDefinitions;

import _17_Cucumber_01.pages.AccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    AccountPage ap = new AccountPage();
    @When("Fill in the login username input as {string}")
    public void fillInTheLoginUsernameInputAs(String username) {
        ap.username.sendKeys(username);
    }

    @When("Fill in the login password input as {string}")
    public void fillInTheLoginPasswordInputAs(String password) {
        ap.password.sendKeys(password);
    }

    @When("Click to Login button")
    public void clickToLoginButton() {
        ap.loginBtn.click();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        Assert.assertTrue(ap.accountMessage.getText().contains("Hello technostudy"));
    }
}
