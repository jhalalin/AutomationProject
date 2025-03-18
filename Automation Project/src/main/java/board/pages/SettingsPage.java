package board.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends BasePage {
  @FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")
  private WebElement addToCartButton;

  public SettingsPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public BoardPage addToCart() {
    addToCartButton.click();
    return new BoardPage(driver);
  }
}
