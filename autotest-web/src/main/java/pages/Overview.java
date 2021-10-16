package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Overview")
public class Overview extends WebPage {

    @Name("Ticket 3")
    private SelenideElement ticketThree = $x("//a[@href='/tickets/3/']");

    @Name("поле поиска")
    private SelenideElement searchField = $x("//input[@id='search_query']");

    @Name("кнопка поиска")
    private SelenideElement searchButton = $x("//button[@class='btn btn-primary']");

    @Name("Sorting")
    private SelenideElement sortButton = $x("//select[@id='id_sortx']");

    @Name("Priority")
    private SelenideElement priority = $x("//option[@value='priority']");

    @Name("Add Filter")
    private SelenideElement addFilter = $x("//select[@id='filterBuilderSelect']");

    @Name("Data Range")
    private SelenideElement dataRange = $x("//option[@id='filterBuilderSelect-Dates']");

    @Name("поле от")
    private SelenideElement fieldBefore = $x("//input[@name='date_from']");

    @Name("поле до")
    private SelenideElement fieldAfter = $x("//input[@name='date_to']");

    @Name("Save Query")
    private SelenideElement saveQuery = $x("//button[@data-target='#collapseTwo']");

}
