package org.example.core;

import org.example.bussiness.pages.HomePage;
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
    public HomePage getHomePage() {
        return PageFactory.initElements(driver, HomePage.class);
    }
}
