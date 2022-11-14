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

    public TextBox emailTxtBox = new TextBox(By.xpath("//div[@class='_9d172ece c59d0239 f9408a0e']/input"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//div[@class='_66b448b3 _9d172ece c59d0239 f9408a0e _6e9db9aa _6cad1a19 _21b8bafa']/input"));
    public Button loginButton = new Button(By.xpath("//button[@class='nFxHGeI S7Jh9YX a8af2163 _3d1243b2 _3991076f f9408a0e _8c75067a']"));


    public void login(final String user, final String pwd) {
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }
}
