package ru.yandex.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.autotest.steps.BaseSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetFilterPages extends BasePages{

    @FindBy(xpath = "//div[2]/section/div[2]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/input")
    WebElement priceFrom;
    @FindBy(id = "glf-priceto-var")
    WebElement priceTo;
    @FindBy(xpath = "//*[@data-filter-id='7893318']")
    WebElement producer;

public  void SetFilterPages() {PageFactory.initElements(BaseSteps.getDriver(),this);}
    public void selectSum(String filtrSum, String value){
        switch(filtrSum){
            case "Сумма ОТ":
                scrollDown(priceFrom);
                priceFrom.sendKeys(value);
                break;
            case "Сумма ДО":
                scrollDown(priceTo);
                priceTo.sendKeys(value);
                break;
        }

    }
    public void setProducer(String nameProducer) {
        scrollDown(producer);
        producer.findElement(By.xpath(".//*[contains(text(),'"+nameProducer+"')]")).click();
    }


}
