package com;

import com.initialize.InitializeUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class openBrowser
{
    InitializeUser browser = new InitializeUser();
    public WebDriver kushtrim;

    @BeforeMethod
    public void openChrome()
    {
        kushtrim = browser.initializeInstance();

        kushtrim.get("https://dev.app.ucxmarket.com");

        System.out.println("------- Opening Browser -------");
    }

    @AfterMethod
    public void cleanUp()
    {
        kushtrim.quit();
    }

}
