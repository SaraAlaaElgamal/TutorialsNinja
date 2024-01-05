package testcases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_LoginPage;
import retryTest.Retry;
import java.io.IOException;
import java.text.ParseException;
import static util.Utility.*;

@Feature("Login Feature")
@Epic("Login Epic")
public class TC01_Login extends TestBase{
    //ToDo: Define Test Data
    String email = getSingleJsonData(System.getProperty("user.dir")+"/src/test/resources/data_driven/LoginData.json","email");
    String password = getSingleJsonData(System.getProperty("user.dir")+"/src/test/resources/data_driven/LoginData.json","password");
    public TC01_Login() throws IOException, ParseException, org.json.simple.parser.ParseException {
    }
    //Test Cases
    @Description("Login with Valid Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 1, description = "Login with Valid Data",retryAnalyzer = Retry.class)
    public void loginWithValidData_P() throws InterruptedException {
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_LoginPage(driver).fillEmail(email).fillPassword(password).clickLoginBtn();

        //ToDo: Check if Login successfully
        //Assert.assertTrue(new P02_DashboardPage(driver).validateLoginSuccessfully());
        //Assert.assertTrue(new P02_DashboardPage(driver).validateNavigateToDashboard());
    }
    @Description("Login with Valid Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 2, description = "Login with Valid Email and Invalid Password")
    public void loginWithValidUserName_N() throws InterruptedException {
        password = "56788uhg";
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_LoginPage(driver).fillEmail(email).fillPassword(password).clickLoginBtn();

        //ToDo: Check Validation Message
        //Assert.assertTrue(new P01_LoginPage(driver).verifyInvalidCredentials());
    }
    @Description("Login with Valid Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 3, description = "Login with Invalid Email and Valid Password")
    public void loginWithValidPassword_N() throws InterruptedException {
        email = "test@test.com";
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_LoginPage(driver).fillEmail(email).fillPassword(password).clickLoginBtn();

        //ToDo: Check Validation Message
        //Assert.assertTrue(new P01_LoginPage(driver).verifyInvalidCredentials());
    }
    @Description("Login with Valid Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(priority = 4, description = "Login with Invalid Data")
    public void loginWithInvalidData_N() throws InterruptedException {
        email = "test@test.com";
        password = "56788uhg";
        new P01_HomePage(driver).clickMyAccount().clickLogin();
        new P02_LoginPage(driver).fillEmail(email).fillPassword(password).clickLoginBtn();

        //ToDo: Check Validation Message
        //Assert.assertTrue(new P01_LoginPage(driver).verifyInvalidCredentials());
    }
}
