package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;
   public class  P02_LoginPage{
       WebDriver driver;
    public P02_LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    private final By USER_NAME= By.xpath("//input[@name='username']");
    private final By PASSWORD= By.xpath("//input[@name='password']");
    private final By LOGIN_BTN = By.xpath("//input[@value='Log In']");
    private final By MSG = By.xpath("//div[@id='showOverview']//h1");
    private final By LOGIN_PAGE = By.xpath("//div[@id='leftPanel']//h2");

   public boolean verifyLogin(){
       System.out.println(driver.findElement(this.MSG).getText());
       return driver.findElement(this.MSG).getText().contains("Accounts Overview");
   }

       public boolean verifyLoginPage(String value){
           System.out.println(driver.findElement(this.LOGIN_PAGE).getText());
           return driver.findElement(this.LOGIN_PAGE).getText().contains(value);
       }

    public P02_LoginPage enterUserName(String userName){
        try
        {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.USER_NAME));
        }
        catch (TimeoutException exception) {
            fail("Element not found");
        }
        driver.findElement(this.USER_NAME).sendKeys(userName);
        return this;
    }

    public P02_LoginPage enterPassword(String password){
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


       public P02_LoginPage clickOnLoginButton(){
           try
           {
               shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.LOGIN_BTN));
           }
           catch (TimeoutException exception) {
               fail("Element not found");
           }
           driver.findElement(this.LOGIN_BTN).click();
           return this;
       }


    }



