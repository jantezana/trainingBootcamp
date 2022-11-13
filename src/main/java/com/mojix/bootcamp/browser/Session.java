package com.mojix.bootcamp.browser;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * Session class.
 *
 * @author jantezana
 * @since 2022/11/12
 */
public class Session {

    private static final Logger logger = LoggerFactory.getLogger(Session.class);
    private static Session instance = null;
    private WebDriver webDriver;

    private Session() {
        // TODO: create it in a property.
        logger.info("Creating the session!!");
        Browser browser = FactoryBrowser.make(BrowserType.CHROME);
        webDriver = browser.create();
    }

    /**
     * Gets the instance.
     *
     * @return The instance
     */
    public static Session getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Session();
        }

        return instance;
    }

    /**
     * Close the session.
     */
    public void close() {
        this.webDriver.quit();
        instance = null;
    }
}
