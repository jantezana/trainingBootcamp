package com.mojix.bootcamp.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
public class Safari implements Browser {

    private static final Logger logger = LoggerFactory.getLogger(Safari.class);

    @Override
    public WebDriver create() {
        logger.info("Creating the safari driver!!");
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        return driver;
    }
}
