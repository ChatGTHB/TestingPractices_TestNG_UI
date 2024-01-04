package _17_Cucumber_1.pages;

import _17_Cucumber_1.utility_C1.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public AccountPage() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(id = "reg_username")
    public WebElement registerUsername;

    @FindBy(id = "reg_email")
    public WebElement registerEmail;

    @FindBy(id = "reg_password")
    public WebElement registerPassword;

    @FindBy(css = "button[name=\"register\"]")
    public WebElement registerBtn;

    @FindBy(css = "div[class=\"woocommerce-MyAccount-content\"]>p:nth-of-type(1)")
    public WebElement accountMessage;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "button[name=\"login\"]")
    public WebElement loginBtn;

    @FindBy(css = "nav[class=\"woocommerce-MyAccount-navigation\"] li:last-child>a")
    public WebElement logoutBtn;
}
