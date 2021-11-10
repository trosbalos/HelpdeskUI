package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketsPage extends AbstractPage {

    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class=\"fas fa-pencil-alt\"]")
    private WebElement editButton;
        public TicketsPage editButtonClick() {
            editButton.click();
        return this;
    }

}
