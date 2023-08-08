package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@class='userInfo__name--1aIPl']")
    private WebElement userNameField;

    @FindBy(xpath = "//span[@class='userInfo__email--2Tj4Z']")
    private WebElement userEmailField;

    public String getTextFromUserNameField(){
        return userNameField.getText();
    }

    public String getTextFromUserEmailField(){
        return userEmailField.getText();
    }
}
