package ru.gis2.pages.components;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class RightMenuComponent {
    public static final String CART = "Корзина";

    public RightMenuComponent checkCartMenuItem() {
        $(withText(CART)).should(exist);
        return this;
    }

    public RightMenuComponent clickCartMenuItem() {
        $(withText(CART)).click();
        return this;
    }
}
