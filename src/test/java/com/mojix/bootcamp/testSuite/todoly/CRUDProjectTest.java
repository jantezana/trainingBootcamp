package com.mojix.bootcamp.testSuite.todoly;

import com.mojix.bootcamp.session.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * CRUDProjectTest class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class CRUDProjectTest extends TestBase {

    @Test
    public void verifyCRUDProject() {
        String projectCreated = String.format("MOJIX-JAA-%d", System.currentTimeMillis());
        String projectUpdated = String.format("QA-JAA-%d", System.currentTimeMillis());

        mainPage.loginLabel.click();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR! the login was failed");

        projectSection.addNewProjectButton.click();
        projectSection.nameProjectTxtBox.setText(projectCreated);
        projectSection.addButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectCreated), "ERROR! the project was not created");

        projectSection.clickOnProject(projectCreated);
        projectSection.menuProjectSection.menuIconButton.click();
        projectSection.menuProjectSection.editButton.click();
        projectSection.editProjectTxtBox.cleanSetText(projectUpdated);
        projectSection.saveButton.click();
        Assertions.assertTrue(projectSection.isProjectDisplayedInList(projectUpdated), "ERROR! the project was not updated");

        projectSection.clickOnProject(projectUpdated);
        projectSection.menuProjectSection.menuIconButton.click();
        projectSection.menuProjectSection.deleteButton.click();
        Session.getInstance().acceptAlert();
        projectSection.getProject(projectUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(projectSection.isProjectDisplayedInList(projectUpdated), "ERROR! the project was not deleted");
    }
}
