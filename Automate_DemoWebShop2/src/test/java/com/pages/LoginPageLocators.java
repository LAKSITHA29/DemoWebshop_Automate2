package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="//a[@class=\"ico-login\"]")
	public WebElement loginLink;
	
	@FindBy(xpath="//input[@class=\"email\"]")
	public WebElement MailId;
	
	@FindBy(xpath="//input[@class=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement loginbtn;
	
	@FindBy(xpath = "//h2[@class='topic-html-content-header']")
	public WebElement expMsg;


}