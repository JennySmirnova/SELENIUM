package ru.yandex.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.autotest.steps.BaseSteps;

public class MainPages {
    @FindBy(xpath = "//div[@class='services-new__content']")
    WebElement market;



    public MainPages () {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }
    public void selectMenu (String menuItem) {
        market.findElement(By.xpath(".//div[contains(text(),'"+menuItem+"')]")).click();


    }
}
