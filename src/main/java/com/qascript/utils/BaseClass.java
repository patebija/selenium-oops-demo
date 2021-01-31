package com.qascript.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Function;

public class BaseClass {

    public static WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://dbankdemo.com/login");
        //driver.get("http://dbankdemo.com/signup");
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.quit();
    }

    public void verifyTextInPage(WebElement element,String expectedText){
        String actualText = element.getText();
        Assert.assertTrue("Welcome message is not displayed",expectedText.contains(actualText));

    }




}
