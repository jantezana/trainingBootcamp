package com.mojix.bootcamp.page.todoly;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.TextBox;
import org.openqa.selenium.By;

/**
 * SettingsSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class SettingsSection {

    public TextBox oldPasswordTxtBox = new TextBox(By.id("TextPwOld"));
    public TextBox newPasswordTxtBox = new TextBox(By.id("TextPwNew"));
    public Button okButton = new Button(By.xpath("//span[text()='Ok']"));
}
