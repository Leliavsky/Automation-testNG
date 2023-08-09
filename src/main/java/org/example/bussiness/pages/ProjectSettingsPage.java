package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectSettingsPage extends BasePage {
    public ProjectSettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class='pageBreadcrumbs__page-breadcrumbs-item--1GzrN']")
    private WebElement settingsTitle;

    public boolean settingsTitleIsDisplayed(){
        return settingsTitle.isDisplayed();
    }
}
