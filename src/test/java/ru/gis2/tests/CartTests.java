package ru.gis2.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.gis2.pages.MainPage;
import ru.gis2.pages.components.CartComponent;
import ru.gis2.pages.components.RightMenuComponent;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.MINOR;

@Owner("IraKandrina")
@Epic(value = "2Gis UI tests")
@Feature(value = "St.Petersburg Website")
@Story("Корзина")
@Tag("ui")
public class CartTests extends TestBase {
    MainPage mainPage = new MainPage();
    RightMenuComponent rightMenu = new RightMenuComponent();
    CartComponent cart = new CartComponent();

    @Severity(MINOR)
    @Test
    @DisplayName("Проверка отображения корзины")
    public void verifyCartVisibilityTest() {
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Нажать кнопку Меню в правом верхнем углу главной страницы", () -> {
            mainPage.openRightMenu();
        });
        step("Проверить отображение пункта меню", () -> {
            rightMenu.checkCartMenuItem();
        });
        step("Нажать пункт меню Корзина", () -> {
            rightMenu.clickCartMenuItem();
        });
        step("Проверить отображение окна Корзина", () -> {
            cart.checkEmptyCart();
        });
    }
}
