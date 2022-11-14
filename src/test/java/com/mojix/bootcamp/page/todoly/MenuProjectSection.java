package com.mojix.bootcamp.page.todoly;

import com.mojix.bootcamp.control.Button;
import org.openqa.selenium.By;

/**
 * MenuProjectSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class MenuProjectSection {

    public Button menuIconButton = new Button(By.xpath("//div[contains(@style,'block')]/img"));
    public Button editButton = new Button(By.xpath("//ul[@id=\"projectContextMenu\"]//a[text()='Edit']"));
    public Button deleteButton = new Button(By.id("ProjShareMenuDel"));
}
