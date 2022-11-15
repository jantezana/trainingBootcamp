package com.mojix.bootcamp.testSuite.todoistcom;

import com.mojix.bootcamp.page.todoistcom.LoginSection;
import com.mojix.bootcamp.page.todoistcom.MainPage;
import com.mojix.bootcamp.page.todoistcom.MenuSection;
import com.mojix.bootcamp.page.todoistcom.ProjectSection;
import com.mojix.bootcamp.session.Session;
import com.mojix.bootcamp.util.GetProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * TestBase class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class TestBase {

    public MainPage mainPage = new MainPage();
    public LoginSection loginSection = new LoginSection();
    public MenuSection menuSection = new MenuSection();
    public ProjectSection projectSection = new ProjectSection();
    public static String user;
    public static String password;

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("configuration.name", "todoistcom.properties");
        user = GetProperties.getInstance().getUser();
        password = GetProperties.getInstance().getPwd();
    }

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }

}
