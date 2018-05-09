package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC02 {

    static public WebDriver driver = null;
    public String baseURL = "http://live.guru99.com/index.php/";
    public StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void Testcase2() {

        //Navigate to url
        driver.navigate().to(baseURL);

        //Clicking on 'Mobile' menu

        driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html']")).click();

        //Get the price of sony mobile
        String listPrice = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();
        System.out.println(listPrice);

        //Click on Sony Mobile
        driver.findElement(By.xpath("//*[@id=\"product-collection-image-1\"]")).click();

        //getting the price of Sony Xperia in product page

        String productPrice = driver.findElement(By.xpath("//*[@id='product-price-1']/span")).getText();
        System.out.println(productPrice);



        // Verify the both Prices

        try{
            AssertJUnit.assertEquals(listPrice , productPrice);
            System.out.println("Both Prices matched");

        }

        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Prices not mateched");
        }


    }

    @BeforeMethod
    public void BeforeMethod() {
        System.setProperty("webdriver.chrome.driver" , "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }

    @AfterClass
    public void AfterMethod() {
        driver.quit();
    }




}
