package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.myListner;

@Listeners(myListner.class)
public class InvalidLogin extends BaseTest {

	
     
	
	
	@Test(dataProvider = "loginValidCred", dataProviderClass = genericLibrary.BaseTest.class)

	public void testValidLogin(String email, String password) {
		homePage.openLoginPage();
		loginPage.login(email, password);
	}


	
}
