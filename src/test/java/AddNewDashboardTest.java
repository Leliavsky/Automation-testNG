import org.example.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class AddNewDashboardTest extends BaseTest {

    @Test(description  = "Add New Dashboard")
    public void verifyAddNewDashboard(){
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
        dashboardsPage.waitForPageLoadComplete();
        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.waitForElementToAppear(navigationBarPage.getSignedInSuccessfullyMessage());
        Assert.assertTrue(navigationBarPage.signedInSuccessfullyMessageIsDisplayed());
        dashboardsPage.waitForPageLoadComplete();
        Assert.assertTrue(dashboardsPage.getTextFromNewDashboardTitle().equalsIgnoreCase(name));
    }
}
