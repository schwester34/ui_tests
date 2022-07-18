package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;


public class Tests extends TestBase {

    @Test
    @Description("Searching a book")
    @DisplayName("Check that search works")
    void searchBook() {
        step("Search book", () -> {
            mainPage.searchBook(RANDOM_BOOK);
        });
        step("Check that book is found", () -> {
            searchPage.resultofSearch(RANDOM_BOOK);
        });
    }

    @Test
    @Description("Adding book to basket")
    @DisplayName("Check basket")
    void generatedTest() {
        step("Search crime and punishment book", () -> {
            mainPage.searchBook(CRIME_AND_PUNISHMENT_TITLE);
        });
        step("Adding book to basket", () -> {
            searchPage.addBooktoBasket();
        });
        step("Check that author is correct", () -> {
            basketPage.checkAuthorCorrect(CRIME_AND_PUNISHMENT_AUTHOR);
        });
    }

    @Test
    @Description("Opening school")
    @DisplayName("Check school")
    void checkSchool() {
        step("Go to textbooks", () -> {
            mainPage.goToTextbooks();
        });
        step("Check that textbooks is opened", () -> {
            textbooksPage.checkHeaderTextbooks();
        });
    }

    @Test
    @Description("Opening cabinet")
    @DisplayName("Check cabinet")
    void checkCabinet() {
        step("Go to cabinet", () -> {
            mainPage.goToCabinet();
        });
        step("Check that cabinet is opened", () -> {
            cabinetPage.checkSocAuthBlock();
        });
    }

    @Test
    @Description("Check title")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Page title should have text 'Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры'", () -> {
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(EXPECTED_TITLE);
        });
    }


    @Test
    @Description("Check searching")
    @DisplayName("Check help search works correct")
    void checkSearchHelp() {
        step("Go to help", () -> {
            mainPage.goToHelp();
        });
        step("Search discounts", () -> {
            helpPage.checkDiscounts();
        });
        step("Press search button", () -> {
            helpPage.clickButtonSearch();
        });
        step("Check help search works for birthday discounts", () -> {
            helpPage.helpSearchWorks();
        });
    }
}
