package com.mojix.bootcamp.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * Chrome class.
 *
 * @author jantezana
 * @since 2022/11.12
 */
public class Chrome implements Browser {

    private static final Logger logger = LoggerFactory.getLogger(Chrome.class);

    @Override
    public WebDriver create() {
        logger.info("Creating the chrome driver!!");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
