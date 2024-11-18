package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class StartSelenium {


       WebDriver driver;


       @BeforeTest
        public void setUp(){
              WebDriverManager.chromedriver().setup();
        }

        @BeforeMethod
        public void loadBrowser(){
              driver = new ChromeDriver();

       }

       @Test
       public void DisplayPage(){
           driver.get("https://www.saucedemo.com/");
           driver.manage().window().maximize(); // Maximize window
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       }



       @AfterTest
       public void tearDown(){
         driver.quit();
       }




}
