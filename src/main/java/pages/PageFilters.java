package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.MainSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PageFilters {

    public PageFilters() {
        PageFactory.initElements(MainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//section[contains(@data-zone-name,'all-filters-page')]")
    WebElement elementHead;

    public void checkHead(String itemName){
        Wait<WebDriver> wait = new WebDriverWait(MainSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(elementHead));
        assertEquals(itemName,elementHead.findElement((By.xpath("//h1[contains(text(),'"+itemName+"')]"))).getText());
    }

    @FindBy(xpath = "//div[contains(@data-filter-id,'glprice')]//div[contains(@data-prefix,'от')]//input[contains(@type,'text')]")
    WebElement priceFilter;

    public void setPriceFrom(String valPriseFrom) throws InterruptedException {
        priceFilter.click();
        priceFilter.clear();
        Thread.sleep(1000);
        priceFilter.sendKeys(valPriseFrom);
    }
    @FindBy(xpath = "//h4[contains(text(),'Производитель')]")
    WebElement brandFilter;

    @FindBy(xpath = "//div[contains(@data-filter-id,'7893318')]")
    WebElement checkBox;

    public void setCheckBox(String textVal) throws InterruptedException {
        Wait<WebDriver> wait = new WebDriverWait(MainSteps.getDriver(), 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(brandFilter));
        priceFilter.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);
        MainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id, '7893318')]//input[contains(@class, '_34OG2')]"))).clear();
        MainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id, '7893318')]//input[contains(@class, '_34OG2')]"))).click();
        MainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id, '7893318')]//input[contains(@class, '_34OG2')]"))).sendKeys(textVal);
        MainSteps.getDriver().findElement((By.xpath("//div[contains(@data-filter-id,'7893318')]//div[contains(text(),'"+textVal+"')]"))).click();
    }

    @FindBy(xpath = "//a[contains(text(),'Показать')]")
    WebElement EnterFilterButton;

    public void setEnterFilterButton(){
        EnterFilterButton.click();
    }
    @FindBy(xpath = "//article[contains(@data-autotest-id,'product-snippet')]")
    WebElement elementsOnPage;

    public void checkNum(int expVal){
    List<WebElement> list = MainSteps.getDriver().findElements((By.xpath("//article[contains(@data-autotest-id,'product-snippet')]")));
    assertEquals(expVal, list.size());
    }

    @FindBy(xpath = "//input[contains(@placeholder,'Искать товары')]")
    WebElement findMarketbutton;

    public void checkFirstElement() throws InterruptedException {
        String firstText = MainSteps.getDriver().findElement((By.xpath("//article[contains(@data-autotest-id,'product-snippet')]//h3//a[1]"))).getAttribute("title");
        findMarketbutton.clear();
        findMarketbutton.click();
        findMarketbutton.sendKeys(firstText);
        MainSteps.getDriver().findElement((By.xpath("//span[contains(text(),'Найти')]"))).click();
        Thread.sleep(1000);
        Wait<WebDriver> wait = new WebDriverWait(MainSteps.getDriver(), 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(MainSteps.getDriver().findElement(By.xpath("//article[contains(@data-autotest-id,'product-snippet')][1]"))));
        String secondText = MainSteps.getDriver().findElement((By.xpath("//article[contains(@data-autotest-id,'product-snippet')]//h3//a[1]"))).getAttribute("title");
        assertEquals(firstText, secondText);
    }
}
