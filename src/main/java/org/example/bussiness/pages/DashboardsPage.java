package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardsPage extends BasePage {
    public DashboardsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@title='All Dashboards']")
    private WebElement dashboardTitle;

    public boolean dashboardTitleIsDisplayed() {
        return dashboardTitle.isDisplayed();
    }
}
