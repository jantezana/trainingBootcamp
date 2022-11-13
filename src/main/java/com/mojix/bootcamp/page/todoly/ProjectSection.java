package com.mojix.bootcamp.page.todoly;

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
    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox nameProjectTxtBox = new TextBox(By.id("NewProjNameInput"));
    public Button addButton = new Button(By.id("NewProjNameButton"));
    public TextBox editProjectTxtBox = new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button saveButton = new Button(By.xpath("//td/div/img[@id='ItemEditSubmit']"));
    public Button addNewProjecButton = new Button(By.id(""));

    public ProjectSection() {
    }

    public void clickOnProject(final String nameProject) {
        Label projectCreated = new Label(By.xpath("//td[text()='" + nameProject + "']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(final String nameProject) {
        Label projectCreated = new Label(By.xpath("//td[text()='" + nameProject + "']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(final String nameProject) {
        Label projectCreated = new Label(By.xpath("//td[text()='" + nameProject + "']"));
        return projectCreated;
    }
}
