package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of Page is: "+driver.getTitle());
        System.out.println("text of thirdTitle of  Page is: "+driver.findElement(By.id("third-header")).getText());
        System.out.println("fiftheader colour is: "+driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color"));
        System.out.println("violetBtn class is: "+driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class"));
        System.out.println("text of thirdTitle of  Page is: "+driver.findElement(By.xpath("//button[text()='Grey']")).getText());
    }
}
