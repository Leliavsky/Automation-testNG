import org.example.bussiness.pages.HomePage;
import org.example.core.BaseTest;
import org.example.core.PageFactoryManager;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends BaseTest {

    @Test
    public void successfulLogin(){
        HomePage homePage = PageFactoryManager.getInstance(driver).getHomePage();
        homePage.enterLogin("default");
        homePage.enterPassword("1q2w3e");
        homePage.clickOnLoginButton();
        sleep(3);
    }
}
