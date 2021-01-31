package com.qascript.pageObjects;

import com.qascript.utils.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    private static String txtUsername = "username";
    private static String txtPassword = "password";
    private static String btnLogin = "submit";
    private static String lblWelcome = "//*[@class='breadcrumb text-right']/li";

    public static void enterUsername(String value){
        driver.findElement(By.id(txtUsername)).sendKeys(value);
    }

    public static void enterPassword(String value){
        driver.findElement(By.id(txtPassword)).sendKeys(value);
    }

    public static void clickSubmit(){
        driver.findElement(By.id(btnLogin)).click();
    }

    public void verifyWelcomePage(String text){
        verifyTextInPage(driver.findElement(By.xpath(lblWelcome)), text);
    }


    @Override
    public void verifyTextInPage(WebElement element,String expectedText){
        String actualText = element.getText();
        Assert.assertTrue("Welcome message is not displayed",expectedText.equals(actualText));

    }



}
