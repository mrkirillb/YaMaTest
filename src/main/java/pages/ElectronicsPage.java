package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.MainSteps;

import static org.junit.Assert.assertEquals;

public class ElectronicsPage {

    public ElectronicsPage() {
        PageFactory.initElements(MainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@data-apiary-widget-name,'@MarketNode/CatalogHeader')]")
    WebElement headCatalog;

    public void checkHead(String itemName){
        Wait<WebDriver> wait = new WebDriverWait(MainSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(headCatalog));
        assertEquals(itemName,headCatalog.findElement((By.xpath("//h1[contains(text(),'"+itemName+"')]"))).getText());
    }

    @FindBy(xpath = "//div[contains(@data-apiary-widget-name,'@MarketNode/NavigationTree')]")
    WebElement itemsCatalog;
    public void clickCatalogItem(String itemName){
        itemsCatalog.findElement(By.xpath("//li//a[contains(text(),'"+itemName+"')]")).click();}

}
