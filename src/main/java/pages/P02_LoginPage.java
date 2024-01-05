package pages;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P02_LoginPage(WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By email = By.id("input-email");
    private final By password = By.id("input-password");
    private final By loginBtn = By.xpath("//input[@value='Login']");

    //4- Define the action methods
    public P02_LoginPage fillEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    public P02_LoginPage fillPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
    }
    public P02_LoginPage clickLoginBtn(){
        driver.findElement(this.loginBtn).click();
        return this;
    }
}
