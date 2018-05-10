package Ecommerce;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*This is my Java Code
 * www.github.com/jashangunike
 * jashangunike@gmail.com
 * Author-Jashandeep Singh */

public class TC03 {

    static public WebDriver driver = null;
    public String baseUrl = "http://live.guru99.com/index.php/";

    @Test
    public void TestCase3() {

        driver.navigate().to(baseUrl);

        //Click on mobile link
        driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();
        //Click on Add to cart
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")).click();
        // Click on Qty Box
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).click();
        // Clear
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).clear();
        // put 1000 units
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("1000");
        // Click on Update button
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")).click();

        // Verification of error message
        String ExpectedMSG = "* The maximum quantity allowed for purchase is 500. ";
        String ActualMSG = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText();
        System.out.println("Actual message "+ ActualMSG);

        try {

            assertEquals(ExpectedMSG,ActualMSG);

        }
        catch (Exception e){

        e.printStackTrace();
}

        //Verifying message after emptying the cart

        driver.findElement(By.id("empty_cart_button")).click();
        String noItemsStg = ("You have no items in your shopping cart.");
        String noItemsMsg = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]")).getText();
        System.out.println("You have no items msg = " + noItemsMsg);

        try {

            assertEquals(noItemsStg,noItemsMsg);
        }

        catch(Exception ex) {
            ex.printStackTrace();

            }
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.setProperty("webdriver.chrome.driver" , "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void AfterMethod() {
         driver.quit();
    }
}
