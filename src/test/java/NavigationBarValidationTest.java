import org.example.bussiness.pages.*;
import org.example.core.BaseTest;
import org.example.core.PageFactoryManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBarValidationTest extends BaseTest {

    @Test
    public void navigationBarValidation(){
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterLogin("default");
        loginPage.enterPassword("1q2w3e");
        loginPage.clickOnLoginButton();

        navigationBarPage = pageFactoryManager.getNavigationPage();
        navigationBarPage.implicitWait();
        Assert.assertTrue(navigationBarPage.sideBarIsDisplayed());
        Assert.assertEquals(navigationBarPage.getMainSideBarButtonsAmount(),6);

//        navigationBarPage.clickOnHelpSupportButton();
//        helpSupportPage = pageFactoryManager.getHelpSupportPage();
//        helpSupportPage.implicitWait();
//        Assert.assertEquals(helpSupportPage.getTextHelpSupportWindow(),"Help & Support");

        navigationBarPage.getListOfMainSideBarButtons().get(0).click();//Dashboard
        dashboardsPage = pageFactoryManager.getDashBoardsPage();
        Assert.assertTrue(dashboardsPage.dashboardTitleIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(1).click();//Launches
        launchesPage = pageFactoryManager.getLaunchesPage();
        Assert.assertTrue(launchesPage.launchFilterToolbarIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(2).click();//Filters
        filtersPage = pageFactoryManager.getFiltersPage();
        Assert.assertTrue(filtersPage.filtersTitleIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(3).click();//Debug
        debugPage = pageFactoryManager.getDebugPage();
        Assert.assertTrue(debugPage.filterPanelIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(4).click();//Project Members
        projectMembersPage = pageFactoryManager.getProjectMembersPage();
        Assert.assertTrue(projectMembersPage.projectMembersTitleIsDisplayed());

        navigationBarPage.getListOfMainSideBarButtons().get(5).click();//ProjectSettings
        projectSettingsPage = pageFactoryManager.getProjectSettingsPage();
        Assert.assertTrue(projectSettingsPage.settingsTitleIsDisplayed());
    }
}
