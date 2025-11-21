package BaseTests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
    protected WebDriver driver;
    protected HomePage homepage;
    //

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        homepage = new HomePage(driver);
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.get("https://demoblaze.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
