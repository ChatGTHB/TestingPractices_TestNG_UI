package cucumber_3.StepDefinitions;

import cucumber_3.Pages.PayBillsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import java.util.List;

public class _03_addNewPayee  {
    PayBillsPage PayBillsPage = new PayBillsPage();
    @And("Click to Add New Payee button")
    public void clickToAddNewPayeeButton() {
        PayBillsPage.addNewPayee.click();
    }

    @And("Enter name,address,account and details")
    public void enterNameAddressAccountAndDetails(DataTable dataTable) {
        List< List<String> > items= dataTable.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element= PayBillsPage.getWebElement(items.get(i).get(0));
            PayBillsPage.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @When("Click to add button")
    public void clickToAddButton() {
        PayBillsPage.addBtn.click();
    }

}
