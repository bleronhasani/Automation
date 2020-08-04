package com.tests;

import com.implementation.LoginImpl;
import com.openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends openBrowser
{
    private String email="testerthree@skipso.com";
    private String password=" TESTer3ree";
    private String optionName="Storage";
    private String dropdownName="Cherry Test";

    LoginImpl login;

    @Test
    public void testMethod() throws InterruptedException
    {
        login = new LoginImpl(element);

        login.loginUser(email, password);
        login.callFor();
//        login.chooseOption(optionName);
//        login.checkOption();
//        login.dropdown(dropdownName);
    }


}
