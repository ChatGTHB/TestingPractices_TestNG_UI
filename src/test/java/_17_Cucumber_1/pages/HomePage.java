package _17_Cucumber_1.pages;

import _17_Cucumber_1.utility_C1.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
    public HomePage() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(css = "a[class=\"woocommerce-store-notice__dismiss-link\"]")
    public WebElement dismiss;
    @FindBy(css = "a[href=\"https://shop.demoqa.com/my-account/\"]")
    public WebElement myAccount;

    @FindBy(css ="a[class=\"noo-search\"]")
    public WebElement searchBtn;

    @FindBy(css ="input[class=\"form-control\"]")
    public WebElement searchInput;
}
