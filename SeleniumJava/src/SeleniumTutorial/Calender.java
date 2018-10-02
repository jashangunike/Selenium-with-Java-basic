package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");

        driver.findElement(By.xpath("//input[@id='travel_date']")).click();


// Select the month from the date picker here first we click date picker then set condition for month then click on next month switcher
        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
        }
// List all the days and get the size and use for loop for selection of particular date

      List<WebElement> dates = driver.findElements((By.className("day")));

      int count = driver.findElements(By.className("day")).size();



      for (int i=0;i<count;i++)
      {
         String txt = driver.findElements(By.className("day")).get(i).getText();
         if (txt.equalsIgnoreCase("23"))
         {
             driver.findElements(By.className("day")).get(i).click();
             break; // We use break that when aboove element found then break the loop and no need to found on whole application
         }

      }
    }
}
