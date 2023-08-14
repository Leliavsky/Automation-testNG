
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
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.implicitWait();
        Assert.assertTrue(navigationBarPage.signedInSuccessfullyMessageIsDisplayed());
    }
}
