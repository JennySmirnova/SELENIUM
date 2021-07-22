package ru.aplana.autotest.pages;

import ru.aplana.autotest.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PressButtonPages extends BasePages {
    @FindBy(xpath = "//a[contains(@data-test-id,'PageTeaserDict_button')]")
    public WebElement buttonOfOn;

    @FindBy(xpath = "//button[contains(text(),'Оформить')]")
    public WebElement buttonOf;
     //  driver.findElement(By.xpath("//b[contains(text(),'Оформить онлайн')]")).click();
     @FindBy(xpath = "//button[contains(text(),'Продолжить')]")
     public WebElement buttonContin;
    @FindBy(xpath = "//h1[contains(@class,'page-teaser-dict__header kitt-heading_size_l')]")
    public WebElement title;

    @FindBy(xpath = "//button[@class='kitt-cookie-warning__close']")
    public WebElement protect;



    public PressButtonPages() {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }
    public void pressButtonOf(String nameButton) {
        switch (nameButton) {
            case "Оформить":
                scrollDown(buttonOf);
                buttonOf.click();
                break;
            case "Оформить онлайн":
                protect.click();
                scrollDown(buttonOfOn);
                buttonOfOn.click();
                break;
            case "Продолжить":
                scrollDown(buttonContin);
                buttonContin.click();
                break;
        }

    }

}
