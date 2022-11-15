package com.mojix.bootcamp.page.todoistcom;

import com.mojix.bootcamp.control.Button;
import org.openqa.selenium.By;

/**
 * MenuProjectSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class MenuProjectSection {

    public Button menuIconButton = new Button(By.xpath("//button[@aria-label='More project actions']"));
    public Button editButton = new Button(By.xpath("//div[text()='Edit project']"));
    public Button deleteButton = new Button(By.xpath("//div[text()='Delete project']"));
}
