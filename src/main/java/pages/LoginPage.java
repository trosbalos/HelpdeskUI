package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@type=\"submit\"]")
    private WebElement submitButton;


    public LoginPage inputUsernameField(String name) {
        userNameField.sendKeys(name);
        return this;
    }
    public LoginPage inputPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }
    public LoginPage submitButtonClick() {
        submitButton.click();
        return this;
    }


    public void login(String user, String password) {
        new MainPage(driver)
                .clickLogInButton();
        new LoginPage(driver)
                .inputUsernameField(user)
                .inputPasswordField(password)
                .submitButtonClick();
    }
}
