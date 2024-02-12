package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        Reporter.log("Starting Test ! |");
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser..! |");

        Reporter.log("Page Title is: "+driver.getTitle()+ "|");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        Reporter.log("Test Case Setup Started |");
        driver.switchTo().defaultContent();
    }

    @Test(priority =0)
    public void simpleAlertTC()
    {
        Reporter.log("simpleAlertTestCase() started |");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened |");

        String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals(alertText,"This is a JavaScript Alert!");
        driver.switchTo().alert().accept();

    }

    @Test(priority = 1)
    public void confirmAlertTC()
    {
        Reporter.log("simpleAlertTestCase() started |");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Simple Alert opened |");

        String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals(alertText,"This is a JavaScript Confirmation!");
        driver.switchTo().alert().accept();

    }

    @Test(priority = 2)
    public void promptAlertTC()
    {
        Reporter.log("simpleAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Simple Alert opened |");

        String promptMsg=driver.switchTo().alert().getText();
        Assert.assertEquals(promptMsg,"This is a JavaScript Prompt!");
        driver.switchTo().alert().sendKeys("Awesome");
        driver.switchTo().alert().accept();

    }

    @AfterClass
    public void logOut()
    {
        //  driver.close();
    }
}
