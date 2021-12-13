package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class MainSteps {

    protected static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    @Before
    public static void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }

    @After
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Step("Переключает страницу")
    public void changePage(){
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
    }
    @Step("Нажимает кнопку на главной странице: {0}")
    public void stepSelectYandexMainMenu(String itemName){
        new MainPage().startPageButtonClick(itemName);
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}


