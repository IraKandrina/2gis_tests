package ru.gis2.pages.components;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class CartComponent {
    public static final String EMPTY_CART = "Корзина пуста";
    public CartComponent checkEmptyCart() {
        $(withText(EMPTY_CART)).should(exist);
        return this;
    }

}
