package Ecommerce;


import javafx.scene.layout.Priority;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC01 {

    static public WebDriver driver = null;
    public StringBuffer verificationErrors = new StringBuffer();
    public String baseURL = "http://live.guru99.com/index.php/";



    @Test(priority = 1)
    public void TC001() throws IOException {

        driver.navigate().to(baseURL);

        //Verify the title of page
        driver.getTitle();

        if(driver.getTitle().equalsIgnoreCase("Home page"))
        {
            // System.out.println(driver.getTitle()); // here title comes of page
            System.out.println("Correct Title of page"); // message comes

        }
        else
            {
                System.out.println("Not Correct Title of page");
        }

        // Verify to click on mobile titles

        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();

        //Selecting the "sort by" option

        Select sortBy = new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
        sortBy.selectByIndex(1); // Name selected from sort by



        //Taking Screenshot that sort by Name

        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr,new File("C:\\Users\\jashan\\Pictures\\nameSort.JPEG") );

    }

    @BeforeMethod
    public void Beforemethod(){

    System.setProperty("webdriver.chrome.driver" , "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @AfterMethod
    public void AfterMethod(){
        driver.close();
    }



}
