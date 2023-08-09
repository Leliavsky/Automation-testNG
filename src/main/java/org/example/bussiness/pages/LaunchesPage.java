package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaunchesPage extends BasePage {
    public LaunchesPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='launchFiltersToolbar__filter-tickets-row--3uqzh']")
    private WebElement launchFiltersToolbar;

    public boolean launchFilterToolbarIsDisplayed(){
        return launchFiltersToolbar.isDisplayed();
    }
}
