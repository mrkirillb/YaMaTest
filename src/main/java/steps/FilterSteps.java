package steps;

import io.qameta.allure.Step;
import pages.PageFilters;

public class FilterSteps {

    @Step("Проверяет что фильтры открыты: {0}")
    public void stepCheckHeadFilters(String itemName) {
        new PageFilters().checkHead(itemName);
    }

    @Step("Цена от: {0}")
    public void setPriceFrom(String valPrice) throws InterruptedException {
        new PageFilters().setPriceFrom(valPrice);
    }

    @Step("Фильтр по производителю: {0}")
    public void setСheckBox(String valName) throws InterruptedException {
        new PageFilters().setCheckBox(valName);
    }

    @Step("Применяет фильтр")
    public void setFilterButtonOk() {
        new PageFilters().setEnterFilterButton();
    }

    @Step("Проверяет, количество элементов на странице: {0}")
    public void checkSum(int expVal) {
        new PageFilters().checkNum(expVal);
    }

    @Step("Проверяет первый элемент")
    public void checkFirst() throws InterruptedException {
        new PageFilters().checkFirstElement();
    }
}
