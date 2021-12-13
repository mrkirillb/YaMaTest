package steps;

import io.qameta.allure.Step;
import pages.MarketPage;

public class MarketSteps {

    @Step("Нажать кнопку на панели: {0}")
    public void stepSelectMainMenu(String itemName){
        new MarketPage().mainTabClick(itemName);
    }
}
