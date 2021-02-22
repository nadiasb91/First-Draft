package Test;

import Pages.MyAccountPage;
import Pages.OpenCartSignUp;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    protected OpenCartSignUp openCartSignUp;
    protected MyAccountPage myAccountPage;

    @BeforeMethod
    public void Login() {
        openCartSignUp= new OpenCartSignUp(driver);
        myAccountPage=new MyAccountPage(driver);
        openCartSignUp.clickMyAccount();
        openCartSignUp.clickLoginMenu();
        openCartSignUp.senKeysEmail("lola@gmail.com");
        openCartSignUp.sendKeysPassword("1234");
        openCartSignUp.clickLoginButton();
        Assert.assertEquals(driver.getTitle(),"My Account");
        Assert.assertEquals(myAccountPage.getLinkText(),"Your Store");
    }

    @Test(priority = 1)
    public void editYourAccountInformationLink(){
        myAccountPage.clickEditYourAccountLink();
    }




}
