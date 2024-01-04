package _19_Cucumber_03.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/java/cucumber_3/FeatureFiles"},
                glue = {"StepDefinitions"},

                plugin = {
                        "html:target/cucumber-report",
                        "json:target/cucumber.json",
                }
        )
public class TestRunner extends AbstractTestNGCucumberTests {
}
