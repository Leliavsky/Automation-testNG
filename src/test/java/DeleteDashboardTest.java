import org.example.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteDashboardTest extends BaseTest {

    @Test
    public void deleteDashboard(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        dashboardsPage = pageFactoryManager.getDashBoardsPage();
        dashboardsPage.waitForElementToAppear(dashboardsPage.getElementOfAddNewDashboardButton());
        dashboardsPage.clickOnAddNewDashboardButton();
        dashboardsPage.waitForElementToAppear(dashboardsPage.getNameOfDashboardField());
        String name = dashboardsPage.randomName();
        dashboardsPage.implicitWait();
        dashboardsPage.enterNameOfDashboard(name);
        dashboardsPage.clickOnAddButton();

        sleep(1);
        dashboardsPage.clickOnDashboardTitle();
        dashboardsPage.waitForPageLoadComplete();
        dashboardsPage.enterTextToTheSearchLine(name);

        dashboardsPage.implicitWait();
        dashboardsPage.clickOnTrashIconToDelete();
        dashboardsPage.implicitWait();
        dashboardsPage.clickOnDeleteButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.waitForElementToAppear(navigationBarPage.getSignedInSuccessfullyMessage());
        Assert.assertTrue(navigationBarPage.signedInSuccessfullyMessageIsDisplayed());
    }
}
