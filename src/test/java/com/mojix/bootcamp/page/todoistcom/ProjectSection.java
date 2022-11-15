package com.mojix.bootcamp.page.todoistcom;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.Label;
import com.mojix.bootcamp.control.TextBox;
import org.openqa.selenium.By;

/**
 * ProjectSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class ProjectSection {

    public MenuProjectSection menuProjectSection = new MenuProjectSection();
    public Button addNewProjectButton = new Button(By.xpath("//button[@aria-label='Add project']"));
    public TextBox nameProjectTxtBox = new TextBox(By.xpath("//input[@id='edit_project_modal_field_name' and @name='name']"));
    public Button colorButton = new Button(By.xpath("//button[@type='button' and @aria-labelledby='edit_project_modal_field_color_label']"));
    public Label skyBlueLabel = new Label(By.xpath("//span[text()='Sky Blue']"));
    public Button addButton = new Button(By.xpath("//button[@type='submit' and text()='Add']"));
    public TextBox editProjectTxtBox = new TextBox(By.id("edit_project_modal_field_name"));
    public Button saveButton = new Button(By.xpath("//button[@type='submit']"));

    public Button deleteButton = new Button(By.xpath("//button[@type='submit']/span[text()='Delete']"));

    public ProjectSection() {
    }

    public void clickOnProject(final String nameProject) {
        Label projectCreated = new Label(By.xpath("//a/span[text()='" + nameProject + "']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(final String nameProject) {
        Label projectCreated = new Label(By.xpath("//a/span[text()='" + nameProject + "']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(final String nameProject) {
        Label projectCreated = new Label(By.xpath("//a/span[text()='" + nameProject + "']"));
        return projectCreated;
    }
}
