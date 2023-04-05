package cucumber_3.Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                tags = "@SmokeTest",
                features ={"src/test/java/cucumber_3/FeatureFiles"},
                glue = {"StepDefinitions"}
        )
public class SmokeTest extends AbstractTestNGCucumberTests {
}
