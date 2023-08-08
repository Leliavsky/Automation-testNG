package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Login']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void enterLogin(String login) {
        loginField.sendKeys(login);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickOnLoginButton(){loginButton.click();}
}
