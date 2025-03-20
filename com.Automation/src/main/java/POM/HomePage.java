package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Register")
	private WebElement registerLink;
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	@FindBy(xpath = "//span[text()='wishlist']")
	private WebElement shoppinCartLink;
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement Link;
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicLink;
	@FindBy(partialLinkText = "Log out")
	private WebElement logOutLink;
	

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public void setLogOutLink(WebElement logOutLink) {
		this.logOutLink = logOutLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppinCartLink() {
		return shoppinCartLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getLink() {
		return Link;
	}

	public WebElement getElectronicLink() {
		return electronicLink;
	}

	public void openRegisterPage() {

		registerLink.click();
	}

	public void openLoginPage() {

		loginLink.click();
	}
	
	public void openElectronicsPage() {

		electronicLink.click();
	}
	
	public void logout() {

		logOutLink.click();
	}

}
