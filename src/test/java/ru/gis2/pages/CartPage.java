package ru.gis2.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public static final String EMPTY_CART = "Корзина пуста";
    public CartPage checkEmptyCart() {
        $(withText(EMPTY_CART)).should(exist);
        return this;
    }

}
