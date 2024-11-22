package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class firstSelenium {


    WebDriver driver;

    // Before Test
    // actions the need to happen before a test create a method
    @BeforeClass
    public void startBrowser(){
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //WebDriver Commands

        //driver.manage().window().fullscreen();
        //driver.manage().window().minimize();
        //
        //driver.manage().deleteAllCookies();
        //driver.manage().window().fullscreen();
        //driver.manage().window().minimize();
        //driver.manage().window().setSize(new Dimension (1024, 768));
        // Page or Browse Load Tim

    }




    // create a Method  mark it a your test Script
    @Test(testName="Successful login")
    public void loginTest(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // WebElements Commands
        // WebElements Commands
        // username
        WebElement username = driver.findElement(By.name("user-name"));
        //WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.clear();  // clear the imput fields
        username.sendKeys("standard_user");

        // password
        WebElement passsword = driver.findElement(By.id("password"));
        passsword.clear();
        passsword.sendKeys("secret_sauce");

        // login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();



        //
    }


    @AfterClass
    public void closeApp(){
      driver.quit();
    }




}
