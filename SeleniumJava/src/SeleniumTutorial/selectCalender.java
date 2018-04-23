package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class selectCalender {



    public static void main(String[] args) throws InterruptedException  {

        System.setProperty("webdriver.gecko.driver", "H:\\software\\Selenium & Java & Components\\drivers\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // launch chrome

        driver.get("https://www.google.com/");
      // driver.manage().window().maximize(); // maximize the window
       // driver.manage().deleteAllCookies(); // delete all cookies

        // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       // driver.get("https://www.freecrm.com/");

        //driver.findElement(By.name("username")).sendKeys("jashangunike");
        //driver.findElement(By.name("password")).sendKeys("test@123");
       // Thread.sleep(5000);
        //driver.findElement(By.className("btn btn-small")).click();

        //driver.switchTo().frame("mainpanel");








    }
}
