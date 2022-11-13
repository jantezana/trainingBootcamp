package com.mojix.bootcamp.testSuite.todoly;

import com.mojix.bootcamp.page.todoly.LoginSection;
import com.mojix.bootcamp.page.todoly.MainPage;
import com.mojix.bootcamp.page.todoly.MenuSection;
import com.mojix.bootcamp.page.todoly.ProjectSection;
import com.mojix.bootcamp.page.todoly.SettingsSection;
import com.mojix.bootcamp.page.todoly.SignUpSection;
import com.mojix.bootcamp.session.Session;
import com.mojix.bootcamp.util.GetProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * TestBase class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class TestBase {

    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();
    ProjectSection projectSection = new ProjectSection();

    SettingsSection settingsSection = new SettingsSection();

    SignUpSection signUpSection = new SignUpSection();

    String user = GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }

}
