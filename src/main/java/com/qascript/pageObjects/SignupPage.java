package com.qascript.pageObjects;

import com.qascript.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BaseClass {

    private static String ddTitle = "title";
    private static String txtFirstName = "firstName";
    private static String txtLastName = "lastName";
    private static String rbGender = "(//*[@id='gender'])[1]";
    private static String txtSsn = "ssn";
    private static String txtDob = "dob";
    private static String txtEmail = "emailAddress";
    private static String txtPassword = "password";
    private static String txtConfirmPassword = "confirmPassword";
    private static String btnSubmit = "//*[text()='Next']";

    public static void selectTitle(String title){
        WebElement element = driver.findElement(By.id(ddTitle));
        Select select = new Select(element);
        select.selectByVisibleText(title);
    }

    public static void selectTitle(int index){
        WebElement element = driver.findElement(By.id(ddTitle));
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void enterFirstName(String value){
        driver.findElement(By.id(txtFirstName)).sendKeys(value);
    }

    public static void enterLastName(String value){
        driver.findElement(By.id(txtLastName)).sendKeys(value);
    }

    public static void enterSsn(String value){
        driver.findElement(By.id(txtSsn)).sendKeys(value);
    }

    public static void enterDob(String value){
        driver.findElement(By.id(txtDob)).sendKeys(value);
    }
    public static void enterEmail(String value){
        driver.findElement(By.id(txtEmail)).sendKeys(value);
    }
    public static void enterPassword(String value){
        driver.findElement(By.id(txtPassword)).sendKeys(value);
    }
    public static void enterConfirmPassword(String value){
        driver.findElement(By.id(txtConfirmPassword)).sendKeys(value);
    }

    public static void selectGender(){
        driver.findElement(By.xpath(rbGender)).click();
    }

    public static void clickSubmit(){
        driver.findElement(By.xpath(btnSubmit)).click();
    }




}
