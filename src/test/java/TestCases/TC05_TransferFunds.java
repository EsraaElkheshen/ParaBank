package TestCases;

import io.qameta.allure.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P04_TransferFundsPage;

import static pages.P03_NewAccountPage.accountId;
import static pages.P03_NewAccountPage.secondAccountId;


@Epic("Transfer Funds")
public class TC05_TransferFunds extends TestBase {
    @Story("Transfer Funds")
    @Severity(SeverityLevel.NORMAL)
    @Description("Transfer Funds")
    @Test(priority = 1, description = "Transfer Funds")
    public void openTransferFunds() {
        new P04_TransferFundsPage(driver).clickOnFundTransfer();
        Assert.assertTrue(new P04_TransferFundsPage(driver).verifyFundTransfer("Transfer Funds"));
        new P04_TransferFundsPage(driver).enterAmount("100").selectFromAccount(accountId).
                selectToAccount(secondAccountId).clickOnTransferBtn();
        Assert.assertTrue(new P04_TransferFundsPage(driver).verifyCompletedMsg("Transfer Complete!"));
    }
}



