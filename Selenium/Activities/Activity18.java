package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {
    public static void main(String[]args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        WebElement dd=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select=new Select(dd);
        select.selectByVisibleText("Javascript");
        for(int i=4;i<=6;i++)
        {
            select.selectByIndex(i);
        }
     //   select.selectByIndex(4);
     //   select.selectByIndex(5);
     //   select.selectByIndex(6);
        select.selectByValue("node");
        select.deselectByIndex(5);

    }
}
