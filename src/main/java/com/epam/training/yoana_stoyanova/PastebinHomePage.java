package com.epam.training.yoana_stoyanova;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PastebinHomePage {
    private WebDriver driver;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement codeField() {
        return driver.findElement(By.id("postform-text"));
    }

    public WebElement expirationDropdown() {
        return driver.findElement(By.cssSelector("span.select2-selection__rendered"));
    }

    public WebElement expirationOption10Min() {
        return driver.findElement(By.xpath("//li[text()='10 Minutes']"));
    }

    public WebElement titleField() {
        return driver.findElement(By.id("postform-name"));
    }

    public WebElement createPasteButton() {
        return driver.findElement(By.xpath("//button[text()='Create New Paste']"));
    }

    public void open() {
        driver.get("https://pastebin.com");
    }
}
