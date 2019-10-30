package com.testing.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "classpath:features",
        glue = "classpath:com.testing.testing.steps",
        strict = true )




public class Runner {

    @BeforeClass
    public static void startWebDriver(){
        System.out.println("Test Initiated");

    }


    @AfterClass
    public static void stopWebDriver(){
        System.out.println("Test Complete");

    }


}
