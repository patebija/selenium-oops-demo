package com.qascript;

import com.qascript.pageObjects.LoginPage;
import com.qascript.pageObjects.SignupPage;
import com.qascript.utils.BaseClass;
import org.junit.Test;

public class FirstTest extends BaseClass {

    @Test
    public void signup(){
        SignupPage.selectTitle("Mr.");
        SignupPage.selectTitle(1);
        SignupPage.enterFirstName("QA");
        SignupPage.enterLastName("Script");
        SignupPage.selectGender();
        SignupPage.enterSsn("123-23-7867");
        SignupPage.enterDob("01/01/1980");
        SignupPage.enterEmail("qascript20@gmail.com");
        SignupPage.enterPassword("Qascript@123");
        SignupPage.enterConfirmPassword("Qascript@123");
        SignupPage.clickSubmit();
    }

    @Test
    public void login(){
        LoginPage.enterUsername("qascript20@gmail.com");
        LoginPage.enterPassword("Qascript@123");
        LoginPage.clickSubmit();

        LoginPage loginPage = new LoginPage();
        loginPage.verifyWelcomePage("Bijan");
    }
}
