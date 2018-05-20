package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TC05 {

    static public WebDriver driver = null;
    public String baseURL = "http://live.guru99.com/index.php/";
    public String fName = "JASHANDEEP";
    public String IName = "SINGH";


    @Test
    public void TestCase5() throws InterruptedException {

        driver.navigate().to(baseURL);

        //Click on Account
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]")).click();

        Thread.sleep(5000);
        //Click on Myaccount
        driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[1]/a")).click();

        /*Click on Create Account
        driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();

        driver.findElement(By.id("firstname")).sendKeys("Jashandeep");
        driver.findElement(By.id("lastname")).sendKeys("Singh");
        driver.findElement(By.id("email_address")).sendKeys("jashangunike@gmail.com");
        driver.findElement(By.id("password")).sendKeys("ALvEabUvcyibre5");
        driver.findElement(By.id("confirmation")).sendKeys("ALvEabUvcyibre5");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();
        Thread.sleep(5000); */

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jashangunike@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ALvEabUvcyibre5");
        driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();

        //Verification registration
        String exWelcome = ("WELCOME, " + fName.toUpperCase() + " " + IName.toUpperCase() + "!");
        String actWelcome = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[1]/div/p")).getText();

        try {
           assertEquals(exWelcome,actWelcome);
            System.out.println("ExWelcome Msg " + "actWelcome " + "Passed");
        }
        catch(Exception exe) {
                exe.printStackTrace();
    }



    }

    @BeforeMethod
    public void BeforeMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public void AfterMethod()throws InterruptedException{
        driver.close();

    }

}
