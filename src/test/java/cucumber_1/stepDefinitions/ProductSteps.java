package cucumber_1.stepDefinitions;

import cucumber_1.pages.HomePage;
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
