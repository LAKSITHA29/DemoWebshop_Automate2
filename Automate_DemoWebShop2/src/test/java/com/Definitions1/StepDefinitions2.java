//package com.Definitions1;
//
//import org.testng.Assert;
//
//import com.actions.LoginPageActions;
//import com.actions.ProductPageActions;
//import com.utilities.HelperClass;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepDefinitions2 {
//	LoginPageActions loginPage = new LoginPageActions();
//	ProductPageActions proPage=new ProductPageActions();
//	 
//
//	@And("user navigates to the Jewelry section")
//    public void user_navigates_to_the_jewelry_section() {
//        proPage.clickProCategory();
//    }
//
//	    @When("user clicks a jewelry")
//	    public void user_clicks_a_jewelry() {
//	        proPage.clickProduct();
//	    }
//	    @And("enter the length of the jewel and adds it to the wishlist")
//	    public void enter_length_and_add_to_wishlist() {
//	        proPage.enterLength();
//	        proPage.AddtoWishList();
//	    }
//
//	    @Then("the selected item should appear in the wishlist")
//	    public void selected_ring_should_appear_in_wishlist() {
//	       proPage.ViewList();
//	       proPage.getPriceText();
//	       System.out.println(proPage.getPriceText());
//	    }
//	}
//
//
//
package com.Definitions1;

import com.actions.LoginPageActions;
import com.actions.ProductPageActions;
import com.utilities.HelperClass;
import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class StepDefinitions2 {
    LoginPageActions loginPage = new LoginPageActions();
    ProductPageActions proPage = new ProductPageActions();
    private static final Logger logger = LoggerFactory.getLogger(StepDefinitions2.class);

    @And("user navigates to the Jewelry section")
    public void user_navigates_to_the_jewelry_section() {
        logger.info("Navigating to Jewelry section");
        proPage.clickProCategory();
    }

    @When("user clicks a jewelry")
    public void user_clicks_a_jewelry() {
        logger.info("Clicking on a jewelry item");
        proPage.clickProduct();
    }

    @And("enter the length of the jewel and adds it to the wishlist")
    public void enter_length_and_add_to_wishlist() {
        logger.info("Entering length and adding item to wishlist");
        proPage.enterLength();
        proPage.AddtoWishList();
    }

    @Then("the selected item should appear in the wishlist")
    public void selected_ring_should_appear_in_wishlist() {
        logger.info("Verifying item is added to wishlist");
        proPage.ViewList();
        String priceText = proPage.getPriceText();
        logger.info("Wishlist item price: {}", priceText);
        System.out.println(priceText);
    }
}
