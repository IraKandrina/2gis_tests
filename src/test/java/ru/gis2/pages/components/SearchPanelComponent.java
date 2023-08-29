package ru.gis2.pages.components;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class SearchPanelComponent {

    private SelenideElement
            searchInputValue = $("form h1"),
            searchInput = $("form input"),
            addressPanel = $("div._1tdquig");

    private ElementsCollection
            bottomMenu = $$("._q5hydt a");

    public SearchPanelComponent chooseCategory(String category) {
        $(byText(category)).click();
        return this;
    }

    public SearchPanelComponent checkCategory(String category) {
        searchInputValue.shouldHave(text(category));
        return this;
    }

    public SearchPanelComponent clickBottomMenuBtn(String buttonValue) {
        bottomMenu.findBy(text(buttonValue)).click();
        return this;
    }

    public SearchPanelComponent checkHeader(String header) {
        $(withText(header)).should(exist);
        return this;
    }

    public SearchPanelComponent searchItem(String value) {
        searchInput.setValue(value).pressEnter();
        return this;
    }

    public SearchPanelComponent checkAddressValue(String addressValue) {
        addressPanel.should(text(addressValue));
        return this;
    }
}
