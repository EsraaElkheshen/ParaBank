package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.longWait;
import static pages.PageBase.shortWait;

public class P03_NewAccountPage {
    WebDriver driver;
    public static String accountId;
    public static String secondAccountId;
 public P03_NewAccountPage(WebDriver driver) {

     this.driver = driver;
 }

 private final By NEW_ACCOUNT= By.xpath("//a[normalize-space()='Open New Account']");
 private final By NEW_ACCOUNT_PAGE= By.xpath("//div[@id='openAccountForm']//h1");
 private final By ACCOUNT_TYPE= By.xpath("//form//select[@id='type']");
 private final By ACCOUNT_ID= By.xpath("//form//select[@id='fromAccountId']");
 private final By NEW_ACCOUNT_BTN= By.xpath("//input[@value='Open New Account']");
 private final By CONG_MSG= By.xpath("//div[@id='openAccountResult']//p[text()='Congratulations, your account is now open.']");
 private final By ACCOUNT_ID_TEXT= By.xpath("//a[@id='newAccountId']");

    public boolean verifyCongratulationsMsg(String value) {
        try {
            longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.CONG_MSG));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        System.out.println(driver.findElement(this.CONG_MSG).getText());
        return driver.findElement(this.CONG_MSG).getText().contains(value);
    }

    public void getAccountId() {
        System.out.println("account Id : " +driver.findElement(this.ACCOUNT_ID_TEXT).getText());
        accountId = driver.findElement(this.ACCOUNT_ID_TEXT).getText();
    }

    public void getSecondAccountId() {
        System.out.println("secondAccount Id : " +driver.findElement(this.ACCOUNT_ID_TEXT).getText());
        secondAccountId = driver.findElement(this.ACCOUNT_ID_TEXT).getText();
    }

    public P03_NewAccountPage clickOnNewAccount() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.NEW_ACCOUNT_BTN));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.NEW_ACCOUNT_BTN).click();
        return this;
    }

    public boolean verifyOpeningNewAccount(String value) {
        System.out.println(driver.findElement(this.NEW_ACCOUNT_PAGE).getText());
        return driver.findElement(this.NEW_ACCOUNT_PAGE).getText().contains(value);
    }

    public P03_NewAccountPage openNewAccount() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.NEW_ACCOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.NEW_ACCOUNT).click();
        return this;
    }

    public P03_NewAccountPage selectAccountType(String value) {
        new PageBase(driver).selectByVisibleText(driver.findElement(this.ACCOUNT_TYPE), value);
        return this;
    }

    public P03_NewAccountPage selectAccountID(String value) {
       new PageBase(driver).selectByVisibleText(driver.findElement(this.ACCOUNT_ID), value);
        return this;
    }




}



