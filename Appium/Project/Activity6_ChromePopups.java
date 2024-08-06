package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity6_ChromePopups {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Open Selenium page
        driver.get("https://v1.training-support.net/selenium");

    }
    @Test(priority = 0)
    public void Popup(){
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));

        // Just scroll
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        // Locate element
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Popups']")).click();


        //Click on Sign In button
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In\"]")).click();
        //Enter credentials
        WebElement username = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Popups\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        WebElement password = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Popups\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        username.sendKeys("admin");
        password.sendKeys("password");
        //Click on login button and verify login message
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
        // Print the confirmation message
        String message = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Welcome Back, admin\"]")).getText();
        System.out.println("Login message: " + message);

        // Assertion
        Assert.assertEquals(message, "Welcome Back, admin");
    }
    @Test(priority = 1)
    public void Popup2(){
        //Click on Sign In button

        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In\"]")).click();
        //Enter credentials
        WebElement username = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Popups\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        WebElement password = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Popups\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        username.sendKeys("admin1");
        password.sendKeys("password");
        //Click on login button and verify login message
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
        // Print the confirmation message
        String message = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Invalid Credentials\"]")).getText();
        System.out.println("Login message: " + message);

        // Assertion
        Assert.assertEquals(message, "Invalid Credentials");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();

    }
}