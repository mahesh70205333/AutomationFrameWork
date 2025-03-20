package Test;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.myListner;

@Listeners(myListner.class)
public class ClassTest extends BaseTest  {

//	@Test(priority = 1)
//	public void testUserRegistration() {
//		homePage.openRegisterPage();
//		registerPage.registerUser("John", "Doe", "johndoemahesh2243@example.com", "Password123", "Password123");
//		assertEquals(registerPage.getSuccessRegistrationText(), "Your registration completed","Failed to register");
//	}
//	
//	@Test
//	public void getNineDigitRandomNumber() {
//        Random random = new Random();
//        int firstDigit = random.nextInt(6, 9); 
//        System.out.println(firstDigit*10000000000L + random.nextInt(900_000_000,999_999_999 ));
//        // Ensures a 9-digit number
//    }
	
	
	
	
     

	@Test(priority = 0)
	public void testValidLogin() {
		//homePage.getLogOutLink().click();
		homePage.openLoginPage();
		loginPage.login("johndoemahesh22@example.com", "Pasesword123");
		loginPage.isLoginSuccess();


	}
//
//	@Test(priority = 3)
//	public void testElectroninsProduct() throws InterruptedException {
//		
//		 homePage.getElectronicLink().click();
//		 electronicPage.clickCellPhones();
//		 electronicPage.getAddToCartButton("Smartphone").click();
//		 Thread.sleep(2000);
//		 cartPage.goToCart();
//		 assertEquals("Smartphone", cartPage.getProduct("Smartphone"));
//	}
//  
//	@AfterSuite
//	public void tearDown() {
//		driver.quit();
//	}
}
