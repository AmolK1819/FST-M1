package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {

    WebDriver driver;
    @BeforeClass
    public void login()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void loginTest()
    {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String msg=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message printed is: "+msg);

        Assert.assertEquals(msg,"Welcome Back, admin");
    }

    @AfterClass
    public void logOut()
    {
      //  driver.close();
    }
}
