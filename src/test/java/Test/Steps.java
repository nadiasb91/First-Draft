package Test;

import Helpers.DP;
import Helpers.Helper;
import Pages.OpenCartSignUp;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class Steps extends BaseTest{
    protected OpenCartSignUp openCartSignUp;

    @Before
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(new Helper().OPENCART_URL);
    }

    @When("user fill out the sign up from with valid data")
    public void user_fill_out_the_sign_up_from_with_valid_data(String firstname, String lastname, String email, String phone, String password, String passwordConfirm) {
        openCartSignUp = new OpenCartSignUp(driver);
        openCartSignUp.clickMyAccount();
        openCartSignUp.clickRegisterOption();
        Assert.assertEquals(driver.getTitle(),"Register Account","This is not the right page" );
        openCartSignUp.sendKeysToForm(firstname,lastname,email,phone,password,passwordConfirm);
        openCartSignUp.clickPolicyCheckBox();
    }

    @And("user submits")
    public void user_submits() {
        openCartSignUp.clickContinueButton();
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        Assert.assertEquals(driver.getTitle(),"Your Account Has Been Created!");
    }
}
