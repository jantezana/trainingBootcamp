package com.mojix.bootcamp.control;

import com.mojix.bootcamp.session.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Control class.
 *
 * @author jantezana
 * @since 2022/11/12
 */
public class Control {

    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void find() {
        control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    public void click() {
        this.find();
        this.control.click();
    }

    public boolean isControlDisplayed() {
        try {
            this.find();
            return this.control.isDisplayed();
        } catch (Exception exception) {
            return false;
        }
    }

    public boolean isControlEnabled() {
        try {
            this.find();
            return this.control.isEnabled();
        } catch (Exception exception) {
            return false;
        }
    }

    public String getText() {
        this.find();
        return this.control.getText();
    }

    public void waitControlIsInThePage() {
        WebDriverWait explicitWait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }

    public void waitControlIsNotInThePage() {
        WebDriverWait explicitWait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(this.locator)));
    }
}
