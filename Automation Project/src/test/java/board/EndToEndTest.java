package board;

import board.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {
  @Test
  public void testEndToEndFlow() {
    // Login
    LoginPage loginPage = new LoginPage(driver);
      HomePage homePage = loginPage.login("test-1@mailinator.com", "123456");
    boardPage.placeOrder();
  }
}
