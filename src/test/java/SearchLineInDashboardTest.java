import org.example.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchLineInDashboardTest extends BaseTest {

    @Test
    public void searchLineTest(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        dashboardsPage = pageFactoryManager.getDashBoardsPage();
        dashboardsPage.implicitWait();
        dashboardsPage.enterTextToTheSearchLine("DEMO DASHBOARD");
        sleep(1);
        Assert.assertEquals(dashboardsPage.getResultAfterSearchLine().size(),1);
        Assert.assertEquals(dashboardsPage.getResultAfterSearchLine().get(0).getText(),"DEMO DASHBOARD");
    }
}
