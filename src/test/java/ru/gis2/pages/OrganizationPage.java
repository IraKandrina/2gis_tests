package ru.gis2.pages;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class OrganizationPage {
    public static final String NEW_ORGANIZATION = "Новая организация";

    public OrganizationPage checkPageTitle() {
        $(withText(NEW_ORGANIZATION)).should(exist);
        return this;
    }
}
