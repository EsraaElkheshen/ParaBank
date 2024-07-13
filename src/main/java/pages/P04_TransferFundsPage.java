package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P04_TransferFundsPage {
    WebDriver driver;

 public P04_TransferFundsPage(WebDriver driver) {

     this.driver = driver;
 }

 private final By FUND_TRANSFER= By.xpath("//a[normalize-space()='Transfer Funds']");
 private final By AMOUNT= By.xpath("//input[@id='amount']");
 private final By FROM_ACCOUNT= By.xpath("//select[@id='fromAccountId']");
 private final By TO_ACCOUNT= By.xpath("//select[@id='fromAccountId']");
 private final By TRANSFER_BTN= By.xpath("//input[@value='Transfer']");
 private final By FUND_TRANSFER_MSG= By.xpath("//div[@id='showForm']//h1");
 private final By COMPLETED_MSG= By.xpath("//div[@id='showResult']//h1");

    public boolean verifyCompletedMsg(String msg) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.COMPLETED_MSG));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        System.out.println( driver.findElement(this.COMPLETED_MSG).getText());
        return driver.findElement(this.COMPLETED_MSG).getText().contains(msg);
    }


    public P04_TransferFundsPage selectFromAccount(String value) {
        new PageBase(driver).selectByVisibleText(driver.findElement(this.FROM_ACCOUNT), value);
        return this;
    }

    public boolean verifyFundTransfer(String msg) {
        System.out.println( driver.findElement(this.FUND_TRANSFER_MSG).getText());
        return driver.findElement(this.FUND_TRANSFER_MSG).getText().contains(msg);
    }

    public P04_TransferFundsPage selectToAccount(String value) {
        new PageBase(driver).selectByVisibleText(driver.findElement(this.TO_ACCOUNT), value);
        return this;
    }
    public P04_TransferFundsPage clickOnFundTransfer() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.FUND_TRANSFER));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.FUND_TRANSFER).click();
        return this;
    }

    public P04_TransferFundsPage enterAmount(String value) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.AMOUNT));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.AMOUNT).sendKeys(value);
        return this;
    }

    public P04_TransferFundsPage clickOnTransferBtn() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.TRANSFER_BTN));
        } catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.TRANSFER_BTN).click();
        return this;
    }





}



