package org.example.core;

import org.example.bussiness.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    protected WebDriver driver;
    protected PageFactoryManager pageFactoryManager;
    protected LoginPage loginPage;
    protected NavigationBarPage navigationBarPage;
    protected ProfilePage profilePage;
    protected HelpSupportPage helpSupportPage;
    protected DashboardsPage dashboardsPage;
    protected LaunchesPage launchesPage;
    protected FiltersPage filtersPage;
    protected DebugPage debugPage;
    protected ProjectMembersPage projectMembersPage;
    protected ProjectSettingsPage projectSettingsPage;


    @BeforeMethod
    public void setUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        pageFactoryManager = new PageFactoryManager(driver);

        openHomePage();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

    public void openHomePage() {
        driver.get("http://localhost:8080/");
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException ignored) {}
    }
}

