package org.example.bussiness.pages;

import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPage extends BasePage {
    public FiltersPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@title='Filters']")
    private WebElement filtersTitle;

    public boolean filtersTitleIsDisplayed(){
        return filtersTitle.isDisplayed();
    }
}
