package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.myListner;

@Listeners(genericLibrary.myListner.class)
public class TestSuite extends BaseTest {

	@Test(priority = 1)
	public void testUserRegistration() {
		homePage.openRegisterPage();
		registerPage.registerUser("John", "Doe", "johndoe@example.com", "Password123", "Password123");
	}

	@Test(priority = 2)
	public void testValidLogin() {
		homePage.openLoginPage();
		loginPage.login("johndoemahesh22@example.com", "Password123");
	}

	@Test(priority = 3)
	public void testSearchProduct() {
		searchPage.searchProduct("Laptop");
	}

	@Test(priority = 4)
	public void testAddToCart() throws InterruptedException {
		searchPage.searchProduct("Laptop");

		cartPage.addToCart();
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void testCheckout() throws InterruptedException {

		cartPage.goToCart();

		cartPage.clickOnTermsofServiceCheckBox();

		checkoutPage.checkout("John", "Doe", "john2doe@example.com");
		checkoutPage.fillBillingDetails("mahesh", "shingade", "johndoemahesh22@example.com", "maheshmake", "India",
				"maharashtra", "pune", "sarole", "mohol", "413248", "7020445333");
		Thread.sleep(5000);
	}

}
