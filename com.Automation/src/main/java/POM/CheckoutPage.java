package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertEquals;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    // Billing Address Fields
    @FindBy(id = "BillingNewAddress_FirstName")
    private WebElement firstName;

    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement lastName;

    @FindBy(id = "BillingNewAddress_Email")
    private WebElement email;

    @FindBy(id = "BillingNewAddress_Company")
    private WebElement company;

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countryDropdown;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    private WebElement stateDropdown;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement city;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement address1;

    @FindBy(id = "BillingNewAddress_Address2")
    private WebElement address2;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement zipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to fill billing details
    public void fillBillingDetails(String fname, String lname, String emailText, String companyText, String country, String state, String cityText, String addr1, String addr2, String zip, String phone) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(emailText);
        company.sendKeys(companyText);
        countryDropdown.sendKeys(country);
        stateDropdown.sendKeys(state);
        city.sendKeys(cityText);
        address1.sendKeys(addr1);
        address2.sendKeys(addr2);
        zipCode.sendKeys(zip);
        phoneNumber.sendKeys(phone);
        
        continueButton.click();
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void checkout(String firstName, String lastName, String email) {
        checkoutButton.click();
//        assertEquals(this.firstName.getText(), firstName, "Mismatch in first name");
//        assertEquals(this.lastName.getText(), lastName, "Mismatch in last name");
//        assertEquals(this.email.getText(), email, "Mismatch in email");
    }
    
    
}
