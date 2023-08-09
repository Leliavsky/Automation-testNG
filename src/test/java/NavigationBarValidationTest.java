import org.example.bussiness.pages.*;
import org.example.core.BaseTest;
import org.example.core.PageFactoryManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBarValidationTest extends BaseTest {

    @Test
    public void navigationBarValidation(){
        LoginPage loginPage = PageFactoryManager.getInstance(driver).getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        NavigationBarPage navigationBarPage = PageFactoryManager.getInstance(driver).getNavigationPage();
        navigationBarPage.implicitWait();
        Assert.assertTrue(navigationBarPage.sideBarIsDisplayed());
        Assert.assertEquals(navigationBarPage.getMainSideBarButtonsAmount(),6);

        navigationBarPage.clickOnHelpSupportButton();
        navigationBarPage.implicitWait();
        Assert.assertEquals(navigationBarPage.getTextHelpSupportWindow(),"Help & Support");

        navigationBarPage.getListOfMainSideBarButtons().get(0).click();//Dashboard
        DashboardsPage dashboardsPage = PageFactoryManager.getInstance(driver).getDashBoardsPage();
        Assert.assertTrue(dashboardsPage.dashboardTitleIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(1).click();//Launches
        LaunchesPage launchesPage = PageFactoryManager.getInstance(driver).getLaunchesPage();
        Assert.assertTrue(launchesPage.launchFilterToolbarIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(2).click();//Filters
        FiltersPage filtersPage = PageFactoryManager.getInstance(driver).getFiltersPage();
        Assert.assertTrue(filtersPage.filtersTitleIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(3).click();//Debug
        DebugPage debugPage = PageFactoryManager.getInstance(driver).getDebugPage();
        Assert.assertTrue(debugPage.filterPanelIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(4).click();//Project Members
        ProjectMembersPage projectMembersPage = PageFactoryManager.getInstance(driver).getProjectMembersPage();
        Assert.assertTrue(projectMembersPage.projectMembersTitleIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(5).click();//ProjectSettings
        ProjectSettingsPage projectSettingsPage = PageFactoryManager.getInstance(driver).getProjectSettingsPage();
        Assert.assertTrue(projectSettingsPage.settingsTitleIsDisplayed());
    }
}
