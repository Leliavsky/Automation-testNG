package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Login']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='notificationItem__message-container--16jY2 info']")
    private WebElement loggedOutMessage;

    public void enterLogin(String login) {
        loginField.sendKeys(login);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickOnLoginButton(){loginButton.click();}
    public WebElement getLoggedOutMessage(){
        return loggedOutMessage;
    }
    public boolean loggedOutMessageIsDisplayed(){
        return loggedOutMessage.isDisplayed();
    }
}
