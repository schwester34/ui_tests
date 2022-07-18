package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private SelenideElement
            dostoevskyElement = $("[href=\"/authors/11641/\"]");

    public void checkAuthorCorrect(String author) {
        dostoevskyElement.shouldHave(Condition.text(author));
    }
}
