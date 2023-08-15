package org.example.bussiness.pages;

import net.bytebuddy.asm.Advice;
import org.example.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardsPage extends BasePage {
    public DashboardsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class='pageBreadcrumbs__page-breadcrumbs-item--1GzrN']")
    private WebElement dashboardTitle;

    @FindBy(xpath = "//span[@class='ghostButton__text--eUa9T']")
    private WebElement addNewDashboardButton;

    @FindBy(xpath = "//div[@class='fieldErrorHint__field-error-hint--1LHfk fieldErrorHint__type-bottom--2DLal']/input")
    private WebElement nameOfDashboardField;

    @FindBy(xpath = "//button[@class='bigButton__big-button--ivY7j bigButton__color-booger--2IfQT']")
    private WebElement addButton;

    @FindBy(xpath = "//li[@class='pageBreadcrumbs__page-breadcrumbs-item--1GzrN']/span")
    private WebElement newDashboardTitleName;

    @FindBy(xpath = "//input[@class='inputSearch__input--3e4db type-text']")
    private WebElement searchLineText;

    @FindBy(xpath = "//a[@class='gridCell__grid-cell--3e2mS gridCell__align-left--2beIG dashboardTable__name--1sWJs']")
    private List<WebElement> resultAfterSearchLine;

    @FindBy(xpath = "//i[@class='icon__icon--2m6Od icon__icon-delete--1jIHF']")
    private WebElement trashIconElement;

    @FindBy(xpath = "//i[@class='icon__icon--2m6Od icon__icon-pencil--2-R6b']")
    private WebElement editIconElement;

    @FindBy(xpath = "//button[@class='bigButton__big-button--ivY7j bigButton__color-tomato--Wvy5L']")
    private WebElement deleteButton;

    public void clickOnAddNewDashboardButton() {
        addNewDashboardButton.click();
    }

    public WebElement getElementOfAddNewDashboardButton() {
        return addNewDashboardButton;
    }

    public WebElement getNameOfDashboardField() {
        return nameOfDashboardField;
    }

    public void enterNameOfDashboard(String name) {
        nameOfDashboardField.clear();
        nameOfDashboardField.sendKeys(name);
    }

    public void clickOnAddButton() {
        addButton.click();
    }

    public String getTextFromNewDashboardTitle() {
        return newDashboardTitleName.getText();
    }

    public boolean dashboardTitleIsDisplayed() {
        return dashboardTitle.isDisplayed();
    }
    public void clickOnDashboardTitle(){
        dashboardTitle.click();
    }

    public void enterTextToTheSearchLine(String text) {
        searchLineText.clear();
        searchLineText.sendKeys(text);
    }
    public List<WebElement> getResultAfterSearchLine(){
        return resultAfterSearchLine;
    }

    public void clickOnTrashIconToDelete(){
        trashIconElement.click();
    }

    public void clickOnDeleteButton(){
        deleteButton.click();
    }

    public void clickOnEditIcon(){
        editIconElement.click();
    }
}
