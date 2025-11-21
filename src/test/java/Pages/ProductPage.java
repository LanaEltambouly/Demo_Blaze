package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    By AddToCartLocator = By.xpath("//a[@onclick='addToCart(1)']");
    By ProductNameLocator = By.className("name");
    By ProductPriceLocator = By.className("price-container");
    By ProductDescriptionLocator = By.id("more-information");
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickAddToCart(){
        driver.findElement(AddToCartLocator).click();
    }
    public String getProductName(){
        return driver.findElement(ProductNameLocator).getText();
    }
    public String getProductDescription(){
        return driver.findElement(ProductDescriptionLocator).getText();
    }
    public String getProductPrice(){
        return driver.findElement(ProductPriceLocator).getText();
    }

}
