package SeleniumTutorial;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class selectCalender {



    public static void main(String[] args) throws InterruptedException  {

        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch chrome

         driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
         driver.manage().window().maximize(); // maximize the window
         driver.manage().deleteAllCookies(); // delete all cookies

         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //button to open calendar
        WebElement selectDate = driver.findElement(By.xpath("//*[@id=\"example\"]/div/span/span/span[2]/span[1]/span"));
        selectDate.click();

        WebElement nextLink = driver.findElement(By.xpath("//*[@id=\"b19ff3da-3a20-46f2-83be-165e4e90b834\"]/div[1]/a[3]/span"));
        nextLink.click();






    }
}
