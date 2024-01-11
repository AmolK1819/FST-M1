package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {

     //   System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        WebElement dropDown=driver.findElement(By.id("single-select"));
        Select select= new Select(dropDown);
      //  select.selectByVisibleText("Option 2");
      //  select.selectByIndex(3);
      //  select.selectByValue("4");
       List<WebElement> options= select.getOptions();
       for(WebElement option:options)
       {
           System.out.println(option.getText());
       }

    }
}
