package _19_Cucumber_3.Pages;

import _19_Cucumber_3.Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage extends Parent {

    public PayBillsPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    // TODO Foreign Currency
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

    // TODO Add New Payee

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement account;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addBtn;
    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "payeeName" : return payeeName;
            case "payeeAddress" : return payeeAddress;
            case "account" : return account;
            case "payeeDetails" : return payeeDetails;
        }
        return null;
    }
}
