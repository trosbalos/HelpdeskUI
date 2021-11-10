package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketSbubmit extends AbstractPage {
    @FindBy(
            xpath = "//*[@id=\"id_queue\"]"
    )
    private WebElement queueDropDown;
    @FindBy(
            xpath = "//*[text()=\"Django Helpdesk\"]"
    )
    private WebElement djangoSelect;
    @FindBy(
            xpath = "//*[@id=\"id_title\"]"
    )
    public WebElement titleField;
    @FindBy(
            xpath = "//*[@id=\"id_body\"]"
    )
    private WebElement ticketDescription;
    @FindBy(
            xpath = "//*[@id=\"id_description\"]"
    )
    private WebElement ticketDescriptionAfterCreate;
    @FindBy(
            xpath = "//*[@id=\"id_priority\"]"
    )
    private WebElement ticketPriority;
    @FindBy(
            xpath = "//*[text()=\"1. Critical\"]"
    )
    private WebElement criticalPriority;
    @FindBy(
            xpath = "//*[@id=\"id_due_date\"]"
    )
    private WebElement dueOnDropDown;
    @FindBy(
            xpath = "//*[@href=\"#\" and text()=\"20\"]"
    )
    private WebElement dateTwoO;
    @FindBy(
            xpath = "//*[@id=\"id_submitter_email\"]"
    )
    private WebElement emailField;
    @FindBy(
            xpath = "//*[@type=\"submit\"]"
    )
    private WebElement submitButton;

    public TicketSbubmit(WebDriver driver) {
        super(driver);
    }

    public TicketSbubmit queueDropDownClick() {
        this.queueDropDown.click();
        return this;
    }

    public TicketSbubmit djangoSelectClick() {
        this.djangoSelect.click();
        return this;
    }

    public TicketSbubmit titleFieldInput(String title) {
        this.titleField.sendKeys(new CharSequence[]{title});
        return this;
    }

    public String titleFieldGetAttribute() {
        return this.titleField.getAttribute("value");
    }

    public TicketSbubmit ticketDescriptionInput(String description) {
        this.ticketDescription.sendKeys(new CharSequence[]{description});
        return this;
    }

    public String ticketDescriptionGetAttribute() {
        return this.ticketDescriptionAfterCreate.getAttribute("value");
    }

    public TicketSbubmit ticketPriorityClick() {
        this.ticketPriority.click();
        return this;
    }

    public TicketSbubmit criticalPriorityClick() {
        this.criticalPriority.click();
        return this;
    }

    public TicketSbubmit dueOnDropDownClick() {
        this.dueOnDropDown.click();
        return this;
    }

    public TicketSbubmit dateTwoOClick() {
        this.dateTwoO.click();
        return this;
    }

    public TicketSbubmit emailFieldInput(String email) {
        this.emailField.sendKeys(new CharSequence[]{email});
        return this;
    }

    public String emailFieldGetAttribute() {
        return this.emailField.getAttribute("value");
    }

    public TicketSbubmit submitButtonClick() {
        this.submitButton.click();
        return this;
    }
}