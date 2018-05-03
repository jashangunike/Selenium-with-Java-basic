package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        List<WebElement> frames = driver.findElements(By.tagName("iFrame"));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));

        WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions action = new Actions(driver);
        action.moveToElement(drag).dragAndDrop(drag, drop).build().perform();


    }
}
