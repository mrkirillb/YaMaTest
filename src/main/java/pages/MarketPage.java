package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.MainSteps;

public class MarketPage extends MainPage {

    public MarketPage(){
        PageFactory.initElements(MainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@data-zone-name,'menu')]")
    WebElement tabsMenu;
    public void mainTabClick(String itemName){
        tabsMenu.findElement(By.xpath("//*[contains(text(),'"+itemName+"')]")).click();;
    }
}
