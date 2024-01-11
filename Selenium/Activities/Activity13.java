package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());

        List<WebElement> totalRows= driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr"));
        System.out.println("total num of Rows in tables are: "+totalRows.size());

        List<WebElement>totalCol= driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr[1]/td"));
        System.out.println("total num of Rows in tables are: "+totalCol.size());

        List<WebElement>thirdRowData= driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr[3]/td"));
        for(WebElement TRD:thirdRowData)
        {
            System.out.println(TRD.getText());
        }

        System.out.println("Second row second col data is: "+driver.findElement(By.xpath("//table[@class='ui celled striped table']//tbody/tr[2]/td[2]")).getText());

    }
}

