package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchKeyPage {

    private ChromeDriver driver;

    public SearchKeyPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://www.google.com/");
    }

    public void inputSearch(String key) {
        By locatorInputKey = By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
        WebElement inputKey = driver.findElement(locatorInputKey);
        inputKey.sendKeys(key);
    }

    public void clickSearchPenelusuranGoogle() {
        By locatorSearchPenelusuranGoogle = By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div[1]/ul[1]/li[1]/div[1]");
        WebElement searchPenelusuranGoogle = driver.findElement(locatorSearchPenelusuranGoogle);
        searchPenelusuranGoogle.click();
    }

    public void clickLinkSearch() {
        By locatorLinkSearch = By.xpath("//body[1]/div[7]/div[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]");
        WebElement linkSearch = driver.findElement(locatorLinkSearch);
        linkSearch.click();
    }

    public void inputSearchKey(String key) {
        By locatorInputSearchKey = By.xpath("//body[1]/header[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
        WebElement inputSearchKey = driver.findElement(locatorInputSearchKey);
        inputSearchKey.sendKeys(key);
    }

    public void clickButtonSearch() throws InterruptedException {
        By locatorButtonSearch = By.xpath("//body[1]/header[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]");
        WebElement buttonButtonSearch = driver.findElement(locatorButtonSearch);
        buttonButtonSearch.click();
        Thread.sleep(3000);
    }

    public void clickButtonSearchClick() {
        By locatorButtonLinkSearchClick = By.xpath("//div[contains(@class, 'crayons-story__tags')]/a[3]");
        WebElement buttonSearchClick = driver.findElement(locatorButtonLinkSearchClick);
        buttonSearchClick.click();
    }

    public void verifyLabelKeyword(String key) {
        By locatorLabelKeyword = By.xpath("//div[contains(@class, 'flex justify-between items-center')]/h1");
        WebElement labelKeyWord = driver.findElement(locatorLabelKeyword);
        labelKeyWord.getText();
    }

}
