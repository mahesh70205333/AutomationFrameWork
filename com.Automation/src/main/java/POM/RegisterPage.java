package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;

	@FindBy(id = "FirstName")
	WebElement firstName;
	
	
	@FindBy(xpath = "//h1[text()='Register']/../..//li")
	WebElement errorRegistrationText; 

	@FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
	WebElement successRegistrationText;
	

	@FindBy(id = "LastName")
	WebElement lastName;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(id = "register-button")
	WebElement registerButton;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSuccessRegistrationTextBox() {
		return successRegistrationText;
		
		
	}

	public void registerUser(String fName, String lName, String userEmail, String pass, String confirmPass) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email.sendKeys(userEmail);
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
		registerButton.click();
	}

	public String getSuccessRegistrationText() {
		return successRegistrationText.getText();
		
		
	}
}