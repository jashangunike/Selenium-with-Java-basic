package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.rediff.com");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi'][contains(text(),'Sign in')]")).click();

       // by Id
       driver.findElement(By.id("login1")).sendKeys("Username");
       driver.findElement(By.id("password")).sendKeys("Password");

       // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); implicity wait

       driver.close();
    }
}
