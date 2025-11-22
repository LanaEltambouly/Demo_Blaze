package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage {
    WebDriver driver;
    By UsernameLocator = By.id("sign-username");
    By PasswordLocator = By.id("sign-password");
    By SignUpButtonLocator = By.xpath("//button[@onclick='register()']");
    By CloseButtonLocator = By.cssSelector("div[class='modal-footer'] > button");
    String exepectedSuccessfulSignUpMess = "Sign up successful.";
    String exepectedAnyEmptyFieldMess = "Please fill out Username and Password.";
    String exepectedExistUsernameMess = "This user already exist.";
    //By ActualMessLocator = By.
    By okButtonLocator = By.xpath("//button[text()='OK']");

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(UsernameLocator).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(PasswordLocator).sendKeys(password);
    }
    public HomePage clickOnClose(){
        driver.findElement(CloseButtonLocator).click();
        return new HomePage(driver);
    }
    public HomePage clickOnSignaUp(){
        driver.findElement(SignUpButtonLocator).click();
        return new HomePage(driver);
    }
    public String getExepectedSuccessfulSignUpMess(){
        return exepectedSuccessfulSignUpMess;
    }
    public String getExepectedAnyEmptyFieldMess(){
        return exepectedAnyEmptyFieldMess;
    }
    public String getExistUsernameMess(){
        return exepectedExistUsernameMess;
    }
//    public String getActualMess(){
//        return driver.findElement(ActualMessLocator).getText();
//    }

    public void clickOK() {
        driver.findElement(okButtonLocator).click();
    }





}
