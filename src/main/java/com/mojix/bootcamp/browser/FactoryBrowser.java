package com.mojix.bootcamp.browser;

/**
 * FactoryBrowser class.
 *
 * @author jantezana
 * @since 2022/11/12
 */
public class FactoryBrowser {

    public static Browser make(BrowserType browserType) {
        Browser browser;
        switch (browserType) {
            case FIREFOX: {
                browser = new Firefox();
                break;
            }
            case INTERNET_EXPLORER: {
                browser = new InternetExplorer();
                break;
            }
            case SAFARI: {
                browser = new Safari();
                break;
            }
            default: {
                browser = new Chrome();
            }
        }
        return browser;
    }
}
