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
    private String ProductFeatures ="ProductFeatures";
    private String CostReduction ="Cost Reduction";
    private String HumanResources ="Human Resources";
    private String HAPotenziale ="HaPotenziale";
    private String Scarsa ="Scarsa";
    private String Ottima ="Ottima";
    private String DaRivedere ="DaRivedere";
    private String HasPotential ="HasPotential";
    private String SearchCallforstartups ="testerthree";
    private String SearchCallforstartupssecond ="tester";

    private String optionName="Storage";
    private String dropdownName="Cherry Test";

    LoginImpl login;

    @Test
    public void testMethod() throws InterruptedException
    {
        login = new LoginImpl(element);

        login.loginUser(email, password);
        login.callFor();
        login.rules();
        login.Ideas();
        login.dropdown();
        login.productFeature(ProductFeatures);
        login.costReduction(CostReduction);
        login.humanResources(HumanResources);
        login.viewAllData();
        login.haPotenzial(HAPotenziale);
        login.scarsa(Scarsa);
        login.ottima(Ottima);
        login.daRivedere(DaRivedere);
        login.hasPotential(HasPotential);
        login.searchCallforstartupss(SearchCallforstartups);
        login.searchCallforstartupssecond( SearchCallforstartupssecond);
        login.deletesearch();
        login.mostrecent();
        login.clickfavoriteicon();
        login.mostcommented();
        login.mostVoted();
        login.mostVotedfavoriteSelection();
        login.mostViewed();
        login.mostViewedfavoriteoption();
        login.sortByFavorite();
        login.sortByVote();
        login.leaderBord();
//        login.chooseOption(optionName);
//        login.checkOption();
//        login.dropdown(dropdownName);
    }


}
