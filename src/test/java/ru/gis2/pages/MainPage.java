package ru.gis2.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public static final String CITY_TITLE = "Санкт-Петербург";

    private SelenideElement
            rightMenu = $("button[aria-label='Меню']");

    public MainPage openPage() {
        open(baseUrl);
        return this;
    }

    public MainPage checkCityTitle() {
        $(withText(CITY_TITLE)).should(exist);
        return this;
    }

    public MainPage openRightMenu() {
        rightMenu.click();
        return this;
    }
}
