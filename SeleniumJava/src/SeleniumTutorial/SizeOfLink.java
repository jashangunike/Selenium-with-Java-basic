package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfLink {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch chrome

        driver.get("http://qaclickacademy.com/practice");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement Footerdriver = driver.findElement(By.id("gf-BIG")); // Limit webdriver scope

        System.out.println(Footerdriver.findElements(By.tagName("a")).size()); // Print the footer links

        WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(columndriver.findElements(By.tagName("a")).size());  // Print one Coloumn

        // Click on all link on the column links
        for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
            String clickLink = Keys.chord(Keys.CONTROL,Keys.ENTER); // Control + ENTER for open in new tab
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
        }

    }
}
