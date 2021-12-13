package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.MainSteps;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(MainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'services-new__content')]")
    WebElement startYandex;

    public void startPageButtonClick(String itemName){
        startYandex.findElement(By.xpath("//*[contains(text(),'"+itemName+"')]")).click();
    }
}
