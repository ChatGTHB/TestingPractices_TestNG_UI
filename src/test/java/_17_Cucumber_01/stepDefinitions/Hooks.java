package _17_Cucumber_01.stepDefinitions;

import _17_Cucumber_01.utility_C1.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    // TODO
    //  Cucumber Hooks , her senaryodan önce(@Before) veya sonra(@After) çalışan kod bloklarıdır.
    //  Cucumber Hooks,  kod iş akışını daha iyi yönetmemizi sağlar ve kod fazlalığını azaltmamıza yardımcı olur.
    //  Senaryolarımızı veya testlerimizi gerçekleştirmemizi sağlayan görünmeyen bir adım diyebiliriz.

    @Before // her senaryodan önce
    public void before(Scenario scenario)
    {
        System.out.println("Senaryo basladi");
        System.out.println("scenario id si="+ scenario.getId());
        System.out.println("scenario name="+ scenario.getName());
    }

    @After // her senaryodan sonra
    public void after() {
        System.out.println("Senaryo Bitti");
        BaseDriver.quitDriver();
    }
}
