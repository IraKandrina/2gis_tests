package ru.gis2.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.gis2.pages.MainPage;
import ru.gis2.pages.components.SearchPanelComponent;

import java.util.stream.Stream;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.*;

@Owner("IraKandrina")
@Epic(value = "2Gis UI tests")
@Feature(value = "St.Petersburg Website")
@Story("Панель поиска")
@Tag("ui")
public class SearchPanelTests extends TestBase {
    MainPage mainPage = new MainPage();
    SearchPanelComponent searchPanel = new SearchPanelComponent();
    @Severity(CRITICAL)
    @ValueSource(strings = {"Поесть", "Аптеки", "Красота"})
    @DisplayName("Отображение значения в строке поиска при выборе кнопки ")
    @ParameterizedTest(name = "{0}")
    void verifyValuesInSearchInputTest(String value) {
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Нажать кнопку на левой панели", () -> {
            searchPanel.chooseCategory(value);
        });
        step("Проверить отображение в строке поиска выбранной категории", () -> {
            searchPanel.checkCategory(value);
        });
    }

    @CsvSource({
            "Недвижимость, Продажа недвижимости",
            "Интересное, Интересное в городе"
    })

    @Severity(NORMAL)
    @DisplayName("Отображение подзаголовка при выборе кнопки ")
    @ParameterizedTest (name = "{1} - {0}")
    void pageSubHeaderValues(String buttonValue, String header) {
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Нажать кнопку на левой панели", () -> {
            searchPanel.clickBottomMenuBtn(buttonValue);
        });
        step("Проверить отображение заголовка", () -> {
            searchPanel.checkHeader(header);
        });
    }

    static Stream<Arguments> addressValuesTest () {
        return Stream.of(
                Arguments.of("Царство матрасов", "ТК Торговый двор, проспект Науки, 21 к1, Санкт-Петербург"),
                Arguments.of("Сиртаки", "Невский проспект, 102, Санкт-Петербург"),
                Arguments.of("Новая Голландия", "Набережная Адмиралтейского канала, 2, Санкт-Петербург")
        );
    }

    @Severity(NORMAL)
    @MethodSource
    @DisplayName("Отображение адреса при вводе значения ")
    @ParameterizedTest(name="{0} - {1}")
    void addressValuesTest(String item, String addressValue){
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Ввести запрос в строке поиска", () -> {
            searchPanel.searchItem(item);
        });
        step("Проверить отображение адреса заданного объекта", () -> {
            searchPanel.checkAddressValue(addressValue);
        });
    }
}
