package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HelpPage {
    private SelenideElement
            inputSearchHelp = $("input[name='helptxt']"),
            buttonSearchHelp = $("input[value='Найти']");
    private ElementsCollection helpCards = $$(".helpcard-head");


    public void checkDiscounts() {
        inputSearchHelp.setValue("Скидка на День рождения").pressEnter();
    }

    public void clickButtonSearch() {
        buttonSearchHelp.click();
    }

    public void helpSearchWorks() {
        helpCards.first().shouldHave(Condition.text("на День рождения"));
    }
}
