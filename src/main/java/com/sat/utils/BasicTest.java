package com.sat.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;

public abstract class BasicTest {
    
    public static final Logger logger = LogManager.getLogger();
    protected static WebDriver driver;
    private String driverPath;

    @BeforeMethod
    public void preCondition() {
        // Chromedriver path
        driverPath = System.getProperty("user.dir") + File.separator +
                    "src/main/resources/WebDrivers/chromedriver.exe";
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver(options);
        // Maximize the browser
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void postCondition(){
        // Quit the Browser
        driver.quit();
    }
}