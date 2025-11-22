package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By UsernameLocator = By.id("loginusername");
    By PasswordLocator = By.id("loginpassword");
    By LogInButtonLocator = By.xpath("//button[@onclick='logIn()']");
    By CloseButtonLocator = By.cssSelector("div[class='modal-footer'] > button");
    String exepectedAnyEmptyFieldMess = "Please fill out Username and Password.";
    String exepectedWrongUsernameMess = "User does not exist.";
    String exepectedWrongPasswordMess = "Wrong password.";
    String exepectedWrongCredentialsMess = "User does not exist.";
    //By ActualMessLocator = By.
    By okButtonLocator = By.xpath("//button[text()='OK']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(UsernameLocator).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(PasswordLocator).sendKeys(password);
    }
    public HomePage clickOnLogIn(){
        driver.findElement(LogInButtonLocator).click();
        return new HomePage(driver);
    }
    public HomePage clickOnClose(){
        driver.findElement(CloseButtonLocator).click();
        return new HomePage(driver);
    }
    public String getExepectedWrongCredentialsMess(){
        return exepectedWrongCredentialsMess;
    }
    public String getExepectedWrongUsernameMess(){
        return exepectedWrongUsernameMess;
    }
    public String getExepectedWrongPasswordMess(){
        return exepectedWrongPasswordMess;
    }
    public String getExepectedAnyEmptyFieldMess(){
        return exepectedAnyEmptyFieldMess;
    }
//    public String getActualMess(){
//        return driver.findElement(ActualMessLocator).getText();
//    }
    public void clickOK() {
        driver.findElement(okButtonLocator).click();
    }
}
