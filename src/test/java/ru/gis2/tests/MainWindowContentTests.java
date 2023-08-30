package ru.gis2.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.gis2.pages.MainPage;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;

@Owner("IraKandrina")
@Epic(value = "2Gis UI tests")
@Feature(value = "St.Petersburg Website")
@Story("Главная страница")
@Tag("ui")
public class MainWindowContentTests extends TestBase {
    MainPage mainPage = new MainPage();
    @Severity(CRITICAL)
    @Test
    @DisplayName("Проверка названия города")
    void verifyCityHeadingTest() {
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Проверить отображение названия города на главной странице", () -> {
            mainPage.checkCityTitle();
        });
    }
}
