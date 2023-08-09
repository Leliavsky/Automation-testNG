package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DebugPage extends BasePage {

    public DebugPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='refineFiltersPanel__refine-filters-panel--3sh_R']")
    private WebElement filterPanel;

    public boolean filterPanelIsDisplayed(){
       return filterPanel.isDisplayed();
    }
}
