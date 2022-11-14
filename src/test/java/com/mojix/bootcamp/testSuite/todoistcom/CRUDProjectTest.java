package com.mojix.bootcamp.testSuite.todoistcom;

import org.junit.jupiter.api.Test;

public class CRUDProjectTest extends TestBase {

    @Test
    public void verifyCRUDProject() {
        String projectCreated = String.format("MOJIX-JAA-%d", System.currentTimeMillis());
        String projectUpdated = String.format("QA-JAA-%d", System.currentTimeMillis());

        mainPage.loginLabel.click();
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
    }
}
