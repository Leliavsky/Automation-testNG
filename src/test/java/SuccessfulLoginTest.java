
import org.example.bussiness.pages.NavigationBarPage;
import org.example.bussiness.pages.LoginPage;
import org.example.bussiness.pages.ProfilePage;
import org.example.core.BaseTest;
import org.example.core.PageFactoryManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends BaseTest {

    @Test
    public void successfulLogin(){
        LoginPage loginPage = PageFactoryManager.getInstance(driver).getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();
        NavigationBarPage navigationBarPage = PageFactoryManager.getInstance(driver).getNavigationPage();
        navigationBarPage.implicitWait(2);
        navigationBarPage.clickOnPopUpMessage();
        navigationBarPage.implicitWait(2);
        navigationBarPage.clickOnAccountIcon();
        navigationBarPage.clickOnProfileButton();
        ProfilePage profilePage = PageFactoryManager.getInstance(driver).getProfilePage();
        Assert.assertEquals("NameTester",profilePage.getTextFromUserNameField());
        Assert.assertEquals("defaultemail@domain.com",profilePage.getTextFromUserEmailField());
        navigationBarPage.clickOnAccountIcon();
        navigationBarPage.clickOnLogoutButton();
        loginPage.waitForElementToAppear(loginPage.getLoggedOutMessage());
    }
}
