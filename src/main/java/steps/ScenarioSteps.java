package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    ElementsSteps elementsSteps = new ElementsSteps();
    FilterSteps filterSteps = new FilterSteps();

    @When("^на главной странице выбирает раздел \"(.+)\"$")
    public void selectMainMenuItem(String itemName){
        mainSteps.stepSelectYandexMainMenu(itemName);
    }

    @Then("^переключает страницу")
    public void changePage(){
        mainSteps.changePage();
    }

    @Then("^на странице Яндекс.Маркета выбирает категорию \"(.+)\"$")
    public void selectMenuItem(String itemName){
        marketSteps.stepSelectMainMenu(itemName);
    }

    @Then("^проверяет заголовок каталога: \"(.+)\"$")
    public void checkCatalogName(String itemName){
        electronicsSteps.stepCheckHeadCatalog(itemName);
    }

    @When("^выбирает элемент из каталога \"(.+)\"$")
    public void selectCatalogItem(String itemName){
        electronicsSteps.clickCatalogItem(itemName);
    }

    @Then("^нажимает на кнопку с выбором всех фильтров")
    public void clickAllFilters(){
        elementsSteps.clickAllFiltersButton();
    }

    @When("^проверяет заголовок фильтра \"(.+)\"$")
    public void checkCatalogElementItem(String itemName){
        filterSteps.stepCheckHeadFilters(itemName);
    }

    @Then("^заполняет фильтр ценой от: \"(.+)\"$")
    public void setPriceFrom(String valuePrice) throws InterruptedException {
        filterSteps.setPriceFrom(valuePrice);
    }

    @Then("^проставляет чек бокс - фильтр по производителю: \"(.+)\"$")
    public void setCheckBox(String valBox) throws InterruptedException {
        filterSteps.setСheckBox(valBox);
    }

    @Then("^применяет фильтр")
    public void setEnterButtonFilter() {
        filterSteps.setFilterButtonOk();
    }

    @When("^проверяет, количество элементов на странице: \"(.+)\"$")
    public void checkSum(int expVal) {
        filterSteps.checkSum(expVal);
    }

    @Then("проверяет, что наименование товара соответствует запомненному значению")
    public void checkFirst() throws InterruptedException {
        filterSteps.checkFirst();
    }
}
