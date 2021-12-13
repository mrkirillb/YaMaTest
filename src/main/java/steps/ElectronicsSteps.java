package steps;

import io.qameta.allure.Step;
import pages.ElectronicsPage;

public class ElectronicsSteps {

    @Step("Проверяет заголовок каталога: {0}")
    public void stepCheckHeadCatalog(String itemName){
        new ElectronicsPage().checkHead(itemName);
    }

    @Step("Выбирает элемент каталога: {0}")
    public void clickCatalogItem(String itemName){
        new ElectronicsPage().clickCatalogItem(itemName);
    }
}
