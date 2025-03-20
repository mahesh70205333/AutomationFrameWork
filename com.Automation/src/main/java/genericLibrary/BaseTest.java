package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import POM.*;

public class BaseTest implements Constatant {
	public static WebDriver driver;

	// Page Object Declarations
	public LoginPage loginPage;
	public RegisterPage registerPage;
	public SearchPage searchPage;
	public CartPage cartPage;
	public CheckoutPage checkoutPage;
	public HomePage homePage;
	public ElectronicsPage electronicPage;

	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");

		// Initialize Page Objects
		loginPage = new LoginPage(driver);
		registerPage = new RegisterPage(driver);
		searchPage = new SearchPage(driver);
		cartPage = new CartPage(driver);
		checkoutPage = new CheckoutPage(driver);
		homePage = new HomePage(driver);
		electronicPage= new ElectronicsPage(driver);
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	@DataProvider(name="loginInvalidCred")
	public  String[][] dataProviderMehtodInvalidLogin() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(EXCEL_PATH_TEST);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		String data[][] = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++)
				data[i - 1][j] = sheet.getRow(i).getCell(j) + "";

		}
		return data;
	}
	@DataProvider(name="loginValidCred")
	public  String[][] dataProviderMehtodValidLOgin() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(EXCEL_PATH_TEST);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String data[][] = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++)
				data[i - 1][j] = sheet.getRow(i).getCell(j) + "";

		}
		return data;
	}
}
