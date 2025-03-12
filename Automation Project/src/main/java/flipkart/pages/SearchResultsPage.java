package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "(//div[contains(@class,'_4rR01T')])[1]")
    private WebElement firstProduct;
    public SearchResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public ProductPage selectFirstProduct() {
        firstProduct.click();
        return new ProductPage(driver);
    }
}
