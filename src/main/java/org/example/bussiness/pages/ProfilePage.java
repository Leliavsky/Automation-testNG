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

    @FindBy(xpath = "//button[@class='photoControls__remove--1BzMJ']")
    private WebElement removePhotoButton;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement uploadPhoto;

    @FindBy(xpath = "//div[@class='photoControls__photo-btn--2WI16']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@class='bigButton__big-button--ivY7j bigButton__color-tomato--Wvy5L']")
    private WebElement deleteButton;

    public String getTextFromUserNameField(){
        return userNameField.getText();
    }

    public String getTextFromUserEmailField(){
        return userEmailField.getText();
    }
    public void clickOnRemoveButton(){ removePhotoButton.click();}
    public void clickOnDeleteButton(){ deleteButton.click();}
    public void uploadPhoto(String file){
        uploadPhoto.sendKeys(file);

    }
    public void saveUploadFile(){
        saveButton.click();
    }
}
