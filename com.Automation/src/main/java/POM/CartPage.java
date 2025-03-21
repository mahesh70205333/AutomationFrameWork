package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;;

    // Locate the "Add to Cart" button
    @FindBy(css = "input[value='Add to cart']")
    WebElement addToCartButton;

    // Locate the "Shopping Cart" link
    @FindBy(linkText = "Shopping cart")
    WebElement cartLink;
    
    @FindBy(xpath="//input[@id='termsofservice' and @type='checkbox']")
    WebElement termsofserviceCheckBox;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Clicks on the "Add to Cart" button
    public void addToCart() {
        addToCartButton.click();
    }

    // Navigates to the shopping cart
    public void goToCart() {
        cartLink.click();
    }

    // Retrieves product name dynamically using XPath
    public String getProduct(String productLinkName) {
        String xpath = String.format("//a[text()='%s' and @class='product-name']", productLinkName);
        return driver.findElement(By.xpath(xpath)).getText();
    }
    
    public void clickOnTermsofServiceCheckBox() {
    	
    	termsofserviceCheckBox.click();
    }
}
