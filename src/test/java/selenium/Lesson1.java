//package selenium;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.*;
//
//import java.time.Duration;
//
//public class Lesson1 {
//
//
//    //  Call the Webdriver and set it // there tacks that need to be performed before test runs like settng up
//    //  webdriver
//      WebDriver messanger;  // give it any name variable or an instance webdriver
//
//      // Some Anotations are used before an action and some ar eused after an actions is concluded
//       // @BeforeSuite, @BeforeClass, @BeforeGroups, @BeforeMethod, @BeforeTest,
//       // @AfterSuite, @AfterClass, @AfterGroups, @AfterMethod, @AfterTest
//      // @Test
//
//      @BeforeClass
//      public void setup(){
//          WebDriverManager.chromedriver().setup(); // instantiate chrome
//      }
//
//
//      @BeforeTest
//      public void beforeMethod(){
//          messanger = new ChromeDriver(); // sett the driver instance to chromdriver
//      }
//
//
//      @Test
//      public void OpenBrowser(){
//          messanger.get("https://www.saucedemo.com/"); // start and get the app url
//          messanger.manage().window().maximize();
//          WebDriverWait wait = new WebDriverWait(messanger, Duration.ofSeconds(20));
//      }
//
//
//      @AfterTest
//      public void closeBrowser(){
//         messanger.close();
//      }
//
//
//
//
//
//
//
//
//
//
//
//       /*
//       *  1. Drivers commands
//       *
//       *    Timeout Management ( Implicit , explicit )
//       *
//       *  2. Navigation Commands
//       *
//       *
//       *  3. Windows Commands
//       *
//       *  4. Interactions commands
//       *
//       *
//       *  5. Miscelleneous Commands
//       *
//          6. Switch Text Commnads
//          *
//       *  7.Timeout Magement
//       /
//        */
//
//
//
//
//
//
//}
