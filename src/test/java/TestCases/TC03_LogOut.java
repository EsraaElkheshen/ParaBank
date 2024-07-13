package TestCases;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.PageBase;


@Epic("Check LogOut Screen")
public class TC03_LogOut extends TestBase {

    // check Register positive scenarios
    @Story("logout ")
    @Severity(SeverityLevel.NORMAL)
    @Description("Logout")
    @Test(priority = 1, description = "logout Page")
    public void logOutPage() {
    new PageBase(driver).clickLogOut();
    }}



