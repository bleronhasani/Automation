package com.tests;

import com.implementation.LoginImpl;
import com.openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class test extends openBrowser
{
    private String email="buyer-admin";
    private String password="halili123";
    private String optionName="Storage";
    private String dropdownName="Cherry Test";

    LoginImpl login;

    @Test
    public void testMethod() throws InterruptedException
    {
        login = new LoginImpl(kushtrim);

        login.loginUser(email, password);
        login.chooseOption(optionName);
        login.checkOption();
        login.dropdown(dropdownName);
    }

}
