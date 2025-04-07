package com.Definitions1;

import com.actions.EmailPageActions;
import com.actions.LoginPageActions;
import com.actions.ProductPageActions;
import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepDefinitions3 {

    LoginPageActions loginPageActions = new LoginPageActions();
    ProductPageActions proPageActions = new ProductPageActions();
    EmailPageActions emailPageActions = new EmailPageActions();

    private static final Logger logger = LoggerFactory.getLogger(StepDefinitions3.class);

    @And("user navigates to the WishList section")
    public void user_navigates_to_the_wishlist_section() {
        logger.info("Navigating to the wishlist section");
        proPageActions.ViewList();
    }

    @And("user clicks Email a friend button")
    public void user_clicks_email_a_friend_button() {
        logger.info("Clicking on 'Email a friend' button");
        emailPageActions.clickEmailAFriend();
    }

    @Then("user fills email details from Excel")
    public void user_fills_email_details_from_excel() {
        logger.info("Filling email details using data from Excel");
        emailPageActions.fillEmailDetailsFromExcel();
    }

    @And("user clicks the Send Email button")
    public void user_clicks_the_send_email_button() {
        logger.info("Clicking on 'Send Email' button");
        emailPageActions.clickSendEmail();
    }

    @Then("a confirmation message should be displayed")
    public void a_confirmation_message_should_be_displayed() {
        logger.info("Verifying that confirmation message is displayed");
        emailPageActions.verifyConfirmationMessage();
    }
}
