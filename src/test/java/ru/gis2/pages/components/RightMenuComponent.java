package ru.gis2.pages.components;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class RightMenuComponent {
    public static final String CART = "Корзина";
    public static final String ORGANIZATION = "Добавить организацию";

    public RightMenuComponent checkCartMenuItem() {
        $(withText(CART)).should(exist);
        return this;
    }

    public RightMenuComponent clickCartMenuItem() {
        $(withText(CART)).click();
        return this;
    }

    public RightMenuComponent checkOrganizationMenuItem() {
        $(withText(ORGANIZATION)).should(exist);
        return this;
    }

    public RightMenuComponent clickOrganizationMenuItem() {
        $(withText(ORGANIZATION)).click();
        return this;
    }

}
