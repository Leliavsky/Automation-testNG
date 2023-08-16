package UI;

import org.example.core.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class ProfilePersonalInformationTest extends BaseTest {

    @Test
    public void verifyPersonalInformation(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.implicitWait();
        navigationBarPage.clickOnPopUpMessage();
        navigationBarPage.implicitWait();
        navigationBarPage.clickOnAccountIcon();
        navigationBarPage.clickOnProfileButton();

        profilePage = pageFactoryManager.getProfilePage();
        Assert.assertEquals("NameTester",profilePage.getTextFromUserNameField());
        Assert.assertEquals("defaultemail@domain.com",profilePage.getTextFromUserEmailField());
    }

    @Test
    public void verifyUploadDeletedPhoto(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.implicitWait();
        navigationBarPage.clickOnPopUpMessage();
        navigationBarPage.implicitWait();
        navigationBarPage.clickOnAccountIcon();
        navigationBarPage.clickOnProfileButton();

        profilePage = pageFactoryManager.getProfilePage();
        profilePage.clickOnRemoveButton();
        profilePage.implicitWait();
        profilePage.clickOnDeleteButton();
        navigationBarPage.implicitWait();
        profilePage.waitForElementToAppear(navigationBarPage.getSignedInSuccessfullyMessage());
        Assert.assertTrue(navigationBarPage.signedInSuccessfullyMessageIsDisplayed());

        String filePath = "src/main/resources/avatar.jpg";
        String absoluteFilePath = Paths.get(filePath).toAbsolutePath().toString();
        profilePage.uploadPhoto(absoluteFilePath);
        profilePage.saveUploadFile();
        profilePage.waitForElementToAppear(navigationBarPage.getSignedInSuccessfullyMessage());
        Assert.assertTrue(navigationBarPage.signedInSuccessfullyMessageIsDisplayed());
    }
}
