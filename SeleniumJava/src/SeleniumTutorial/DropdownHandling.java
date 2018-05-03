package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DropdownHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.moebel.de/");

        Actions act = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   //    WebElement Menu = driver.findElement(By.xpath("//*[@id=\"navigationFragment\"]/div/table/tbody/tr/td[5]/a"));
     //  act.moveToElement(Menu).build().perform();

       // WebDriverWait wait = new WebDriverWait(driver,10);
       // wait.until(ExpectedConditions.titleContains("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay"));
        // WebElement Submenu = driver.findElement(By.xpath("//*[@id=\"navigationFragment\"]/div/table/tbody/tr/td[5]/div[2]/div[1]/ul[1]/li[1]/a"));
        // act.moveToElement(Submenu).click().build().perform();

        WebElement Menu = driver.findElement(By.xpath("//*[@id=\"nav_essen\"]/a"));
        act.moveToElement(Menu).build().perform();

        WebElement Submenu = driver.findElement(By.xpath("//*[@id=\"besteck-und-geschirr\"]"));

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(Submenu));
        act.moveToElement(Submenu).click().build().perform();

    }

}
