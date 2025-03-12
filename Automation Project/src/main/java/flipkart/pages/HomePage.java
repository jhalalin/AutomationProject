package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
  @FindBy(xpath = "//input[@title='Search for products, brands and more']")
  private WebElement searchBox;

  @FindBy(xpath = "//button[@type='submit']")
  private WebElement searchButton;

  public HomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public SearchResultsPage searchProduct(String productName) {
    searchBox.sendKeys(productName);
    searchButton.click();
    return new SearchResultsPage(driver);
  }
}
