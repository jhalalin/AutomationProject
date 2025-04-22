package board.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

  @FindBy(xpath = "//*[@id='comp-m0wbliu7']/p/span/a/span/span")
  private WebElement loginButtonHeader;

  @FindBy(xpath = "//*[@id=\'root\']/div/article/form/div[2]/div/input")
  private WebElement usernameField;

  @FindBy(xpath = "//*[@id=\'root\']/div/article/form/div[3]/div/input")
  private WebElement passwordField;

  @FindBy(xpath = "//*[@id=\'root\"']/div/article/form/button")
  private WebElement loginButton;

  public LoginPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public HomePage login(String username, String password) {
    loginButtonHeader.click();
    usernameField.sendKeys(username);
    passwordField.sendKeys(password);
    loginButton.click();
    return new HomePage(driver);
  }
}
