package TestCases;

import io.qameta.allure.*;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegisterPage;
import pages.P02_LoginPage;
import util.Utility;

import java.io.IOException;

import static util.Utility.getRandomFirstName;
import static util.Utility.getRandomLastName;


@Epic("Check Login Screen")
public class TC02_Login extends TestBase {
   String userName = Utility.getSingleJsonData(System.getProperty("user.dir") + "//src//test//resources//test_data//logindata.json", "Username");
   String password = Utility.getExceelData(0, 0, "Sheet1");

    public TC02_Login() throws IOException, ParseException {
    }

    // check Register positive scenarios
    @Story("login Name")
    @Severity(SeverityLevel.NORMAL)
    @Description("Login Name")
    @Test(priority = 1, description = "login Page")
    public void loginPage() {
    new P02_LoginPage(driver).enterUserName(userName).enterPassword(password).clickOnLoginButton();
    System.out.println(userName);
        System.out.println(password);
    Assert.assertTrue(new P02_LoginPage(driver).verifyLogin());
    }}



