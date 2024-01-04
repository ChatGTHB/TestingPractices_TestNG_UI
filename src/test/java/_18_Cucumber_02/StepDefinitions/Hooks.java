package _18_Cucumber_02.StepDefinitions;

import _18_Cucumber_02.Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo Basladi");
    }

    @After
    public void after() throws InterruptedException {
        System.out.println("Senaryo Bitti");
        BaseDriver.DriverQuit();
    }
}
