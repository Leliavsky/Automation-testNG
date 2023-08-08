package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarPage extends BasePage {
    public NavigationBarPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//img[@class='userBlock__avatar--Lhnmc']")
    private WebElement accountIcon;

    @FindBy(xpath = "//div[@class='userBlock__menu--2Y0xl']/a[@href='#user-profile']")
    private WebElement profileButton;

    @FindBy(xpath = "//div[@class='userBlock__menu--2Y0xl']/div[@class='userBlock__menu-item--3VBsZ']")
    private WebElement logoutButton;

    @FindBy(xpath = "//div[@class='notificationItem__message-container--16jY2 notificationItem__success--Xv97a']")
    private WebElement signedInSuccessfullyMessage;

    public void clickOnAccountIcon(){
        accountIcon.click();
    }

    public void clickOnProfileButton(){
        profileButton.click();
    }

    public void clickOnPopUpMessage(){
        signedInSuccessfullyMessage.click();
    }

    public void clickOnLogoutButton(){
        logoutButton.click();
    }

}
