package com.mojix.bootcamp.page.todoly;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.Label;
import org.openqa.selenium.By;

/**
 * MainPage class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class MainPage {

    public Label loginLabel = new Label(By.xpath("//img[contains(@src,'pagelogin')]"));
    public Button signUpFreeButton = new Button(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]"));
}
