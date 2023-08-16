package UI;

import org.example.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditDashboardTest extends BaseTest {

    @Test
    public void editDashboard(){
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
        dashboardsPage.clickOnEditIcon();
        name += " added text";
        dashboardsPage.implicitWait();
        dashboardsPage.enterNameOfDashboard(name);
        dashboardsPage.implicitWait();
        dashboardsPage.clickOnAddButton();
        dashboardsPage.implicitWait();
        dashboardsPage.enterTextToTheSearchLine(name);
        sleep(1);
        Assert.assertEquals(dashboardsPage.getResultAfterSearchLine().size(),1);
        Assert.assertEquals(dashboardsPage.getResultAfterSearchLine().get(0).getText(), name);
    }
}
