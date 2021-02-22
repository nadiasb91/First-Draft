package Test;

import Helpers.DP;
import Pages.OpenCartSignUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOpenCartSignUp extends BaseTest {
    protected OpenCartSignUp openCartSignUp;

    @Test(dataProviderClass = DP.class, dataProvider ="signup-provider")
    public void VerifySignUp(String firstname, String lastname, String email, String phone, String password, String passwordConfirm) {
        openCartSignUp = new OpenCartSignUp(driver);
        openCartSignUp.clickMyAccount();
        openCartSignUp.clickRegisterOption();
        Assert.assertEquals(driver.getTitle(),"Register Account","This is not the right page" );
        openCartSignUp.sendKeysToForm(firstname,lastname,email,phone,password,passwordConfirm);
        openCartSignUp.clickPolicyCheckBox();
        openCartSignUp.clickContinueButton();
        Assert.assertEquals(driver.getTitle(),"Your Account Has Been Created!");
    }










}
