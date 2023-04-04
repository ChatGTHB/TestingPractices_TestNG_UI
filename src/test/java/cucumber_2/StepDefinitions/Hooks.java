package cucumber_2.StepDefinitions;

import cucumber_1.utility_C1.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo Basladi");
    }

    @After
    public void after()
    {
        System.out.println("Senaryo Bitti");
        BaseDriver.quitDriver();
    }
}
