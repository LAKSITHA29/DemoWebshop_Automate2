package com.actions;

import com.pages.EmailPageLocators;
import com.utilities.ExcelUtils;
import com.utilities.HelperClass;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EmailPageActions {

    EmailPageLocators emailPageLocators;

    public EmailPageActions() {
        this.emailPageLocators = new EmailPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), emailPageLocators);
    }
    
 // Click "Email a Friend" button
    public void clickEmailAFriend() {
        emailPageLocators.sendMail.click();
    }

    // Fill sender, receiver, and message from Excel
    public void fillEmailDetailsFromExcel() {
        try {
            ExcelUtils.setExcelFile(
                "C:\\Users\\ADMIN\\workspace-db-mvn\\Automate_DemoWebShop2\\src\\test\\resources\\Email_excel.xlsx", 
                "Sheet1"
            );

            String receiver = ExcelUtils.getCellData(0, 0);
            String sender = ExcelUtils.getCellData(0, 1);
            String message = ExcelUtils.getCellData(0, 2);

            emailPageLocators.FriendId.sendKeys(receiver);
            emailPageLocators.myUserId.clear();
            emailPageLocators.myUserId.sendKeys(sender);
            emailPageLocators.MailBox.sendKeys(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Click "Send Email" button
    public void clickSendEmail() {
        emailPageLocators.sendbtn.click();
    }

    public void verifyConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));

        String expectedMessage = "Your message has been sent.";
        String actualMessage = wait.until(ExpectedConditions.visibilityOf(emailPageLocators.confirm)).getText();

        Assert.assertEquals(actualMessage, expectedMessage, "Email confirmation does not match.");
        System.out.println("Confirmation message: " + actualMessage);
    }
}

