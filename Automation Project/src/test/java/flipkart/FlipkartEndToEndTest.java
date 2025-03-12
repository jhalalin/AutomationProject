package flipkart;

import flipkart.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartEndToEndTest extends BaseTest {
  @Test
  public void testFlipkartEndToEndFlow() {
    // Login
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = loginPage.login("your_username", "your_password");
    // Search product
    SearchResultsPage searchResults = homePage.searchProduct("iPhone 13");
    // Select product
    ProductPage productPage = searchResults.selectFirstProduct();
    // Add to cart
    CartPage cartPage = productPage.addToCart();
    // Verify cart page is displayed
    Assert.assertTrue(cartPage.placeOrderButton.isDisplayed(), "Cart page not displayed correctly");
    // Proceed to checkout
    cartPage.placeOrder();
  }
}
