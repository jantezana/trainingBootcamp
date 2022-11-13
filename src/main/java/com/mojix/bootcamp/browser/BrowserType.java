package com.mojix.bootcamp.browser;

import java.util.Optional;

public enum BrowserType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    INTERNET_EXPLORER("internet_explorer"),
    SAFARI("safari");

    private String value;

    BrowserType(final String value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return The value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Gets browse type from string.
     *
     * @param value The value
     * @return The optional browse type
     */
    public static Optional<BrowserType> fromString(final String value) {
        BrowserType result = null;
        for (BrowserType browserType : BrowserType.values()) {
            if (browserType.getValue().equalsIgnoreCase(value)) {
                result = browserType;
                break;
            }
        }

        return Optional.ofNullable(result);
    }
}
