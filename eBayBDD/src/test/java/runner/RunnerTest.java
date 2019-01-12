package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"} ,
        format = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml"},
        glue = "stepDefinitions",
        strict = false,
        monochrome = true,
        tags = {"@FunctionalTest"},
        dryRun =false)

public class RunnerTest {


}
