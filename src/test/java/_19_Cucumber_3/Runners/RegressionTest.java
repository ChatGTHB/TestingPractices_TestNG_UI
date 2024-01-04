package _19_Cucumber_3.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
                tags = "@RegressionTest",
                features = {"src/test/java/cucumber_3/FeatureFiles"},
                glue = {"StepDefinitions"}
        )
public class RegressionTest extends AbstractTestNGCucumberTests {
}
