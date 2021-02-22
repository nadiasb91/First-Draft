package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OpenCartSignUp {

    protected WebDriver driver;

    public OpenCartSignUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title=\"My Account\"]")
    WebElement myAccountOption;
    @FindBy(linkText = "Register")
    WebElement registerOption;
    @FindBy(id = "input-firstname")
    WebElement firstNameInput;
    @FindBy(id = "input-lastname")
    WebElement lastNameInput;
    @FindBy(id = "input-email")
    WebElement emailInput;
    @FindBy(id = "input-telephone")
    WebElement phoneInput;
    @FindBy(id = "input-password")
    WebElement passwordInput;
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordInput;
    @FindBy(name = "agree")
    WebElement policyCheckBox;
    @FindBy(xpath = "//input[@value=\"Continue\"]")
    WebElement continueButton;
    @FindBy(xpath = "//div[@id=\"account-register\"]/div[1]")
    WebElement messageEmailDuplicate;
    @FindBy(xpath = "//*[@id=\"account\"]/div[4]/div/div")
    WebElement messageEmailInvalid;
    @FindBy(linkText = "Login")
    WebElement loginOption;
    @FindBy(xpath = "//input[@value=\"Login\"]")
    WebElement loginButton;


    public void clickMyAccount() {
        myAccountOption.click();
    }

    public void clickRegisterOption() {
        registerOption.click();
    }


    public void sendKeysToForm(String firstname, String lastname, String email, String phone, String password, String passwordConfirm) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        emailInput.sendKeys(email);
        phoneInput.sendKeys(phone);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(passwordConfirm);

    }

    public void sendKeysFirstNameField(String firstname) {
           firstNameInput.sendKeys(firstname);
    }

    public void sendKeysLastName(String lastname) {
        lastNameInput.sendKeys(lastname);
    }

    public void senKeysEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void senKeysPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void sendKeysPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void sendKeysPasswordConfirm(String passwordConfirm) {
        confirmPasswordInput.sendKeys(passwordConfirm);
    }

    public void clickPolicyCheckBox() {
        policyCheckBox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
    public void clickLoginMenu(){
        loginOption.click();
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}