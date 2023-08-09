package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectMembersPage extends BasePage {
    public ProjectMembersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@title='[object Object]']")
    private WebElement projectMembersTitle;

    public boolean projectMembersTitleIsDisplayed(){
       return projectMembersTitle.isDisplayed();
    }
}
