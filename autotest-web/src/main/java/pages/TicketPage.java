package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Ticket 3")
public class TicketPage extends WebPage {

    @Name("Attach Files")
    private SelenideElement attachFile = $x("//button[@id='ShowFileUpload']");

    @Name("Add File")
    private SelenideElement addAnotherFile = $x("//label[@class='btn btn-primary btn-sm btn-file']");

    @Name("Update Ticket")
    private SelenideElement updateTicket = $x("//button[@class='btn btn-primary float-right']");

}
