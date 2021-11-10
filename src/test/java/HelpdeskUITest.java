import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.TicketSbubmit;
import pages.TicketsPage;

import java.io.IOException;

public class HelpdeskUITest extends BaseTest {
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String title = faker.company().name();
    String description = faker.twinPeaks().quote();

    @Test
    public void createTicketTest() throws IOException {
        new MainPage(driver)
                .clickNewTicket();
        new TicketSbubmit(driver)
                .queueDropDownClick()
                .djangoSelectClick()
                .titleFieldInput(title)
                .ticketDescriptionInput(description)
                .ticketPriorityClick()
                .criticalPriorityClick()
                .dueOnDropDownClick()
                .dateTwoOClick()
                .emailFieldInput(email)
                .submitButtonClick();
        String url = driver.getCurrentUrl();
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("user.properties"));
        new LoginPage(driver)
                .login(System.getProperty("user"), System.getProperty("password"));
        driver.get(url);
        new TicketsPage(driver)
                .editButtonClick();
        TicketSbubmit page = new TicketSbubmit(driver);

        Assert.assertEquals(title, page.titleFieldGetAttribute());
        Assert.assertEquals(description, page.ticketDescriptionGetAttribute());
        Assert.assertEquals(email, page.emailFieldGetAttribute());


    }


}
