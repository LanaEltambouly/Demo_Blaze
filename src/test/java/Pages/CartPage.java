package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By PlaceOrderButtonLocator = By.xpath("//button[text()='Place Order']");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void ClickOnPlaceOrder(){
        driver.findElement(PlaceOrderButtonLocator).click();
    }

}
