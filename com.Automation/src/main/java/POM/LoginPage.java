package POM;
import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    WebDriver driver;

    @FindBy(id = "Email")
    WebElement emailField;
    
    @FindBy(xpath = "//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	WebElement errorMessageBox;

    public WebElement getErrorMessageBox() {
		return errorMessageBox;
	}

	@FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(css = "input[value='Log in']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    
    public void  isLoginSuccess(){
    	List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Login was unsuccessful')]"));
    	 assertEquals(list.isEmpty(),true,"Failed To Login");
		
	}
}