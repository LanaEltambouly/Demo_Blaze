package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;
    By UsernameLocator = By.id("sign-username");

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }


}
