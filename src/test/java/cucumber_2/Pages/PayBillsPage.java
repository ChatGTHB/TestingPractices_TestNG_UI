package cucumber_2.Pages;

import cucumber_2.Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {

    public PayBillsPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBanking;
    @FindBy(css = "[id='pay_bills_link']")
    public WebElement payBills;

    @FindBy(id = "alert_content")
    public WebElement successMessage;

    @FindBy(css = "#pc_currency")
    public WebElement currencySelect;

    @FindBy(css = "input[id='pc_amount']")
    public WebElement amount;

    @FindBy(id = "pc_inDollars_true")
    public WebElement dollarCheckbox;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculate;

    @FindBy(id = "purchase_cash")
    public WebElement purchase;
    @FindBy(linkText = "Purchase Foreign Currency")
    public WebElement purchaseButton;
}
