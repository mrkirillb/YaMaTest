package steps;

import io.qameta.allure.Step;
import pages.ElementsPage;

public class ElementsSteps {

    @Step("Нажимает на кнопку: Все фильтры")
    public void clickAllFiltersButton(){
        new ElementsPage().allFiltersButtonClick();}

}
