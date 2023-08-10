package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpSupportPage extends BasePage {
    public HelpSupportPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='supportBlock__modal-header--1KWRk']")
    private WebElement helpSupportWindow;

    public String getTextHelpSupportWindow(){
        return helpSupportWindow.getText();
    }
}
