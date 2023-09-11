package ru.gis2.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import ru.gis2.pages.MainPage;
import ru.gis2.pages.OrganizationPage;
import ru.gis2.pages.components.RightMenuComponent;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.MINOR;

@Owner("IraKandrina")
@Epic(value = "2Gis UI tests")
@Feature(value = "St.Petersburg Website")
@Story("Организация")
public class OrganizationTests extends TestBase {
    MainPage mainPage = new MainPage();
    RightMenuComponent rightMenu = new RightMenuComponent();
    OrganizationPage organizationPage = new OrganizationPage();

    @Severity(MINOR)
    @Test
    @DisplayName("Проверка отображения окна добавления организации")
    public void verifyCartVisibilityTest() {
        step("Открыть главную страницу сайта", () -> {
            mainPage.openPage();
        });
        step("Нажать кнопку Меню в правом верхнем углу главной страницы", () -> {
            mainPage.openRightMenu();
        });
        step("Проверить отображение пункта меню", () -> {
            rightMenu.checkOrganizationMenuItem();
        });
        step("Нажать пункт меню Добавить организацию", () -> {
            rightMenu.clickOrganizationMenuItem();
        });
        step("Проверить отображение окна Новая организация", () -> {
            organizationPage.checkPageTitle();
        });
    }
}
