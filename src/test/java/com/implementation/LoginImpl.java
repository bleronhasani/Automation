package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.*;

public class LoginImpl {

    public By emailHolder = By.cssSelector("input[id = signin_username]");
    public By passwordHolder = By.cssSelector("input[id = signin_password]");
    public By urlcall = By.cssSelector("a[href = /en/challenge/call-for-startups]");
    public By callforstart = By.xpath("//a[contains(@href, '/en/challenge/call-for-startups') and contains (//title,' Call for Startups ')]");
    public By loginBtn = By.xpath("//a[contains(@id, 'signin') and contains (.,' Login ')]");
    public By loginBtn2 = By.xpath("//button[contains(@id, 'submit-signin') and contains (.,'Log In')]");
    public By loggedin = By.cssSelector(".user-icon.d-inline-block.mat-button");
    public By optionHolder = By.cssSelector(".card-box-inner.ng-star-inserted");
    public By dropdownOption = By.cssSelector("ng-select.ng-select-single.ng-select-searchable.ng-select-clearable.ng-untouched.ng-pristine.ng-valid.ng-select-opened.ng-select-bottom");
    public By dropdownItem = By.cssSelector(".ng-option-item.ng-star-inserted");
    WebDriver element;
    private final String loggedinLink = "https://internal.eu-demo.skipsolabs.com/en/challenge";
    private final String callForstart = "https://internal.eu-demo.skipsolabs.com/en/challenge";

    //Class Constructor
    public LoginImpl(WebDriver element) {
        this.element = element;
    }

    public void loginUser(String email, String password) throws InterruptedException {
        element.findElement(loginBtn).click();
        Thread.sleep(1000);
        element.findElement(emailHolder).sendKeys(email);
        Thread.sleep(1000);
        element.findElement(passwordHolder).sendKeys(password);
        element.findElement(loginBtn2).click();
        Thread.sleep(1000);

//        List<WebElement> loggedinUser = element.findElements(loggedin);
        assertTrue(element.getCurrentUrl().contains(loggedinLink), "link is not the same");
    }

    public void callFor() throws InterruptedException {
        //        element.findElement(urlcall).click();
        element.findElement(By.xpath("//a[@href='/en/challenge/call-for-startups']")).click();
        Thread.sleep(1000);
        assertTrue(element.getCurrentUrl().contains(callForstart), "link fail");
    }

    public void chooseOption(String optionName) {
        List<WebElement> options = element.findElements(optionHolder);

        for (WebElement option : options) {
            String name = option.findElement(By.tagName("h4")).getText();
            if (name.equalsIgnoreCase(optionName)) {
                option.click();
                break;
            }
        }
    }

    public void checkOption() {
        try {
            new WebDriverWait(element, 60)
                    .until(ExpectedConditions.visibilityOf(element.findElement(By.cssSelector(".front-door-selection.ng-star-inserted"))));
        } catch (Exception e) {
            fail("User was not redirected to Storage");
        }

        assertTrue(element.getCurrentUrl().contains(loggedinLink), "link is not the same");

    }

    public void dropdown(String drowpdownName) {
        List<WebElement> options = element.findElements(dropdownOption);

        assertNotNull(options, "this is null");

        element.findElement(dropdownOption).click();

        List<WebElement> optionss = element.findElements(dropdownItem);

        for (WebElement option : optionss) {
            String name = option.getText();
            if (name.equalsIgnoreCase(drowpdownName)) {
                option.click();
                break;
            }
        }


    }
}
