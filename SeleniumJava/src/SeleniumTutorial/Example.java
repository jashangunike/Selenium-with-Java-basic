package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.gecko.driver","H:\\software\\Selenium & Java & Components\\drivers\\geckodriver\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.online.citibank.co.in/");

       // driver.switchTo().alert().dismiss();

        //1.Count all the links
        System.out.println(driver.findElements(By.tagName("a")).size()); // clickable link on all page

        //2.Count the link of wealth tab
        driver.findElement(By.xpath("//*[@id=\"topMnuinvesting\"]")).click(); // click on wealth tab


        WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"investingSubMenu\"]/div[1]/ul/li[1]/ul")) ;

        System.out.println(Dropdown.findElements(By.tagName("a")).size());

        //3.Check all the links are working and count one paricular column
        for (int i=1;i<=Dropdown.findElements(By.tagName("a")).size();i++)
        {
            String clickOnNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);

            Dropdown.findElements(By.tagName("a")).get(i).sendKeys(clickOnNewTab);

            Thread.sleep(5000);

            Set <String> abcd= driver.getWindowHandles();

            Iterator<String> it = abcd.iterator();

            while(it.hasNext()) // has next mean next index present or not ?
            {
              // it.next(); // it moves to next index

               driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }
        }
    }
}
