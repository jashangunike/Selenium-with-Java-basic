package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class parentChild {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "H:\\software\\Selenium & Java & Components\\drivers\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://register.rediff.com/commonreg/index.php");
        driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[20]/td[2]/a[1]")).click();
        System.out.println(driver.getTitle());
        Set <String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());



    }



}
