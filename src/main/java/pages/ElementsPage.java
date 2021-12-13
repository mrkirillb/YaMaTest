package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.MainSteps;

public class ElementsPage {

    public ElementsPage() {
        PageFactory.initElements(MainSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@data-zone-name,'all-filters-button')]")
    WebElement allFiltersButton;
    public void allFiltersButtonClick(){
        allFiltersButton.click();
    }
}
