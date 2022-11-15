package com.mojix.bootcamp.page.todoistcom;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.Label;
import com.mojix.bootcamp.control.TextBox;
import org.openqa.selenium.By;

public class TaskSection {

    public MenuTaskSection menuTaskSection = new MenuTaskSection();
    public Button addNewTaskButton = new Button(By.xpath("//button[@data-add-task-navigation-element='true']"));
    public TextBox descriptionTxtBox = new TextBox(By.xpath("//div[contains(@class, 'public-DraftStyleDefault-ltr')]"));
    public Button addTaskButton = new Button(By.xpath("//button[@data-testid='task-editor-submit-button']"));
    public TextBox editDescriptionTxtBox = new TextBox(By.xpath("//input[@class='view_header__input']"));
    public Button saveButton = new Button(By.xpath("//button[@type='submit']/span[text()='Save']"));

    public boolean isTaskDisplayedInList(String taskName) {
        Label foundTask = new Label(By.xpath("//div[contains(@class, 'task_content') and text()='" + taskName + "']"));
        return foundTask.isControlDisplayed();
    }

    public void clickOnTask(String taskName) {
        Label foundTask = new Label(By.xpath("//div[contains(@class, 'task_content') and text()='" + taskName + "']"));
        foundTask.click();
    }

    public Label getTask(final String taskName) {
        Label foundTask = new Label(By.xpath("//div[contains(@class, 'task_content') and text()='" + taskName + "']"));
        return foundTask;
    }
}
