package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
    WebDriver driver;

    // Locators for elements on the Electronics page
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Camera, photo')]")
    private WebElement cameraPhotoSection;

    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Cell phones')]")
    private WebElement cellPhonesSection;
    
    @FindBy(xpath="//a[text()='+productLinkname+']/../..//input[@type='button']")
    private WebElement addToCartButton;
    

    // Constructor
    public ElectronicsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Click on Camera & Photo section
    public void clickCameraPhoto() {
        cameraPhotoSection.click();
    }

    // Click on Cell Phones section
    public void clickCellPhones() {
        cellPhonesSection.click();
    }

    // Get page title
    public String getPageTitle() {
        return driver.getTitle();
    }
    
    public WebElement getAddToCartButton(String productLinkname) {
        String xpath = String.format("//a[text()='%s']/../..//input[@type='button']", productLinkname);
        return driver.findElement(By.xpath(xpath));
    }
}
