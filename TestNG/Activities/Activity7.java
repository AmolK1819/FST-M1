package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {

    WebDriver driver;
    @BeforeClass
    public void login()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name="Authentication")
    public static Object[][] credentials()
    {
        return new Object[][]{{"admin","password"}};
    }

    @Test(dataProvider = "Authentication")
    public void loginTestCase(String username,String password)
    {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String confirmMsg=driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(confirmMsg,"Welcome Back, admin");
    }

    @AfterTest
    public void logOut() {
    //    driver.quit();
    }
}
