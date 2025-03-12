package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
  @FindBy(xpath = "//button[contains(text(),'Place Order')]")
  public WebElement placeOrderButton;

  public CartPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public void placeOrder() {
    placeOrderButton.click();
  }
}
