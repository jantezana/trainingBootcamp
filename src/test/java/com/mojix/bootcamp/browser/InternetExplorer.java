package com.mojix.bootcamp.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * InternetExplorer class.
 *
 * @author jantezana
 * @since 2022/11.12
 */
public class InternetExplorer implements Browser {

    private static final Logger logger = LoggerFactory.getLogger(InternetExplorer.class);

    @Override
    public WebDriver create() {
        logger.info("Creating the internet explorer driver!!");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
