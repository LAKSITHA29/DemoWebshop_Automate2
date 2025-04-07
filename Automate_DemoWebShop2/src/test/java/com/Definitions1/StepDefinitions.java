//package com.Definitions1;
//
//
//import com.actions.LoginPageActions;
//import com.utilities.HelperClass;
//
//import io.cucumber.java.en.*;
//
//	import org.testng.Assert;
//
//public class StepDefinitions{
//	    LoginPageActions loginPage = new LoginPageActions();
//
//	    @Given("user is in the Demo Web Shop application")
//	    public void user_is_on_homepage() {
//	         HelperClass.openPage();
//	    }
//
//	    @When("user logs in with {string} and {string}")
//	    public void user_logs_in(String email, String password) {
//	        loginPage.performLogin(email, password);
//	    }
//
//	    @Then("the user should see the {string}")
//	    	public void the_user_should_see_the_message(String expectedMessage) {
//	    	    Assert.assertTrue(loginPage.isLoginSuccessful(expectedMessage), "Login message mismatch");
//	    	}
//	    
//
//	}
package com.Definitions1;

import com.actions.LoginPageActions;
import com.utilities.HelperClass;
import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class StepDefinitions {
    LoginPageActions loginPage = new LoginPageActions();
    private static final Logger logger = LoggerFactory.getLogger(StepDefinitions.class);

    @Given("user is in the Demo Web Shop application")
    public void user_is_on_homepage() {
        logger.info("Opening Demo Web Shop application");
        HelperClass.openPage();
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in(String email, String password) {
        logger.info("Attempting to login with email: {}", email);
        loginPage.performLogin(email, password);
    }

    @Then("the user should see the {string}")
    public void the_user_should_see_the_message(String expectedMessage) {
        logger.info("Verifying login success message: {}", expectedMessage);
        Assert.assertTrue(loginPage.isLoginSuccessful(expectedMessage), "Login message mismatch");
    }
}

