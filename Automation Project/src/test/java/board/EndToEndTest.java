package board;

import board.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {
  @Test
  public void testFlipkartEndToEndFlow() {
    // Login
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = loginPage.login("your_username", "your_password");
    // Search product
    LogoutPage searchResults = homePage.searchProduct("iPhone 13");
    // Select product
    SettingsPage settingsPage = searchResults.selectFirstProduct();
    // Add to cart
    BoardPage boardPage = settingsPage.addToCart();
    // Verify cart page is displayed
    Assert.assertTrue(boardPage.placeOrderButton.isDisplayed(), "Cart page not displayed correctly");
    // Proceed to checkout
    boardPage.placeOrder();
  }
}
