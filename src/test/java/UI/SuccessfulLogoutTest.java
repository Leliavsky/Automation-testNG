package UI;

import org.example.core.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLogoutTest extends BaseTest {

    @Test
    public void successfulLogout(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.implicitWait();
        navigationBarPage.clickOnPopUpMessage();
        navigationBarPage.implicitWait();
        navigationBarPage.clickOnAccountIcon();
        navigationBarPage.clickOnLogoutButton();
        loginPage.waitForElementToAppear(loginPage.getLoggedOutMessage());
        Assert.assertTrue(loginPage.loggedOutMessageIsDisplayed());
    }
}
