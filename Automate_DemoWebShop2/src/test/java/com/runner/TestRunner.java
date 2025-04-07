package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty",
		"json:target/cucumber-reports/CucumberHRM.json"},

         features={"src/test/resources/com/features/DemoWebLogin.feature",
         "src/test/resources/com/features/WishList.feature",
         "src/test/resources/com/features/Email.feature"},
         
         glue="com.Definitions1"
)
public class TestRunner extends AbstractTestNGCucumberTests{

}