package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Helpdesk")
public class MainPage extends WebPage {

    @Name("Log in")
    private SelenideElement logPage = $x("//a[@role='button']");

}

