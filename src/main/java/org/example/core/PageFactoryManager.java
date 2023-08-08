package org.example.core;

import org.example.bussiness.pages.NavigationBarPage;
import org.example.bussiness.pages.LoginPage;
import org.example.bussiness.pages.ProfilePage;
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
    public NavigationBarPage getNavigationPage(){return PageFactory.initElements(driver, NavigationBarPage.class);}
    public ProfilePage getProfilePage(){return PageFactory.initElements(driver,ProfilePage.class);}
}
