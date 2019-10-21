package com.implementation;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.*;

public class LoginImpl {
    public By emailHolder = By.cssSelector("input[formcontrolname = username]");
    public By passwordHolder = By.cssSelector("input[formcontrolname = password]");
    public By loginBtn = By.cssSelector(".loading.g-spinner-button.mat-raised-button.w-100.mat-primary");
    public By loggedin = By.cssSelector(".user-icon.d-inline-block.mat-button");
    public By optionHolder = By.cssSelector(".card-box-inner.ng-star-inserted");
    public By dropdownOption = By.cssSelector("ng-select.ng-select-single.ng-select-searchable.ng-select-clearable.ng-untouched.ng-pristine.ng-valid.ng-select-opened.ng-select-bottom");
    public By dropdownItem = By.cssSelector(".ng-option-item.ng-star-inserted");


    private String storageLink = "https://dev.shop.ucxmarket.com/product/search?category=Storage";

    WebDriver kushtrim;

    //Class Constructor
    public LoginImpl(WebDriver kushtrim) {
        this.kushtrim = kushtrim;
    }

    public void loginUser(String email, String password) throws InterruptedException {
        kushtrim.findElement(emailHolder).sendKeys(email);
        Thread.sleep(1000);
        kushtrim.findElement(passwordHolder).sendKeys(password);
        Thread.sleep(1000);
        kushtrim.findElement(loginBtn).click();

        List<WebElement> loggedinUser = kushtrim.findElements(loggedin);
        assertNotNull(loggedinUser, "User was not logged in!");

    }

    public void chooseOption(String optionName) {
        List<WebElement> options = kushtrim.findElements(optionHolder);

        for (WebElement option : options) {
            String name = option.findElement(By.tagName("h4")).getText();
            if (name.equalsIgnoreCase(optionName)) {
                option.click();
                break;
            }
        }
    }

    public void checkOption()
    {
      try
      {
          new WebDriverWait(kushtrim, 60)
                  .until(ExpectedConditions.visibilityOf(kushtrim.findElement(By.cssSelector(".front-door-selection.ng-star-inserted"))));
      }
      catch(Exception e)
      {
          fail("User was not redirected to Storage");
      }

      assertTrue(kushtrim.getCurrentUrl().contains(storageLink), "link is not the same");

    }

    public void dropdown(String drowpdownName)
    {
        List<WebElement> options = kushtrim.findElements(dropdownOption);

        assertNotNull(options, "this is null");

        kushtrim.findElement(dropdownOption).click();

        List<WebElement> optionss = kushtrim.findElements(dropdownItem);

        for(WebElement option :optionss)
        {
            String name = option.getText();
            if (name.equalsIgnoreCase(drowpdownName)){
                option.click();
                break;
            }
        }


    }
}
