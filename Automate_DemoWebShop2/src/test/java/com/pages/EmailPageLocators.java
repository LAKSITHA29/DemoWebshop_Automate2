package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPageLocators {
	@FindBy(xpath="//input[@value=\"Email a friend\"]")
	//@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[3]")
	//@FindBy(css = "div.result")
    public WebElement sendMail;
	
	@FindBy(xpath="//input[@class=\"friend-email\"]")
	public WebElement FriendId;
	
	@FindBy(xpath="//input[@class=\"your-email\"]")
	public WebElement myUserId;
	
	@FindBy(xpath="//textarea[@class=\"personal-message\"]")
	public WebElement MailBox;
	
	@FindBy(xpath="//input[@name=\"send-email\"]")
	public WebElement sendbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div")
	public WebElement confirm;


}
