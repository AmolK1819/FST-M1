package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Title of home page is: "+driver.getTitle());

        Actions act=new Actions(driver);

        WebElement footBall=driver.findElement(By.id("draggable"));
        WebElement dropzone1=driver.findElement(By.id("droppable"));
        WebElement dropzone2=driver.findElement(By.id("dropzone2"));

        act.clickAndHold(footBall).moveToElement(dropzone1).pause(2000).release().build().perform();
        act.dragAndDrop(footBall,dropzone2).build().perform();

        driver.close();



    }
}
