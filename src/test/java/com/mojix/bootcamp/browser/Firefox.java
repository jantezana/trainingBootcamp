package com.mojix.bootcamp.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * Firefox class.
 *
 * @author jantezana
 * @since 2022/11.12
 */
public class Firefox implements Browser {

    private static final Logger logger = LoggerFactory.getLogger(Firefox.class);

    @Override
    public WebDriver create() {
        logger.info("Creating the firefox driver!!");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        return driver;
    }
}
