package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P01_HomePage(WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By myAccount = By.xpath("//span[normalize-space()='My Account']");
    private final By registerBtn = By.xpath("//a[normalize-space()='Register']");
    private final By loginBtn = By.xpath("//a[normalize-space()='Login']");

    //4- Define the action methods
    public P01_HomePage clickMyAccount(){
        driver.findElement(this.myAccount).click();
        return this;
    }
    public P01_HomePage clickRegister(){
        driver.findElement(this.registerBtn).click();
        return this;
    }
    public P01_HomePage clickLogin(){
        driver.findElement(this.loginBtn).click();
        return this;
    }
}
