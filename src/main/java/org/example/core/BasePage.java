package org.example.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT) ,Duration.ofMillis(POLLING));
    }

    public void waitForElementToAppear(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void implicitWait(long timeToWait) {
        driver.manage().timeouts().implicitlyWait(timeToWait,
                TimeUnit.SECONDS);
    }
    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(TIMEOUT,
                TimeUnit.SECONDS);
    }

    public void waitForPageLoadComplete() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript(
                "return document.readyState").equals("complete"));
    }

    public void waitForElementToDisappear(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }
    public void moveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public String randomName(){
        return "Name" + UUID.randomUUID().toString().replaceAll("-", "").substring(0, 5);
    }
}
