package org.example;import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/resources/Features"} ,
        glue = {"StepDefs"}
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
