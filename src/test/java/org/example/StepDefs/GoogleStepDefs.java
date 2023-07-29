package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleStepDefs {
    int x = 0;
    ChromeDriver driver;

    @Given("Launch Google Home Page")
//    @Test(priority = 1)
    public void launchgoogle(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        x=1;
       // driver.close();
    }

    @When("Google Test")
//    @Test(dependsOnMethods = "launchgoogle")
    public void lala() throws InterruptedException {
        if (x==1){
            System.out.println("awesome");
        }else {
            System.out.println("Chill");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
