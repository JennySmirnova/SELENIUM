package ru.yandex.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.autotest.steps.BaseSteps;

import java.util.concurrent.TimeUnit;

public class PressButtonPages extends BasePages {
    @FindBy(xpath = "//*[contains(text(),'Все фильтры')]")
    WebElement allFiltres;
    @FindBy(xpath = "//a[@class='_2qvOOvezty _3qN-vKmEan _1Rc6LxE3Tr']")
    WebElement buttonFilter;



    public PressButtonPages() {
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }
    public void pressButtonOf(String nameButton) {
        switch (nameButton) {
            case "Все фильтры":
                scrollDown(allFiltres);
                allFiltres.click();
                break;
            case "Показать подходящие":
                scrollDown(buttonFilter);
                buttonFilter.click();
                break;
        }


    }

}
