package com.mojix.bootcamp.testSuite.todoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * UpdatePasswordTest class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class UpdatePasswordTest extends TestBase {

    @Test
    public void verifyUpdatePassword() {
        String email = String.format("bootcamp@%d.com", System.currentTimeMillis());
        String pwd = String.format("%d", System.currentTimeMillis());
        String newPwd = String.format("Auto%s", pwd);

        mainPage.signUpFreeButton.click();
        signUpSection.createNewAccount(email, email, pwd);
        menuSection.settingButton.click();
        settingsSection.oldPasswordTxtBox.setText(pwd);
        settingsSection.newPasswordTxtBox.setText(newPwd);
        settingsSection.okButton.click();

        menuSection.logoutButton.click();
        mainPage.loginLabel.click();
        loginSection.login(email, newPwd);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se pudo iniciar sesion");
    }
}
