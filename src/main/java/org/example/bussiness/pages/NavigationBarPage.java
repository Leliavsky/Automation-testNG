package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//div[@class='layout__sidebar-container--gX2bY']")
    private WebElement sideBar;

    @FindBy(xpath ="//div[@class='sidebarButton__sidebar-nav-btn--1prEO']")
    private List<WebElement> mainSideBarButtons;

    @FindBy(xpath = "//span[@class='supportBlock__support-btn--1VYZm']")
    private WebElement helpSupportButton;

    @FindBy(xpath = "//div[@class='supportBlock__modal-header--1KWRk']")
    private WebElement helpSupportWindow;
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

    public boolean sideBarIsDisplayed(){
        return sideBar.isDisplayed();
    }
    public int getMainSideBarButtonsAmount(){
        return mainSideBarButtons.size();
    }

    public List<WebElement> getListOfMainSideBarButtons(){
        return mainSideBarButtons;
    }

    public void clickOnHelpSupportButton(){
        helpSupportButton.click();
    }
    public String getTextHelpSupportWindow(){
        return helpSupportWindow.getText();
    }
}
