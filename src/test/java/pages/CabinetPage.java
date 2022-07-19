package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CabinetPage {

    private SelenideElement socBlock = $(".new-auth__show-soc");

    public void checkSocAuthBlock() {
        socBlock.shouldHave(Condition.text("Другие способы входа"));
    }
}
