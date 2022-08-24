package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchKeyTest {

    private ChromeDriver driver;
//    private FirefoxDriver driver;

    @BeforeTest
    public void initializeSession() {
        //webdrivermanager
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        //chrome Options
        ChromeOptions options = new ChromeOptions();
//        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("chrome");
        //initialize browser
        driver = new ChromeDriver(options);
        //maximize
        driver.manage().window().maximize();
    }

    @AfterTest
    public void destroySession() throws InterruptedException {
        Thread.sleep(5000);
        //close browser
        driver.quit();
    }

    @Test
    public void searchKey() throws InterruptedException {
        driver.get("https://www.google.com/");

        // input https://dev.to/
        By locatorInputKey = By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
        WebElement inputKey = driver.findElement(locatorInputKey);
        inputKey.sendKeys("dev.to");
        Thread.sleep(3000);

        // click
        By locatorSearchPenelusuranGoogle = By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/ul[1]/li[1]/div[1]");
        WebElement searchPenelusuranGoogle = driver.findElement(locatorSearchPenelusuranGoogle);
        searchPenelusuranGoogle.click();

        // click
        By locatorLinkSearch = By.xpath("//body[1]/div[7]/div[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]");
        WebElement linkSearch = driver.findElement(locatorLinkSearch);
        linkSearch.click();

        // input Katalon
        By locatorInputSearchKey = By.xpath("//body[1]/header[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
        WebElement inputSearchKey = driver.findElement(locatorInputSearchKey);
        inputSearchKey.sendKeys("Katalon");


        // click
        By locatorButtonSearch = By.xpath("//body[1]/header[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]");
        WebElement buttonButtonSearch = driver.findElement(locatorButtonSearch);
        buttonButtonSearch.click();
        Thread.sleep(3000);

        // click
        By locatorButtonLinkSearchClick = By.xpath("//div[contains(@class, 'crayons-story__tags')]/a[3]");
        WebElement buttonSearchClick = driver.findElement(locatorButtonLinkSearchClick);
        buttonSearchClick.click();

        // verify
        By locatorLabelKeyword = By.xpath("//div[contains(@class, 'flex justify-between items-center')]/h1");
        WebElement labelKeyWord = driver.findElement(locatorLabelKeyword);
        labelKeyWord.getText();

    }
}
