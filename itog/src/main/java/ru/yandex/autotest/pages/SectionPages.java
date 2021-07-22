package ru.yandex.autotest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.autotest.steps.BaseSteps;

import java.util.Set;

import static org.junit.Assert.assertTrue;

public class SectionPages extends BasePages{
    @FindBy(xpath = "//div[@class='_381y5orjSo _21NjfY1k45']")
    WebElement tabList;
    @FindBy (xpath = "//a[@class='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS'][contains(text(),'Телевизоры')]")
    WebElement navigationTree;


    public void SectionPages(){
        PageFactory.initElements(BaseSteps.getDriver(),this);

    }
    public void setTabList(String tabListItem){
        for(String winHandle : BaseSteps.getDriver().getWindowHandles()){
            BaseSteps.getDriver().switchTo().window(winHandle);}
        WebElement
                selectItem = tabList.findElement(By.xpath("//span[contains(text(),'"+tabListItem+"')]"));
       // scrollDown(selectItem);
        selectItem.click();

    }

    public void setNavigationTree (String navigationTreeItem){
        WebElement
                selectItem = navigationTree.findElement(By.xpath("//a[@class='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS'][contains(text(),'"+navigationTreeItem+"')]"));
        scrollDown(selectItem);
        selectItem.click();
    }

}
