package com.epam.training.yoana_stoyanova;

import com.epam.training.yoana_stoyanova.PastebinHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PastebinHomePageTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearResolutionCache().driverVersion("137.0.7151.120").setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testCreatePaste() {
        PastebinHomePage homePage = new PastebinHomePage(driver);
        homePage.open();

        homePage.codeField().sendKeys("Hello from WebDriver");
        homePage.expirationDropdown().click();
        homePage.expirationOption10Min().click();
        homePage.titleField().sendKeys("helloweb");
        homePage.createPasteButton().click();

        // You can add assertions here to verify results
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
