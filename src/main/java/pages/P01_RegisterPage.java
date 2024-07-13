package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.shortWait;
import static org.junit.Assert.fail;

public class P01_RegisterPage {

    WebDriver driver;

    public P01_RegisterPage(WebDriver driver) {

        this.driver = driver;
    }
    private final By Register= By.xpath("//a[normalize-space()='Register']");
    private final By FIRST_NAME= By.xpath("//input[@id='customer.firstName']");
    private final By LAST_NAME = By.xpath("//input[@id='customer.lastName']");
    private final By ADDRESS = By.xpath("//input[@id='customer.address.street']");
    private final By CITY= By.xpath("//input[@id='customer.address.city']");
    private final By STATE= By.xpath("//input[@id='customer.address.state']");
    private final By ZIP_CODE = By.xpath("//input[@id='customer.address.zipCode']");
    private final By PHONE = By.xpath("//input[@id='customer.phoneNumber']");
    private final By SSN= By.xpath("//input[@id='customer.ssn']");
    private final By USERNAME = By.xpath("//input[@id='customer.username']");
    private final By PASSWORD = By.xpath("//input[@id='customer.password']");
    private final By CONFIRM_PASSWORD = By.xpath("//input[@id='repeatedPassword']");
    private final By REGISTER_BTN = By.xpath("//input[@value='Register']");
    private final By USER_MSG= By.xpath("//div[@id='rightPanel']//h1");
    private final By MSG= By.xpath("//div[@id='rightPanel']//P");

    public String verifyUserRegisterMsg(){
        System.out.println(driver.findElement(this.USER_MSG).getText());
        return driver.findElement(this.USER_MSG).getText().replace("Welcome ", "");
        //     String[] parts = welcomeText.split("Welcome ");
        //        String username = parts[1];

    }
    public boolean verifyRegisterMsg(String msg){
        System.out.println(driver.findElement(this.MSG).getText());
        return driver.findElement(this.MSG).getText().contains(msg);
    }

    public P01_RegisterPage openRegisterPage(){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.Register));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.Register).click();
        return this;
    }

    public P01_RegisterPage enterFirstName(String firstName){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.FIRST_NAME));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.FIRST_NAME).sendKeys(firstName);
        return this;
    }

    public P01_RegisterPage enterLastName(String lastName){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.LAST_NAME));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.LAST_NAME).sendKeys(lastName);
        return this;
    }

    public P01_RegisterPage enterAddress(String address){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ADDRESS));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ADDRESS).sendKeys(address);
        return this;
    }

    public P01_RegisterPage enterCity(String city){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CITY));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CITY).sendKeys(city);
        return this;
    }

    public P01_RegisterPage enterState(String state){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.STATE));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.STATE).sendKeys(state);
        return this;
    }

    public P01_RegisterPage enterZipCode(String zipcode){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.ZIP_CODE));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.ZIP_CODE).sendKeys(zipcode);
        return this;
    }

    public P01_RegisterPage enterPhone(String phone){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.PHONE));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.PHONE).sendKeys(phone);
        return this;
    }

    public P01_RegisterPage enterSsn(String ssn){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.SSN));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.SSN).sendKeys(ssn);
        return this;
    }

    public P01_RegisterPage enterUserName(String userName){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.USERNAME));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.USERNAME).sendKeys(userName);
        return this;
    }

    public P01_RegisterPage enterPassword(String password){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.PASSWORD));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.PASSWORD).sendKeys(password);
        return this;
    }

    public P01_RegisterPage enterConfirmPassword(String confirmPassword){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CONFIRM_PASSWORD));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.CONFIRM_PASSWORD).sendKeys(confirmPassword);
        return this;
    }

    public P01_RegisterPage clickRegisterBtn(){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.REGISTER_BTN));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.REGISTER_BTN).click();
        return this;
    }
    }



