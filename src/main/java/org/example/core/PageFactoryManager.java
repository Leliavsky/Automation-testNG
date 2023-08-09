package org.example.core;

import org.example.bussiness.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryManager {
    private WebDriver driver;
    private static PageFactoryManager instance;

    private PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public static PageFactoryManager getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new PageFactoryManager(driver);
        }
        return instance;
    }
    public LoginPage getLoginPage() {
        return PageFactory.initElements(driver, LoginPage.class);
    }
    public NavigationBarPage getNavigationPage() {
        return PageFactory.initElements(driver, NavigationBarPage.class);
    }
    public ProfilePage getProfilePage() {
        return PageFactory.initElements(driver,ProfilePage.class);
    }
    public ProjectMembersPage getProjectMembersPage() {
        return PageFactory.initElements(driver,ProjectMembersPage.class);
    }
    public ProjectSettingsPage getProjectSettingsPage() {
        return PageFactory.initElements(driver,ProjectSettingsPage.class);
    }
    public LaunchesPage getLaunchesPage() {
        return PageFactory.initElements(driver,LaunchesPage.class);
    }
    public FiltersPage getFiltersPage() {
        return PageFactory.initElements(driver, FiltersPage.class);
    }
    public DebugPage getDebugPage() {
        return PageFactory.initElements(driver, DebugPage.class);
    }
    public DashboardsPage getDashBoardsPage() {
        return PageFactory.initElements(driver, DashboardsPage.class);
    }
}
