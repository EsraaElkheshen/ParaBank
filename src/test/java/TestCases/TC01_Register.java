package TestCases;

import org.testng.Assert;
import pages.P01_RegisterPage;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static util.Utility.getRandomFirstName;
import static util.Utility.getRandomLastName;


@Epic("Check Register Screen")
public class TC01_Register extends TestBase {
    static String firstName = getRandomFirstName();
    static String lastName = getRandomLastName();
    static String state = String.valueOf(faker.address().state());
    static String city = String.valueOf(faker.address().city());
    static String address = String.valueOf(faker.address().streetAddress());
    static String phone = faker.regexify("[0-9]{10}");
    static String SSN = faker.idNumber().ssnValid();
    static String password = faker.internet().password();
    String zipCode = faker.address().zipCode();
    static String userName =getRandomFirstName()+getRandomLastName();

    // check Register positive scenarios
    @Story("Register")
    @Severity(SeverityLevel.NORMAL)
    @Description("Register Page")
    @Test(priority = 1, description = "Register Page")
    public void registerPage() {
        new P01_RegisterPage(driver).openRegisterPage();
        new P01_RegisterPage(driver).enterFirstName(firstName).enterLastName(lastName).enterAddress(address).
                enterCity(city).
                enterState(state).enterZipCode(zipCode).enterPhone(phone).enterSsn(SSN).enterUserName(userName).
                enterPassword(password).enterConfirmPassword(password);
        new P01_RegisterPage(driver).clickRegisterBtn();
        Assert.assertEquals(userName,new P01_RegisterPage(driver).verifyUserRegisterMsg());
        Assert.assertTrue(new P01_RegisterPage(driver).verifyRegisterMsg("Your account was created successfully"));
    }}



