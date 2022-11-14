package com.mojix.bootcamp.session;

import com.mojix.bootcamp.browser.BrowserType;
import com.mojix.bootcamp.browser.FactoryBrowser;
import com.mojix.bootcamp.util.GetProperties;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Optional;

/**
 * Session class.
 *
 * @author jantezana
 * @since 2022/11/12
 */
public class Session {

    private static final Logger logger = LoggerFactory.getLogger(Session.class);
    private static Session instance = null;
    private WebDriver browser;

    private Session() {
        logger.info("Creating the session!!");
        String browserValue = GetProperties.getInstance().getBrowser();
        Optional<BrowserType> browserType = BrowserType.fromString(browserValue);
        this.browser = FactoryBrowser.make(browserType.get()).create();
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
     * Gets the browser.
     *
     * @return The browser
     */
    public WebDriver getBrowser() {
        return this.browser;
    }

    /**
     * Accept the alert.
     */
    public void acceptAlert() {
        this.browser.switchTo().alert().accept();
    }

    /**
     * Close the session.
     */
    public void closeSession() {
        this.browser.quit();
        instance = null;
    }
}
