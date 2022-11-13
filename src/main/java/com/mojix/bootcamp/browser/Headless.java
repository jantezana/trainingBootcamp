package com.mojix.bootcamp.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * Safari class.
 *
 * @author jantezana
 * @since 2022/11.12
 */
public class Headless implements Browser {

    private static final Logger logger = LoggerFactory.getLogger(Headless.class);

    @Override
    public WebDriver create() {
        logger.info("Creating the headless driver!!");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        return driver;
    }
}
