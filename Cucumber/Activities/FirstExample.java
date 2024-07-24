package Stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstExample extends BaseClass{
}
@Given("User is on the Homepage")
 public void openBrowser(){
    driver.get("https://v1.training-support.net/")
    Assertions.assertEquals("Training support"+ );

}
