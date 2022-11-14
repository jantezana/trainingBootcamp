package com.mojix.bootcamp.page.todoly;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.TextBox;
import org.openqa.selenium.By;

/**
 * LoginSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class LoginSection {

    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));


    public void login(final String user, final String pwd) {
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }
}
