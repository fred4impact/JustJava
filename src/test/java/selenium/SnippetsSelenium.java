//package selenium;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//import java.awt.*;
//import java.awt.geom.Point2D;
//import java.time.Duration;
//
//public class SnippetsSelenium {
//
//
//    WebDriver driver;
//
//
//    @BeforeClass
//    void setupDriver(){
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeTest
//    void beforeTest(){
//        driver = new ChromeDriver();
//    }
//
//
//
//    @Test
//    void driverCommands(){
//        driver.get("https://www.saucedemo.com/");
//        // Drivers Commands
//        driver.manage().window().maximize(); // Maximize,is Browser window
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//
//        //driver.manage().window().setSize(new Dimension(1024, 768));  // set window size
//        // set timeout duration
//        //driver.manage().window().fullscreen();
//        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//
//        //WebElements Commands| Locators
//        //Locating Web Elements
//        driver.findElement(By.id("elementId"));
//        driver.findElement(By.name("elementName"));
//        driver.findElement(By.className("className"));
//        driver.findElement(By.xpath("//tag[@attribute='value']"));
//        driver.findElement(By.cssSelector("tag[attribute='value']"));
//
//
//
//
//
//    }
//
//
//
//    @AfterTest
//    void tearDown(){
//        driver.quit();
//    }
//
//
//    @AfterClass
//    void quiteApp(){
//
//    }
//
//
//
//
//
//
//
//
//}
