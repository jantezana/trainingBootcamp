package com.mojix.bootcamp.basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class BasicSeleniumTest {

    public static final String BOOTCAMP_EMAIL = "bootcamp@mojix44.com";
    public static final String BOOTCAMP_PASSWORD = "12345";
    public static final int DEFAULT_SLEEP_TIME = 1000;
    public static final String DEFAULT_URL = "http://todo.ly/";
    public static final String DRIVER_CHROME_DRIVER_PATH = "src/test/resources/driver/chromedriver";
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", DRIVER_CHROME_DRIVER_PATH);
        this.driver = new ChromeDriver();
        this.driver.get(DEFAULT_URL);
    }

    @AfterEach
    public void cleanup() {
        this.driver.quit();
    }

    @Test
    public void verifyCRUDProject() throws InterruptedException {

        // Login.
        this.driver.findElement(By.xpath("//img[contains(@src,'pagelogin')]")).click();
        this.driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(BOOTCAMP_EMAIL);
        this.driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys(BOOTCAMP_PASSWORD);
        this.driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(DEFAULT_SLEEP_TIME);
        Assertions.assertTrue(driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).isDisplayed(), "ERROR login was incorrect");

        // Creates the project.
        String projectName = "JAAProject" + new Date().getTime();
        this.driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        this.driver.findElement(By.id("NewProjNameInput")).sendKeys(projectName);
        this.driver.findElement(By.id("NewProjNameButton")).click();
        Thread.sleep(DEFAULT_SLEEP_TIME);
        int actualResult = driver.findElements(By.xpath("//td[text()='" + projectName + "']")).size();
        Assertions.assertTrue(actualResult >= 1, "ERROR The project was not created");

        // Updates the project name.
        projectName = "UpdatedJAAProject" + new Date().getTime();
        driver.findElement(By.xpath("//div[contains(@style,'block')]/img")).click();
        driver.findElement(By.xpath("//ul[@id=\"projectContextMenu\"]//a[text()='Edit']")).click();
        driver.findElement(By.xpath("//td/div/input[@id='ItemEditTextbox']")).clear();
        driver.findElement(By.xpath("//td/div/input[@id='ItemEditTextbox']")).sendKeys(projectName);
        driver.findElement(By.xpath("//td/div/img[@id='ItemEditSubmit']")).click();
        Thread.sleep(DEFAULT_SLEEP_TIME);
        actualResult = driver.findElements(By.xpath("//td[text()='" + projectName + "']")).size();
        Assertions.assertTrue(actualResult >= 1, "ERROR The project was not updated");

        // Creates a task
        String taskName = "JAATask" + new Date().getTime();
        this.driver.findElement(By.id("NewItemContentInput")).sendKeys(taskName);
        this.driver.findElement(By.id("NewItemAddButton")).click();
        Thread.sleep(DEFAULT_SLEEP_TIME);
        actualResult = driver.findElements(By.xpath("//div[text()='" + taskName + "']")).size();
        Assertions.assertTrue(actualResult >= 1, "ERROR The task was not created");

        // Updated task name.
        driver.findElement(By.xpath("//td/div[text()='"+ taskName +"']")).click();
        driver.findElement(By.xpath("//td/div[text()='"+ taskName +"']")).clear();
        taskName = "UpdatedJAATask" + new Date().getTime();
        driver.findElement(By.xpath("//td/div[text()='"+ taskName +"']")).sendKeys("Juan");
        driver.findElement(By.xpath("//div[text()='" + taskName + "']")).sendKeys(Keys.ENTER);

        // Deletes the project
        driver.findElement(By.xpath("//div[contains(@style,'block')]/img")).click();
        driver.findElement(By.id("ProjShareMenuDel")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(DEFAULT_SLEEP_TIME);
        actualResult = driver.findElements(By.xpath(" //td[text()='" + projectName + "'] ")).size();
        Assertions.assertTrue(actualResult == 0, "ERROR The project was not removed");
    }
}