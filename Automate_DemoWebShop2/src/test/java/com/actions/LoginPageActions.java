package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {

    LoginPageLocators loginLocators;

    public LoginPageActions() {
        this.loginLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginLocators);
    }

    public void clickLoginLink() {
        loginLocators.loginLink.click();
    }

    public void enterEmail(String email) {
        loginLocators.MailId.clear();
        loginLocators.MailId.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginLocators.password.clear();
        loginLocators.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginLocators.loginbtn.click();
    }

    public void performLogin(String email, String password) {
        clickLoginLink();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public boolean isLoginSuccessful(String LoginStatus) {
    	 
        try {
        	
            String actualText = loginLocators.expMsg.getText().trim();
            if (actualText.equalsIgnoreCase("Welcome to our store")) {
                return LoginStatus.equalsIgnoreCase("Login passed");
             
            } else {
                return LoginStatus.equalsIgnoreCase("Login failed");
            }
        } catch (Exception e) {
            return LoginStatus.equalsIgnoreCase("Login failed");
        }
    }



}