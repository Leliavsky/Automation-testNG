

import org.example.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends BaseTest {

    @Test
    public void successfulLogin(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.implicitWait();
        Assert.assertTrue(navigationBarPage.signedInSuccessfullyMessageIsDisplayed());
    }
}
