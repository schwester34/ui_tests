package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TextbooksPage {

    private SelenideElement headerTextbooks = $(".school-cap__header");

    public void checkHeaderTextbooks() {
        headerTextbooks.shouldHave(Condition.text("Все учебники в Лабиринте"));
    }
}
