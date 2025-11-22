package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait ;
    By PlaceOrderButtonLocator = By.xpath("//button[text()='Place Order']");
    By DeleteLocator = By.linkText("Delete") ;
    By titleLocator = By.xpath("//table[@class='table table-bordered table-hover table-striped']//td[2]");
    By priceLocator = By.xpath("//table[@class='table table-bordered table-hover table-striped']//td[3]");
    By imageLocator = By.xpath("//table[@class='table table-bordered table-hover table-striped']//img");
    By totalPriceLocator = By.id("totalp");



    public CartPage(WebDriver driver){

        this.driver = driver;
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public PlaceOrderPage ClickOnPlaceOrder(){

        driver.findElement(PlaceOrderButtonLocator).click();
        return  new PlaceOrderPage(driver);
    }

    public  CartPage ClickOnDelete(){          //*
        driver.findElement(DeleteLocator).click();
        return new CartPage(driver) ;
    }

    public String getTitle(){
        return driver.findElement(titleLocator).getText();
    }

    public  String getProductPrice(){
        return driver.findElement(priceLocator).getText();

    }

    public boolean displayedImage(){
        return driver.findElement(imageLocator).isDisplayed();
    }

    public String getTotalPrice(){
        return driver.findElement(totalPriceLocator).getText();
    }




}
