package com.mojix.bootcamp.page.todoistcom;

import com.mojix.bootcamp.control.Button;
import org.openqa.selenium.By;

/**
 * MenuSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class MenuSection {

    public Button inboxButton = new Button(By.xpath("//a/span[text()='Inbox']"));
    public Button settingButton = new Button(By.xpath("//div[contains(@class, 'settings_avatar')]"));
    public Button logoutButton = new Button(By.xpath("//button/span[text()='Log out']"));
}
