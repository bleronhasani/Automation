package com.implementation;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.*;

public class LoginImpl {

    public By emailHolder = By.cssSelector("input[id = signin_username]");
    public By passwordHolder = By.cssSelector("input[id = signin_password]");
    public By loginBtn = By.xpath("//a[contains(@id, 'signin') and contains (.,' Login ')]");
    public By loginBtn2 = By.xpath("//button[contains(@id, 'submit-signin') and contains (.,'Log In')]");
    public By loggedin = By.cssSelector(".user-icon.d-inline-block.mat-button");
    public By optionHolder = By.cssSelector(".card-box-inner.ng-star-inserted");
    public By dropdownOption = By.cssSelector("ng-select.ng-select-single.ng-select-searchable.ng-select-clearable.ng-untouched.ng-pristine.ng-valid.ng-select-opened.ng-select-bottom");
    public By dropdownItem = By.cssSelector(".ng-option-item.ng-star-inserted");
    public By urlcall = By.cssSelector("a[href = /en/challenge/call-for-startups]");
    public By callforstart = By.xpath("//a[contains(@href, '/en/challenge/call-for-startups') and contains (//title,' Call for Startups ')]");
    public By idea = By.xpath("//a[contains(@href, '#') and contains (//title,' Ideas ')]");
    public By dropdown = By.cssSelector("#navbar-first > div.navbar-header.no-margin > div > div:nth-child(1) > span > span.selection > span");
    public By searchinput = By.cssSelector("input[class = select2-search__field]");
    public By searchinputcost = By.cssSelector("input[class = select2-search__field]");
    public By searchinputhuman = By.cssSelector("input[class = select2-search__field]");
    public By viewAllData = By.xpath("//*[@id=\"navbar-first\"]/div[1]/div/div[2]/span/span[1]/span");
    public By haPotenzial = By.xpath("/html/body/span/span/span[1]/input");
    public By scarsa = By.xpath("/html/body/span/span/span[1]/input");
    public By ottima = By.xpath("/html/body/span/span/span[1]/input");
    public By daRivedere = By.xpath("/html/body/span/span/span[1]/input");
    public By hasPotential = By.xpath("/html/body/span/span/span[1]/input");
    public By searchCallforstartupss = By.xpath("//*[@id=\"main-filters\"]/section/div/div[1]/div[1]/form/input");
    public By searchCallforstartupssecond = By.xpath("//*[@id=\"main-filters\"]/section/div/div[1]/div[1]/form/input");
    public By deletesearch = By.xpath("//*[@id=\"main-filters\"]/section/div/div[1]/div[1]/button/i");
    public By mostrecent = By.cssSelector("button[id = sort-by-date]");
    public By clickfavorite = By.xpath("//*[@id=\"idea_directory_list\"]/div[2]/article/header/div[2]");
    public By mostCommented = By.cssSelector("button[id=sort-by-date]");
    public By mostvoted =By.cssSelector("button[id=sort-by-votes]");
    public By clickFavoriteinvoted =By.cssSelector("button[id=sort-by-votes]");
    public By mostviewed =By.cssSelector("button[id=sort-by-views]");
    public By mostviewedFavoriteoption =By.xpath("//*[@id=\"idea_directory_list\"]/div[2]/article/header/div[2]/a/i");
    public By sortbyfavorite =By.cssSelector("button[id=sort-by-favourites]");
    public By sortbyvoted =By.cssSelector("button[id=sort-by-voted]");
    public By leaderbord =By.xpath("//*[@id=\"menu-leaderboard\"]/a");

    private String loggedinLink = "https://internal.eu-demo.skipsolabs.com/en/challenge";
    private String callForstart = "https://internal.eu-demo.skipsolabs.com/en/challenge";
    private String ruleslink = "https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups";
    private String idealink = "https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups/phase/stage-1-open-call-25";
    private String leaderboard = "https://internal.eu-demo.skipsolabs.com/en/leaderboard";
    WebDriver element;

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
        Thread.sleep(2000);

//        List<WebElement> loggedinUser = element.findElements(loggedin);
        assertTrue(element.getCurrentUrl().contains(loggedinLink), "link is not the same");
    }

    public void callFor()throws InterruptedException{
            element.findElement(By.xpath("//a[@href='/en/challenge/call-for-startups']")).click();
            Thread.sleep(1000);
            assertTrue(element.getCurrentUrl().contains(callForstart),"link fail");
    }
    public void rules()throws InterruptedException{
        element.findElement(By.cssSelector("#navbar-first > ul > li.active > a")).click();
        Thread.sleep(1000);
        assertTrue(element.getCurrentUrl().contains(ruleslink),"Link of rules");
    }
    public void Ideas()throws InterruptedException {
        element.findElement(By.cssSelector("#navbar-first > ul > li:nth-child(3) > a")).click();
        Thread.sleep(2000);
        assertTrue(element.getCurrentUrl().contains(idealink),"IDeas link");
    }
    public void dropdown()throws InterruptedException{
        element.findElement(dropdown).click();

    }
    public void productFeature(String ProductFeatures)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(searchinput).sendKeys(ProductFeatures);
        element.findElement(searchinput).sendKeys(Keys.ENTER);
    }
    public void costReduction(String CostReduction) throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(searchinputcost).clear();
        element.findElement(searchinputcost).sendKeys(CostReduction);
        element.findElement(searchinputcost).sendKeys(Keys.ENTER);
    }
    public void humanResources(String HumanResources) throws InterruptedException{
        Thread.sleep(10000);
        element.findElement(dropdown).click();
        element.findElement(searchinputhuman).clear();
        element.findElement(searchinputhuman).sendKeys(HumanResources);
        element.findElement(searchinputhuman).sendKeys(Keys.ENTER);
    }
    public void viewAllData()throws InterruptedException{
        element.findElement(viewAllData).click();

    }
    public void haPotenzial(String HAPotenziale) throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(haPotenzial).sendKeys(HAPotenziale);
        element.findElement(haPotenzial).sendKeys(Keys.ENTER);
    }
    public void scarsa(String Scarsa) throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(scarsa).clear();
        element.findElement(scarsa).sendKeys(Scarsa);
        element.findElement(haPotenzial).sendKeys(Keys.ENTER);
    }
    public void ottima(String Ottima)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(viewAllData).click();
        element.findElement(ottima).clear();
        element.findElement(ottima).sendKeys(Ottima);
        element.findElement(ottima).sendKeys(Keys.ENTER);
    }
    public void daRivedere(String DaRivedere)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(viewAllData).click();
        element.findElement(daRivedere).clear();
        element.findElement(daRivedere).sendKeys(DaRivedere);
        element.findElement(daRivedere).sendKeys(Keys.ENTER);
        element.findElement(viewAllData).click();
    }
//    SO KA BON PER ARSYJE QE SDI?
    public void hasPotential(String HasPotential)throws InterruptedException{
//        Thread.sleep(1000);
//        element.findElement(viewAllData).click();
//        Thread.sleep(2000);
//        element.findElement(hasPotential).clear();
//        element.findElement(hasPotential).sendKeys(HasPotential);
//        element.findElement(hasPotential).sendKeys(Keys.ENTER);
    }
    public void searchCallforstartupss(String searchCallforstartups)throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(searchCallforstartupss).sendKeys(searchCallforstartups);
        element.findElement(searchCallforstartupss).sendKeys(Keys.ENTER);
    }
    public void searchCallforstartupssecond(String SearchCallforstartupssecond)throws InterruptedException{
        element.findElement(searchCallforstartupssecond).clear();
        element.findElement(searchCallforstartupssecond).sendKeys(SearchCallforstartupssecond);
        element.findElement(searchCallforstartupssecond).sendKeys(Keys.ENTER);
    }
    public void deletesearch()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(deletesearch).click();

    }
    public void mostrecent()throws InterruptedException{
        element.findElement(mostrecent).click();
    }
    public void clickfavoriteicon()throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(clickfavorite).click();
    }
//DUHET ME SHTI N LOOP SE KA QELLU NI ID E NJEJT ME NI BUTTON TJETER
    public void mostcommented()throws InterruptedException{
//        Thread.sleep(1000);
//        element.findElement(mostCommented).click();
//        Thread.sleep(12000);
    }
    public void mostVoted()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(mostvoted).click();
    }
    public void mostVotedfavoriteSelection()throws InterruptedException{
        Thread.sleep(1000);
       element.findElement(clickFavoriteinvoted).click();
    }
    public void mostViewed()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(mostviewed).click();
    }
    public void mostViewedfavoriteoption()throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(mostviewedFavoriteoption).click();
    }

    public void sortByFavorite()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(sortbyfavorite).click();
    }
    public void sortByVote()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(sortbyvoted).click();
    }
    public void leaderBord()throws InterruptedException{
        element.findElement(leaderbord).click();
        Thread.sleep(1000);
        assertTrue(element.getCurrentUrl().contains(leaderboard), "link is not the same");
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

    public void checkOption()
    {
      try
      {
          new WebDriverWait(element, 60)
                  .until(ExpectedConditions.visibilityOf(element.findElement(By.cssSelector(".front-door-selection.ng-star-inserted"))));
      }
      catch(Exception e)
      {
          fail("User was not redirected to Storage");
      }

      assertTrue(element.getCurrentUrl().contains(loggedinLink), "link is not the same");

    }

    public void dropdown(String drowpdownName)
    {
        List<WebElement> options = element.findElements(dropdownOption);

        assertNotNull(options, "this is null");

        element.findElement(dropdownOption).click();

        List<WebElement> optionss = element.findElements(dropdownItem);

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
