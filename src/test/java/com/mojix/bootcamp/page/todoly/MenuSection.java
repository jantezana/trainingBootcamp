package com.mojix.bootcamp.page.todoly;

import com.mojix.bootcamp.control.Button;
import org.openqa.selenium.By;

/**
 * MenuSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class MenuSection {

    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Button settingButton = new Button(By.xpath("//a[text()='Settings']"));
}
