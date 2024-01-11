package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());

        List<WebElement>totalRows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Total rows of table are: "+totalRows.size());

        List<WebElement>totalCol=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Total rows of table are: "+totalCol.size());

        System.out.println("cell value of second row second column is: "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        System.out.println("cell value of second row second column after sort is: "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());

        List<WebElement>footerData=driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        for(WebElement fd:footerData)
        {
            System.out.println("Footer data of table is: "+fd.getText());
        }

    }
}
