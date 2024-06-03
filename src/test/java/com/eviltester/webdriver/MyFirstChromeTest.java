package com.eviltester.webdriver;

// Imports
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyFirstChromeTest {
    
    private WebDriver driver;  // Declare 'driver' as an instance variable

    // @BeforeEach
    // public void setup() {
        // ChromeOptions options = new ChromeOptions(); // Initialize WebDriver as an instance variable
        // driver = new ChromeDriver(options);  // 'driver' is now accessible throughout the class
        // driver.navigate().to("https://example.com/login"); // Navigate to the login page
    //}


    @Test
    public void test01_startWebDriver() throws InterruptedException{
        // webdriver config
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        // navigation to URL
        driver.navigate().to("https://github.com");
        // maximize window
        driver.manage().window().maximize();
        // time wait 5 sec
        Thread.sleep(5000);
        // getting title element
        WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[1]/div[2]/div/div/div[2]/h1/span"));
        System.out.println(title.getText());
        // Assertion - verifuying title text
        Assertions.assertEquals(title.getText(), "Let’s build from here");
        // closing wondow + closing webdriver
        driver.close();
        driver.quit();
    }

    //@AfterAll
    //public void closeall(){
        //driver.close();
        //driver.quit();
    //}
}



