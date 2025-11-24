package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;
    By SignUpLocator = By.id("signin2");
    By LogInLocator = By.id("login2");
    By LogOutLocator = By.id("logout2");
    By CartLocator = By.id("cartur");
    By AboutUsLocator = By.xpath("//a[contains(@data-target, '#videoModal')]");
    By ContactLocator = By.xpath("//a[contains(@data-target,'#exampleModal')]");
    By WelcomeLocator = By.id("nameofuser");
    // By CategoriesLocator = By.id("cat");
    //    By PhonesCategoryLocator = By.xpath("//a[contains(@onclick, byCat('phone'))]");
//    By LaptopsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('notebook'))]");
//    By MonitorsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('monitor'))]");
//    By NextButtonLocator = By.xpath("//button[text()='Next']");
//    By PreviousButtonLocator = By.xpath("//button[text()='Previous']");
    //By ProductsLocator = By.className("col-lg-4 col-md-6 mb-4");
    //By imgLocator = By.className("d-block img-fluid");


    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public SignUpPage clickOnSignUp(){
        driver.findElement(SignUpLocator).click();
        return new SignUpPage(driver);
    }
    public LoginPage clickOnLogIn(){
        driver.findElement(LogInLocator).click();
        return new LoginPage(driver);
    }
    public CartPage clickOnCart(){
        driver.findElement(CartLocator).click();
        return new CartPage(driver);
    }
    public AboutUsPage clickOnAboutUs(){
        driver.findElement(AboutUsLocator).click();
        return new AboutUsPage(driver);
    }
    public ContactPage clickOnContact(){
        driver.findElement(ContactLocator).click();
        return new ContactPage(driver);
    }
    public String getActualWelcomeStatement(){
        return driver.findElement(WelcomeLocator).getText();
    }
    public void ClickOnLogout(){
        driver.findElement(LogOutLocator).click();
    }

//    public HomePage ClickOnCategories(){
//        driver.findElement(CategoriesLocator).click();
//        return new HomePage(driver);
//    }
//    public PhonesCatPage ClickOnPhonesCat(){
//        driver.findElement(PhonesCategoryLocator).click();
//        return new PhonesCatPage(driver);
//    }
//    public LaptopsCatPage ClickOnLaptopsCat(){
//        driver.findElement(LaptopsCategoryLocator).click();
//        return new LaptopsCatPage(driver);
//    }
//    public MonitorsCatPage ClickOnMonitorsCat(){
//        driver.findElement(MonitorsCategoryLocator).click();
//        return new MonitorsCatPage(driver);
//    }
//    public NextPage ClickOnNextButton(){
//        driver.findElement(NextButtonLocator).click();
//        return new NextPage(driver);
//    }
//    public PreviousPage ClickOnPreviousButton(){
//        driver.findElement(PreviousButtonLocator).click();
//        return new PreviousPage(driver);
//    }

//    public ProductPage clickOnProduct(int i){
//        List<WebElement> Products = driver.findElements(ProductsLocator);
//        Products.get(i).click();
//        return new ProductPage(driver);
//    }
//    public boolean imgIsDisplayed(){
//        return driver.findElement(imgLocator).isDisplayed();
//    }




}
