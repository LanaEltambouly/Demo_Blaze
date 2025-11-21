package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;
    By UsernameLocator = By.id("sign-username");
    By PasswordLocator = By.id("sign-password");
    By SignUpButtonLocator = By.xpath("//button[@onclick='register()']");
    By CloseButtonLocator = By.cssSelector("div[class='modal-footer'] > button");

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String username){
        driver.findElement(UsernameLocator).sendKeys(username);
    }





}
