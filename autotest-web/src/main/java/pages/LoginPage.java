package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Login")
public class LoginPage extends WebPage {

    @Name("поле юзера")
    private SelenideElement username = $x("//input[@id='username']");

    @Name("поле пароля")
    private SelenideElement pass = $x("//input[@id='password']");

    @Name("кнопка логина")
    private SelenideElement logButton = $x("//input[@value='Login']");
}
