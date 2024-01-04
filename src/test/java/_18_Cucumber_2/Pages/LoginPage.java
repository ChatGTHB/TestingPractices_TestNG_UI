package _18_Cucumber_2.Pages;

import _18_Cucumber_2.Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(className = "icon-user")
    public WebElement userIcon;

    @FindBy(id = "user_login")
    public WebElement login;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(css = "[name='submit']")
    public WebElement loginButton;

}
