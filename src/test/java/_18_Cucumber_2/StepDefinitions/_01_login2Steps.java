package _18_Cucumber_2.StepDefinitions;

import _18_Cucumber_2.Pages.LoginPage;
import _18_Cucumber_2.Utilities.BaseDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class _01_login2Steps {

    LoginPage lp=new LoginPage();
    WebDriver driver= BaseDriver.getDriver();
    @Given("^Navigate to website$")
    public void navigateToWebsite()
    {
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
    }

    @And("^Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterUsernameAsAndPasswordAs(String login1, String password1)
    {
        lp.login.sendKeys(login1);
        lp.password.sendKeys(password1);
    }

    @When("^click login button$")
    public void clickLoginButton()
    {
        lp.loginButton.click();
        driver.navigate().back();
    }

    @Then("^Verify that you are logged in\\.$")
    public void verifyThatYouAreLoggedIn()
    {
        Assert.assertTrue(lp.userIcon.isEnabled());
    }

}
