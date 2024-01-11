package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1
{
    public static void main(String[]args)
    {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("http://v1.training-support.net/");
        System.out.println("Home Page Title is: " +driver.getTitle());

        driver.findElement(By.id("about-link")).click();
        System.out.println("new title of page is: " +driver.getTitle());
        driver.close();


    }
}
