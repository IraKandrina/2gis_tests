package ru.gis2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("2Gis")
public class MainWindowTests extends RemoteTestBase {
    @Test
    @DisplayName("Проверка названия города")
    public void verifyCityHeadingTest() {
        step("Открыть главную страницу сайта", () -> {
            open(baseUrl);
        });
        step("Проверить отображение названия города на главной странице", () -> {
            $(withText("Санкт-Петербург")).should(exist);
        });
    }

    @ValueSource(strings = {"Поесть", "Аптеки", "Красота"})
    @DisplayName("Отображение значения в строке поиска при выборе кнопки")
    @ParameterizedTest(name = "{0}")
    void verifyValuesInSearchInputTest(String value) {
        step("Открыть главную страницу сайта", () -> {
            open(baseUrl);
        });
        step("Нажать кнопку на левой панели", () -> {
            $(byTitle(value)).click();
        });
        step("Проверить отображение в строке поиска выбранной категории", () -> {
            $("form h1").shouldHave(text(value));
        });
    }

    static Stream<Arguments> addressValuesTest () {
        return Stream.of(
                Arguments.of("Царство матрасов", "ТК Торговый двор, проспект Науки, 21 к1, Санкт-Петербург"),
                Arguments.of("Сиртаки", "Невский проспект, 102, Санкт-Петербург"),
                Arguments.of("Новая Голландия", "Набережная Адмиралтейского канала, 2, Санкт-Петербург")
        );
    }

    @MethodSource
    @DisplayName("Отображение адреса при вводе значения ")
    @ParameterizedTest(name="{0} - {1}")
    void addressValuesTest(String item, String addressValue){
        step("Открыть главную страницу сайта", () -> {
            open(baseUrl);
        });
        step("Ввести запрос в строке поиска", () -> {
            $("form input").setValue(item).pressEnter();
        });
        step("Проверить отображение адреса заданного объекта", () -> {
            $("div._1tdquig").should(text(addressValue));
        });

    }
}
