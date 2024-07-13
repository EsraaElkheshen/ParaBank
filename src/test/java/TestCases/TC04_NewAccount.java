package TestCases;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.P03_NewAccountPage;



@Epic("Check New Account Screen")
public class TC04_NewAccount extends TestBase {
    @Story("New Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("New Account")
    @Parameters({ "accountType" })
    @Test(priority = 1, description = "New Account Page")
    public void createNewAccount(String accountType) {
        new P03_NewAccountPage(driver).openNewAccount().verifyOpeningNewAccount("Open New Account");
        new P03_NewAccountPage(driver).selectAccountType(accountType).clickOnNewAccount();
        Assert.assertTrue(new P03_NewAccountPage(driver).verifyCongratulationsMsg("Congratulations, your account is now open."));
    }

    @Test(priority = 2, description = "save first account id")
    public void saveFirstAccId() {
        new P03_NewAccountPage(driver).getAccountId();
    }

    @Test(priority = 3, description = "save second account id")
    public void saveSecondAccId() {
        new P03_NewAccountPage(driver).getSecondAccountId();
    }


}



