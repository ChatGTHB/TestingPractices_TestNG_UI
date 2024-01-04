package _05_Selenium_08_03_2023;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BaseDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests extends BaseDriver {

    @Test
    public void test01() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertsLink = driver.findElement(By.id("Alerts"));
        alertsLink.click();

        System.out.println("Current Url = " + driver.getCurrentUrl());
    }

    @Test
    public void test02() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertsLink = driver.findElement(By.id("Alerts"));
        alertsLink.click();

        System.out.println("Current Url = " + driver.getCurrentUrl());

        driver.navigate().back();

        System.out.println("Current Url = " + driver.getCurrentUrl());

        WebElement ajaxLink = driver.findElement(By.id("basicajax"));
        ajaxLink.click();

        System.out.println("Current Url = " + driver.getCurrentUrl());
    }

    @Test
    public void test03() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement findByPlaygroundLink = driver.findElement(By.id("findby"));
        findByPlaygroundLink.click();

        WebElement fifthText = driver.findElement(By.id("p5"));

        System.out.println("The Fifth Text = " + fifthText.getText());

    }

    @Test
    public void test04() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement searchLink = driver.findElement(By.id("search"));
        searchLink.click();

        WebElement headingText = driver.findElement(By.xpath("//h1[text()='The \"Selenium Simplified\" Search Engine']"));

        System.out.println("The Heading= " + headingText.getText());

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
        searchButton.click();

        System.out.println("Current Url = " + driver.getCurrentUrl());

    }

    @Test
    public void test05() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink = driver.findElement(By.id("calculate"));
        calculateLink.click();

        WebElement firstInput = driver.findElement(By.id("number1"));
        firstInput.sendKeys("23");

        WebElement secondInput = driver.findElement(By.id("number2"));
        secondInput.sendKeys("11");

        WebElement calculateButton = driver.findElement(By.id("calculate"));
        calculateButton.click();

        WebElement result = driver.findElement(By.id("answer"));
        System.out.println("Result = " + result.getText());

    }

    @Test
    public void test06() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertsLink = driver.findElement(By.id("fakealerttest"));
        fakeAlertsLink.click();

        WebElement showAlertBoxLink = driver.findElement(By.id("fakealert"));
        showAlertBoxLink.click();

        WebElement okButton = driver.findElement(By.id("dialog-ok"));
        okButton.click();

    }

    @Test
    public void test07() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertsLink = driver.findElement(By.id("fakealerttest"));
        fakeAlertsLink.click();

        WebElement showModalDialogLink = driver.findElement(By.id("modaldialog"));
        showModalDialogLink.click();

        WebElement okButton = driver.findElement(By.id("dialog-ok"));
        okButton.click();

    }

    @Test
    public void test08() {

        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement normalSuccessMessageLink = driver.findElement(By.id("normal-btn-success"));
        normalSuccessMessageLink.click();

        WebElement closeSuccessMessage = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        closeSuccessMessage.click();

    }

    @Test
    public void test09() {

        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement normalSuccessMessageLink = driver.findElement(By.id("normal-btn-success"));
        normalSuccessMessageLink.click();

        WebElement successMessage = driver.findElement(By.cssSelector("[class='alert alert-success alert-normal-success']"));

        WebElement closeSuccessMessage = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        closeSuccessMessage.click();

        Assert.assertFalse(successMessage.isDisplayed());

    }

    @Test
    public void test10() {

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAllButton = driver.findElement(By.id("check1"));
        checkAllButton.click();

        checkAllButton = driver.findElement(By.id("check1"));
        System.out.println(checkAllButton.getAttribute("value"));

        Assert.assertEquals(checkAllButton.getAttribute("value"), "Uncheck All");
    }

    @Test
    public void test11() {

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement daySelect = driver.findElement(By.id("select-demo"));
        Select day = new Select(daySelect);

        int wednesdayEnabled = 0;

        do {
            int randomNumber = (int) (Math.random() * 7) + 1;
            day.selectByIndex(randomNumber);
            WebElement dayVerification = driver.findElement(By.className("selected-value"));
            if (dayVerification.getText().contains("Wednesday")) {
                wednesdayEnabled++;
            }
        } while (wednesdayEnabled != 5);

        System.out.println("Wednesday Number of Views = " + wednesdayEnabled);
    }

    @Test
    public void test12() {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputFormLink = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputFormLink.click();

        WebElement ajaxFormSubmitLink = driver.findElement(By.xpath("(//a[text()='Ajax Form Submit'])[2]"));
        ajaxFormSubmitLink.click();

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Name");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("Comment added.");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebElement submitSuccessMessage = driver.findElement(By.id("submit-control"));
        WebElement submitSuccessMessage2 = driver.findElement(By.xpath("//div[text()='Form submited Successfully!']"));

        Assert.assertEquals("Form submited unsuccessfully!", submitSuccessMessage.getText(), "Form submited Successfully!");

        System.out.println("Submit Success Message = " + submitSuccessMessage.getText());
    }

    @Test
    public void test13() {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement listBoxLink = driver.findElement(By.xpath("//a[text()='List Box']"));
        listBoxLink.click();

        WebElement bootstrapListBoxLink = driver.findElement(By.xpath("(//a[text()='Bootstrap List Box'])[2]"));
        bootstrapListBoxLink.click();

        WebElement bootstrapDuallistBox = driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
        bootstrapDuallistBox.click();

        WebElement rightArrow = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
        rightArrow.click();

        WebElement dapibusAcFacilisisInBox = driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in'])[1]"));
        dapibusAcFacilisisInBox.click();

        rightArrow.click();

        bootstrapDuallistBox = driver.findElement(By.xpath("(//li[@class='list-group-item active'])[1]"));
        bootstrapDuallistBox.click();

        dapibusAcFacilisisInBox = driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in'])[2]"));
        dapibusAcFacilisisInBox.click();

        WebElement crasJustoOdioBox = driver.findElement(By.xpath("//li[text()='Cras justo odio']"));
        crasJustoOdioBox.click();

        WebElement leftArrow = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-left']"));
        leftArrow.click();

        dapibusAcFacilisisInBox = driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']"));
        dapibusAcFacilisisInBox.click();

        leftArrow.click();
    }

    @Test
    public void test14() {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement messageBox = driver.findElement(By.xpath("//input[@id='user-message']"));
        messageBox.sendKeys("Message");

        WebElement showMessageButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        showMessageButton.click();

        WebElement verificationMessage = driver.findElement(By.id("display"));
        System.out.println("My message = " + verificationMessage.getText());
    }

    @Test
    public void test15() {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement enterABox = driver.findElement(By.id("sum1"));
        enterABox.sendKeys("11");

        WebElement enterBBox = driver.findElement(By.id("sum2"));
        enterBBox.sendKeys("23");

        WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotalButton.click();

        WebElement total = driver.findElement(By.id("displayvalue"));
        System.out.println("Total = " + total.getText());
    }

    @Test
    public void test16() {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputFormLink = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputFormLink.click();

        WebElement radioButtonsDemoLink = driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
        radioButtonsDemoLink.click();

        WebElement getCheckedValueButton = driver.findElement(By.id("buttoncheck"));
        getCheckedValueButton.click();

        WebElement verificationCheckedMessage = driver.findElement(By.className("radiobutton"));

        Assert.assertEquals(verificationCheckedMessage.getText(), "Radio button is Not checked");

        WebElement maleRadioButton = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
        maleRadioButton.click();

        getCheckedValueButton.click();

        verificationCheckedMessage = driver.findElement(By.className("radiobutton"));

        Assert.assertEquals(verificationCheckedMessage.getText(), "Radio button 'Male' is checked");

        WebElement femaleRadioButton = driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
        femaleRadioButton.click();

        getCheckedValueButton.click();

        verificationCheckedMessage = driver.findElement(By.className("radiobutton"));

        Assert.assertEquals(verificationCheckedMessage.getText(), "Radio button 'Female' is checked");
    }

    @Test
    public void test17() {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement inputFormLink = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputFormLink.click();

        WebElement radioButtonsDemoLink = driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
        radioButtonsDemoLink.click();

        WebElement maleGroupRadioButton = driver.findElement(By.xpath("(//input[@value='Male'])[2]"));
        maleGroupRadioButton.click();

        WebElement _0to5Button = driver.findElement(By.xpath("//input[@value='0 - 5']"));
        _0to5Button.click();

        WebElement getValueButton = driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]"));
        getValueButton.click();

        WebElement verificationGetValuesMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));

        System.out.println("Get values message = " + verificationGetValuesMessage.getText());

        WebElement _5to15Button = driver.findElement(By.xpath("//input[@value='5 - 15']"));
        _5to15Button.click();

        getValueButton.click();

        verificationGetValuesMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));

        System.out.println("Get values message = " + verificationGetValuesMessage.getText());

        WebElement _15to50Button = driver.findElement(By.xpath("//input[@value='15 - 50']"));
        _15to50Button.click();

        getValueButton.click();

        verificationGetValuesMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));

        System.out.println("Get values message = " + verificationGetValuesMessage.getText());

        WebElement femaleGroupRadioButton = driver.findElement(By.xpath("(//input[@value='Female'])[2]"));
        femaleGroupRadioButton.click();

        _0to5Button.click();

        getValueButton.click();

        verificationGetValuesMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));

        System.out.println("Get values message = " + verificationGetValuesMessage.getText());

        _5to15Button.click();

        getValueButton.click();

        verificationGetValuesMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));

        System.out.println("Get values message = " + verificationGetValuesMessage.getText());

        _15to50Button.click();

        getValueButton.click();

        verificationGetValuesMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']"));

        System.out.println("Get values message = " + verificationGetValuesMessage.getText());

    }

    @Test
    public void test18() {

        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");

        WebElement filterByTaskAssigneeStatus = driver.findElement(By.id("task-table-filter"));
        filterByTaskAssigneeStatus.sendKeys("in progress");

        WebElement task1 = driver.findElement(By.xpath("//td[text()='Wireframes']"));
        WebElement task2 = driver.findElement(By.xpath("//td[text()='Bootstrap 3']"));
        WebElement task3 = driver.findElement(By.xpath("//td[text()='Bug fixing']"));
        List<WebElement> tasks = new ArrayList<>(Arrays.asList(task1, task2, task3));

        for (WebElement task : tasks) {
            System.out.println(task.getText());
        }

        System.out.println("|*******************|");

        WebElement assigne1 = driver.findElement(By.xpath("//td[text()='John Smith']"));
        WebElement assigne2 = driver.findElement(By.xpath("//td[text()='Emily John']"));
        WebElement assigne3 = driver.findElement(By.xpath("//td[text()='Kilgore Trout']"));
        List<WebElement> assignes = new ArrayList<>(Arrays.asList(assigne1, assigne2, assigne3));

        for (WebElement asssigne : assignes) {
            System.out.println(asssigne.getText());
        }
    }

    @Test
    public void test19() {

        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");

        WebElement filterButton = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-filter']"));
        filterButton.click();

        WebElement firstNameBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstNameBox.sendKeys("an");

        List<WebElement> usersFirstNameList = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[3]"));

        System.out.print("The First Names : ");

        for (WebElement firstName : usersFirstNameList) {
            if (firstName.getText().contains("an")) {
                System.out.print("#" + firstName.getText() + " ");
            }
        }
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(firstNameBox).click().keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build();
        action.perform();

        WebElement usernameBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameBox.sendKeys("ar");

        List<WebElement> usersUsernameList = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));

        System.out.println("\n" + "*=====**======*****======**=====*");
        System.out.print("The Usernames : ");

        for (WebElement username : usersUsernameList) {
            if (username.getText().contains("ar")) {
                System.out.print("#" + username.getText() + " ");
            }
        }
    }

    @Test
    public void test20() {

        driver.get("http://en.wikipedia.org/wiki/FIFA_World_Cup");

        WebElement attendanceLink = driver.findElement(By.xpath("//*[@id='toc-Attendance']/a/div"));
        attendanceLink.click();

        List<WebElement> hosts = driver.findElements(By.xpath("//td[@style='text-align:left' or @style='text-align: left']"));

        for (WebElement host : hosts) {
            System.out.println("host.getText() = " + host.getText());
        }
        System.out.println("hosts.size() = " + hosts.size());
    }


    @Test
    public void test21() {

        /* Soruda verilen konuma erişilemediğinden aşağıdaki şekilde çözüme gidildi .

           Contents'in içindeki "Attendance"e tıklanıp, "Attandance" tablosunda yer alan;

           Dünya Kupası turnuvasının şimdiye kadar düzenlendiği yıllar ile

           düzenlenmesinin planlandığı bir sonraki yıl yazdırıldı.

           Find elements kullanıldı. */

        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
        WebElement attendanceLink = driver.findElement(By.xpath("//*[@id='toc-Attendance']/a/div"));
        attendanceLink.click();

        List<WebElement> years = driver.findElements(By.xpath("//td[@style='text-align: center']"));

        for (WebElement year : years) {
            System.out.println(year.getText());
        }
        waitAndClose();
    }
}



