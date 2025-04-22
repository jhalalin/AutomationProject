package board.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage {
  @FindBy(xpath = "//*[@id=\'root\']/main/aside/div[1]/div/div[1]/div/div")
  private WebElement profileMenu;

  @FindBy(xpath = "//*[@id=\'root\']/main/aside/div[1]/div/div[2]/ul[2]/button")
  private WebElement logout;

  public LogoutPage(WebDriver driver) {
      super(driver);
      PageFactory.initElements(driver, this);
  }
  public SettingsPage selectFirstProduct() {
      profileMenu.click();
      return new SettingsPage(driver);
  }
}
