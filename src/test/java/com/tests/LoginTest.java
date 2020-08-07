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
    private String searchleader ="Anna Siani";
    private String proposalName ="TESTER3a";
    private String Describeother ="Tests";
    private String ContributetFirstName ="TESTER";
    private String ContributetLastName ="ester";
    private String Email ="testerthree@skipso.com";
    private String newcontributetFirstName ="tester";
    private String newcontributetLastName ="ster";
    private String newContributetEmail ="testerthree@skipso.com";
    private String emailfirst ="testerthree@skipso.com";
    private String emailsecond ="testerthree@skipso.com";
    private String describeimpact ="Loren IPsumLoren Ipsum Loren Ipsum";
    private String uploadfilepdf ="src/test/java/com/uploadfile/uploadfile/pdf.pdf";
    private String EmbedVideo ="testerthreevideo";
    private String WEbsite ="https://www.youtube.com/watch?v=ZdAwiV4T22I";
    private String commentpost ="automationtest";

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
        login.Alphabetical();
        login.searchLeader(searchleader);
        login.backToCallForStartUps();
        login.submitProposal();
        login.nameProposal(proposalName);
        login.selectCategoryProposal();
        login.selectWhoAreYouParticipatingAs();
        login.describeOther(Describeother);
        login.contributetFirstName(ContributetFirstName);
        login.contributetLastName(ContributetLastName);
        login.contributetEmail(Email);
        login.newContribute();
        login.newContributetFirstName(newcontributetFirstName);
        login.newContributetLastName(newcontributetLastName);
        login.newContributetEmail(newContributetEmail);
        login.teamMemberSecondary();
        login.emailFirst(emailfirst);
        login.emailSecond(emailsecond);
        login.IdeaImpact();
        login.describeImpactBold(describeimpact);
        login.describeImpactitalic(describeimpact);
        login.describeImpactunderline(describeimpact);
        login.describeImpactStrikethrought(describeimpact);
        login.describeImpactStrikealigin();
        login.uploadFilePdf(uploadfilepdf);
        login.embedVideo(EmbedVideo);
        login.website(WEbsite);
        login.addwebsite(WEbsite);
        login.submit();
//        login.payoffline();
//        login.payWithCard();
        login.clickTesterMenu();
        login.clickMySubmition();
        login.actionsView();
        login.commentPost(commentpost);
        login.clickSend();
        login.gobackToSubmition();
        login.editPost();
        login.deletepost();

//        login.chooseOption(optionName);
//        login.checkOption();
//        login.dropdown(dropdownName);
    }


}
