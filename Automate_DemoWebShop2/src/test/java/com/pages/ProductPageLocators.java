package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageLocators {
	
	@FindBy(xpath="//ul[@class=\"list\"]/li[6]/a")
	public WebElement jewelry; 
	
	@FindBy(xpath="//a[contains(text(),\"Create Your Own Jewelry\")]")
	public WebElement product;
	
	@FindBy(xpath="//input[@name=\"product_attribute_71_10_16\"]")
	public WebElement lengthfield;
	
	@FindBy(xpath="//input[@id=\"add-to-wishlist-button-71\"]")
	public WebElement WishList;

	@FindBy(xpath="//a[@class=\"ico-wishlist\"]//span[1]")
	public WebElement ViewWishList;
	
	@FindBy(xpath="//div[@class=\"attributes\"]")
	public WebElement Producttext;

}