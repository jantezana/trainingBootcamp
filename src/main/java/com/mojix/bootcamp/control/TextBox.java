package com.mojix.bootcamp.control;

import org.openqa.selenium.By;

/**
 * TextBox class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class TextBox extends Control {

    public TextBox(By locator) {
        super(locator);
    }

    public void setText(final String value) {
        this.find();
        this.control.sendKeys(value);
    }

    public void cleanSetText(final String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys(value);
    }
}
