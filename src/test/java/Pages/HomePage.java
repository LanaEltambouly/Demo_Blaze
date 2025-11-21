package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By SignUpLocator = By.id("signin2");
    //By LogInLocator =
    //By AboutUsLocator =
    //By ContactLocator =
    By CartLocator = By.id("cartur");
    //By HomeLocator =
    By CategoriesLocator = By.id("cat");
    By PhonesCategoryLocator = By.xpath("//a[contains(@onclick, byCat('phone'))]");
    By LaptopsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('notebook'))]");
    By MonitorsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('monitor'))]");
    By NextButtonLocator = By.xpath("//button[text()='Next']");
    By PreviousButtonLocator = By.xpath("//button[text()='Previous']");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignUpPage clickOnSignUp(){
        driver.findElement(SignUpLocator).click();
        return new SignUpPage(driver);
    }
    public void ClickOnCategories(){
        driver.findElement(CategoriesLocator).click();
    }
    public void ClickOnPhonesCat(){
        driver.findElement(PhonesCategoryLocator).click();
    }
    public void ClickOnLaptopsCat(){
        driver.findElement(LaptopsCategoryLocator).click();
    }
    public void ClickOnMonitorsCat(){
        driver.findElement(MonitorsCategoryLocator).click();
    }
    public void ClickOnNextButton(){
        driver.findElement(NextButtonLocator).click();
    }
    public void ClickOnPreviousButton(){
        driver.findElement(PreviousButtonLocator).click();
    }
    public CartPage clickOnCart(){
        driver.findElement(CartLocator).click();
        return new CartPage(driver);
    }



}
