package Ecommerce;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC04 {

    static public WebDriver driver = null;
    public String baseURL = "http://live.guru99.com/index.php/";

    @Test
    public void TestCase4() throws IOException, InterruptedException {
        //Navigate to url
        driver.get(baseURL);

        //Click on Mobile
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();

        //Compare iphone and sony
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
        Thread.sleep(1000);

        String mainMobile1 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
        String mainMobile2 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();

        System.out.println(mainMobile1);
        System.out.println(mainMobile2);

        //Click on Compare
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button/span/span")).click();

        //iterating to popup window , using it and then switching back to the main window


        String parent = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles())
        {
            //driver.getWindowHandle() command / method returns Browser window handle from focused Browser,
            // but driver.getWindowHandles() method or commands returns all handles from all opened browsers by Selenium WebDriver during execution,

            System.out.println(handle);
            driver.switchTo().window(handle);
            driver.manage().window().maximize();

            //Screenshot of compare window
            File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scr, new File("G:\\screen.png"));

            //Switch to Parent or main Window
            driver.switchTo().window(parent);
            // Screenshot of parent window
            File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scr1, new File("G:\\Mainscreen.png"));


        }


    }
    @BeforeMethod
    public void beforeMethod(){

        System.setProperty("webdriver.chrome.driver" , "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        // driver.quit();

    }

}
