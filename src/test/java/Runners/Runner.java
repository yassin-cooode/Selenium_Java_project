package Runners;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"StepDefinations"},
        plugin = {"pretty" , "html:target/TestReport.html"},
        tags = "@tag"

)

public class Runner extends AbstractTestNGCucumberTests {

}
