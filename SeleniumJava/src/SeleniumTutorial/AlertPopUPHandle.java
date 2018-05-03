package SeleniumTutorial;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*This is my Java Code
 * www.github.com/jashangunike
 * jashangunike@gmail.com
 * Author-Jashandeep Singh */

public class AlertPopUPHandle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "H:\\software\\Selenium & Java & Components\\drivers\\chromedriverlat\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch chrome browser
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //Rediff mail open
     //   driver.manage().window().maximize();
        //driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click(); // by Xpath
        driver.findElement(By.name("proceed")).click(); // by Name
        Thread.sleep(5000);



        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();

        if(text.equals("Please enter a valid user name"))
        {
            System.out.println("Correct Alert message");
        }
        else
        {
            System.out.println("Incorrect Message");
        }

        alert.accept(); //Accept the alert
        // alert.dismiss();  //Dismiss the alert
        driver.close();
    }

    }

