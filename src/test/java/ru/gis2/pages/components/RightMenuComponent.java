package ru.gis2.pages.components;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class RightMenuComponent {
    public RightMenuComponent checkMenuItem(String item) {
        $(withText(item)).should(exist);
        return this;
    }

    public RightMenuComponent clickMenuItem(String item) {
        $(withText(item)).click();
        return this;
    }
}
