package _18_Cucumber_02.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                tags = "@SmokeTest",
                features ={"src/test/java/cucumber_2/FeatureFiles"},
                glue = {"StepDefinitions"}
        )
public class SmokeTest extends AbstractTestNGCucumberTests {
}
