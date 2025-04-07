package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.pages.ProductPageLocators;
import com.utilities.HelperClass;

public class ProductPageActions {
	   ProductPageLocators proLocators;

	    public ProductPageActions() {
	        this.proLocators = new ProductPageLocators();
	        PageFactory.initElements(HelperClass.getDriver(), proLocators);
	    }

	    public void clickProCategory() {
	        proLocators.jewelry.click();
	    }
	    public void clickProduct() {
	    	proLocators.product.click();
	    }
	    public void enterLength() {
	        File file = new File("C:\\Users\\ADMIN\\workspace-db-mvn\\Automate_DemoWebShop2\\src\\test\\resources\\testdata.properties");

	        FileInputStream fileInput = null;
	        try {
	            fileInput = new FileInputStream(file);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        Properties prop = new Properties();
	        try {
	            prop.load(fileInput);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String strLength = prop.getProperty("length");
	        proLocators.lengthfield.sendKeys(strLength);
	    }

	    public void AddtoWishList() {
	    	proLocators.WishList.click();
	    }
	    public void ViewList() {
	    	proLocators.ViewWishList.click();
	    }
	    
	    public String getPriceText() {
	    	return proLocators.Producttext.getText();
	    }
	    
	    public void performPro() {
	    	clickProCategory();
	    	clickProduct();
	    	AddtoWishList();
	    	
	    }
}