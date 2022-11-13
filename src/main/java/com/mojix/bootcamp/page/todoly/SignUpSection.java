package com.mojix.bootcamp.page.todoly;

import com.mojix.bootcamp.control.Button;
import com.mojix.bootcamp.control.CheckBox;
import com.mojix.bootcamp.control.TextBox;
import org.openqa.selenium.By;

/**
 * SignUpSection class.
 *
 * @author jantezana
 * @version 2022/11/12
 */
public class SignUpSection {

    public TextBox fullNameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public CheckBox agreeTermsCheckBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signupButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

    public SignUpSection() {
    }

    public void createNewAccount(final String fullName, final String email, final String pwd) {
        fullNameTextBox.setText(fullName);
        emailTextBox.setText(email);
        pwdTextBox.setText(pwd);
        agreeTermsCheckBox.check();
        signupButton.click();
    }
}

