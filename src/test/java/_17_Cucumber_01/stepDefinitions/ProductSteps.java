package _17_Cucumber_01.stepDefinitions;

import _17_Cucumber_01.pages.HomePage;
import io.cucumber.java.en.And;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ProductSteps {
    HomePage hp = new HomePage();
    @And("Click to search button")
    public void clickToSearchButton() {
        hp.searchBtn.click();
    }
    @And("Search for {string}")
    public void searchFor(String product) throws AWTException {
        hp.searchInput.sendKeys(product);
        Robot rbt =new Robot();
        rbt.keyPress(KeyEvent.VK_ENTER);

    }

}
