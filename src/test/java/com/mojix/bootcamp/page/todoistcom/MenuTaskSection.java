package com.mojix.bootcamp.page.todoistcom;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.Label;
import com.mojix.bootcamp.control.TextBox;
import org.openqa.selenium.By;

public class MenuTaskSection {

    public Button moreActionsButton = new Button(By.xpath("//button[@aria-label='More actions']"));
    public Button deleteTaskButton = new Button(By.xpath("//button[@aria-label='Delete task…']"));
    public Button deleteButton = new Button(By.xpath("//button/span[text()='Delete']"));
}
