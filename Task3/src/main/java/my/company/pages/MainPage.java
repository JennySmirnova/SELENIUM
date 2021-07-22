package my.company.pages;

import my.company.steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy (xpath = "//ul[contains(@class,'kitt-top')]")
    WebElement mainMenu;

    @FindBy (xpath = "//div[contains(@class,'kitt-top-menu__dropdown kitt-top-menu__dropdown_icons')]/div[1]") //(xpath = "//*[@id='submenu-5']")
    WebElement subMenu;

    public MainPage () {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }
    public void selectMainMenu (String menuItem) {
        mainMenu.findElement(By.xpath(".//a[contains(text(),'"+menuItem+"')]")).click();

    }
    public void selectSubMenu (String menuItem) {
        subMenu.findElement(By.xpath("//a[contains(text(),'"+menuItem+"')]")).click();

    }
}
