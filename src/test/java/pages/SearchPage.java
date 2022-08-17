package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public SelenideElement
            searchTopTitle = $(".index-top-title"),
            bookName = $("[data-name='Преступление и наказание']"),
            bookBuy = $(".btn-primary.btn-buy"),
            basket = $(".btn.btn-small.btn-more.tobasket ");


    public void resultofSearch(String book) {
        searchTopTitle.shouldHave(Condition.text("Все, что мы нашли в Лабиринте\n" +
                "   по запросу «" + book + "»"));
    }

    public void addBooktoBasket() {
        bookName.click();
        bookBuy.click();
        basket.click();
    }
}
