package com.epam.training.yoana_stoyanova;

import com.epam.training.yoana_stoyanova.PastebinHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class PastebinHomePageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            PastebinHomePage homePage = new PastebinHomePage(driver);
            homePage.open();

            homePage.codeField().sendKeys("Hello from WebDriver");
            homePage.expirationDropdown().click();
            homePage.expirationOption10Min().click();
            homePage.titleField().sendKeys("helloweb");
            homePage.createPasteButton().click();

        } finally {
            driver.quit();
        }
    }
}
