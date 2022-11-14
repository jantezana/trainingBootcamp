package com.mojix.bootcamp.page.todoistcom;

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

    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@type='password']"));
    public Button loginButton = new Button(By.xpath("//button[@type='submit']"));


    public void login(final String user, final String pwd) {
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }
}
