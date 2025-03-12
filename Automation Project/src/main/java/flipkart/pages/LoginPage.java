package flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
  @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
  private WebElement usernameField;

  @FindBy(xpath = "//input[@type='password']")
  private WebElement passwordField;

  @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
  private WebElement loginButton;

  public LoginPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public HomePage login(String username, String password) {
    usernameField.sendKeys(username);
    passwordField.sendKeys(password);
    loginButton.click();
    return new HomePage(driver);
  }
}
