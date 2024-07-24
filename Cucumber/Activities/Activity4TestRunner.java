package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = {"StepDefinitions"},
        tags = "@Activity4",
        publish = true
)

public class Activity4TestRunner {

}
