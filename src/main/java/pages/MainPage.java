package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"userDropdown\"]")
    private WebElement logInButton;
    @FindBy(xpath = "//span[text()='New Ticket']")
    private WebElement newTicketSpan;



    public MainPage clickLogInButton() {
        logInButton.click();
        return this;
    }
    public MainPage clickNewTicket() {
        newTicketSpan.click();
        return this;
    }

}
