package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class TC06CITIBank {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver","H:\\software\\Selenium & Java & Components\\drivers\\geckodriver\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.online.citibank.co.in/");

        driver.findElement(By.xpath("//*[@id=\"topMnuinvesting\"]")).click();
        driver.switchTo().alert().dismiss();

        WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"investingSubMenu\"]/div[1]/ul/li[1]/ul")) ;

        for (int i=1;i<=Dropdown.findElements(By.tagName("a")).size();i++) {
            String clickOnNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            Dropdown.findElements(By.tagName("a")).get(i).sendKeys(clickOnNewTab);

            driver.findElement(By.xpath("//*[@id=\"topMnuinvesting\"]")).click();
        }
            // Get the Title of each link
            Set <String> abcd = driver.getWindowHandles();
            Iterator <String> it = abcd.iterator();
             while (it.hasNext())
             {
                 driver.switchTo().window(it.next());
                 System.out.println(driver.getTitle());

             }





    }
}
