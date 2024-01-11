package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement textField=driver.findElement(By.id("input-text"));
        System.out.println("TextField is enabled: "+textField.isEnabled());

        driver.findElement(By.id("toggleInput")).click();
        System.out.println("TextField is enabled: "+textField.isEnabled());
    }
}
