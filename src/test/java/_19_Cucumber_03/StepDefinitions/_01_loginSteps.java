package _19_Cucumber_03.StepDefinitions;

import _19_Cucumber_03.Pages.LoginPage;
import _19_Cucumber_03.Utilities.BaseDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class _01_loginSteps {

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
        //
        BaseDriver.getDriver().navigate().back();
    }



    @Then("^Verify that you are logged in\\.$")
    public void verifyThatYouAreLoggedIn()
    {
        Assert.assertTrue(lp.userIcon.isEnabled());
    }


}
