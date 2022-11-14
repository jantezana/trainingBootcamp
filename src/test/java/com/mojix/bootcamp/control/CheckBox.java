package com.mojix.bootcamp.control;

import org.openqa.selenium.By;

/**
 * CheckBox class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class CheckBox extends Control {

    public CheckBox(By locator) {
        super(locator);
    }

    public void check() {
        this.find();
        if (!this.control.isSelected()) {
            this.control.click();
        }
    }

    public void unCheck() {
        this.find();
        if (this.control.isSelected()) {
            this.control.click();
        }
    }
}
