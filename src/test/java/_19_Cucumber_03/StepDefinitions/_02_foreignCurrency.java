package _19_Cucumber_03.StepDefinitions;

import _19_Cucumber_03.Pages.PayBillsPage;
import _19_Cucumber_03.Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _02_foreignCurrency extends BaseDriver {
    WebDriver driver = BaseDriver.getDriver();
    PayBillsPage PayBillsPage =new PayBillsPage();
    @When("Click to Online Banking")
    public void clickToOnlineBanking() {
        PayBillsPage.onlineBanking.click();
    }

    @And("Click to Pay Bills button")
    public void clickToPayBillsButton() {
        PayBillsPage.payBills.click();
    }

    @And("Click to Purchase Foreign Currency button")
    public void clickToPurchaseForeignCurrencyButton() {
        PayBillsPage.purchaseButton.click();
    }

    @And("select currency as {string}")
    public void selectCurrencyAs(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(PayBillsPage.currencySelect));
        Select select=new Select(PayBillsPage.currencySelect);
        select.selectByValue(arg0);
    }

    @And("Enter to Amount as {string}")
    public void enterToAmountAs(String arg0) {
        PayBillsPage.amount.sendKeys(arg0);
    }

    @And("Click to Dollar checkbox")
    public void clickToDollarCheckbox() {
        PayBillsPage.dollarCheckbox.click();
    }

    @And("Click to calculate")
    public void clickToCalculate() {
        PayBillsPage.calculate.click();
    }

    @And("Click to purchase")
    public void clickToPurchase() {
        PayBillsPage.purchase.click();
    }

    @Then("successfully message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        Assert.assertTrue(PayBillsPage.successMessage.isDisplayed());
    }
}
