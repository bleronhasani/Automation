package com.implementation;

<<<<<<< HEAD
import gherkin.lexer.Th;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import junit.framework.Assert;
=======
>>>>>>> 2832eebf7d55f78b78c75815eeb6ff044ff76856
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
<<<<<<< HEAD
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
    public By mostCommented = By.xpath("button[id=sort-by-date]");
    public By mostvoted =By.cssSelector("button[id=sort-by-votes]");
    public By clickFavoriteinvoted =By.cssSelector("button[id=sort-by-votes]");
    public By mostviewed =By.cssSelector("button[id=sort-by-views]");
    public By mostviewedFavoriteoption =By.xpath("//*[@id=\"idea_directory_list\"]/div[2]/article/header/div[2]/a/i");
    public By sortbyfavorite =By.cssSelector("button[id=sort-by-favourites]");
    public By sortbyvoted =By.cssSelector("button[id=sort-by-voted]");
    public By leaderbord =By.xpath("//*[@id=\"menu-leaderboard\"]/a");
    public By searchL =By.cssSelector("input[name=search]");
    public By alphabetical =By.cssSelector("button[title=Alphabetical]");
    public By Gobackcallforstartups =By.cssSelector("a[title=Back]");
    public By Submitproposal =By.cssSelector("a[id=submission_button]");
    public By Firstnameproposal =By.cssSelector("input[id=Form_custom_title]");
    public By Selectcategory =By.cssSelector("select[id=Form_ch_phase_track_id]");
    public By Selectcategoryoption =By.xpath("//*[@id=\"Form_ch_phase_track_id\"]/option[2]");
    public By SelectWhoAreYouParticipatingAs =By.cssSelector("label[layout=column1]");
    public By DescribeOther =By.cssSelector("input[id=Form_872]");
    public By Contributetfirstname =By.cssSelector("input[id=Form_458_1_first]");
    public By Contributetlastname =By.cssSelector("input[id=Form_458_1_last]");
    public By eontributetemail =By.cssSelector("input[id=Form_458_1_email_address]");
    public By newcontribute =By.cssSelector("a[id=add_button_Form_458_team]");
    public By NewContributetFirstName =By.xpath("//*[@id=\"Form_458_2_first\"]");
    public By NewContributetLastName =By.cssSelector("#Form_458_2_last");
    public By NewContributetEmail =By.xpath("//*[@id=\"Form_458_2_email_address\"]");
    public By TeamMemberSecondary =By.xpath("//*[@id=\"radio-918\"]/div[1]/div");
    public By EmailFirst =By.cssSelector("input[id=Form_916]");
    public By EmailSecond =By.cssSelector("input[id=Form_917]");
    public By MostImpactIdea =By.cssSelector("label[for=Form_448_762]");
    public By DescribeImpactbold =By.cssSelector("button[id=bold-1]");
    public By DescribeImpact =By.xpath("//*[@id=\"submission_form\"]/div[10]/div[2]/div/div[2]/div");
    public By DescribeImpactItalic =By.cssSelector("button[id=italic-1]");
    public By describeImpactUnderline =By.cssSelector("button[id=underline-1]");
    public By describeImpactStrikeTHrought =By.cssSelector("button[id=strikeThrough-1]");
    public By describeImpactStrikealigin =By.cssSelector("button[id=align-1]");
    public By describeImpactStrikealiginOption =By.cssSelector("#dropdown-menu-align-1 > div > div > ul > li:nth-child(2) > a > svg");
    public By UploadFile =By.xpath("//*[@id=\"cont-Form_455\"]/span/label");
    public By embedvideo =By.cssSelector("input[id=Form_482]");
    public By weBsite =By.cssSelector("input[id=Form_483_1]");
    public By AddweBsite =By.xpath("//*[@id=\"Form_483_team\"]/a");
    public By AddweBsitelink =By.xpath("//*[@id=\"Form_483_team\"]/div[2]/a");
    public By SUbmit =By.cssSelector("#submission_form_button_submit");
    public By payOFfline =By.xpath("//*[@id=\"offline\"]/header/p/a");
    public By paywithcard =By.cssSelector("button[id=stripe_button]");
    public By clicktestermenu =By.xpath("//*[@id=\"xtraoptions\"]/button");
    public By mysubmition =By.xpath("//*[@id=\"xtraoptions\"]/ul/li[9]/a");
    public By ActionsEdit =By.xpath("//*[@id=\"table_challenge_subs_1\"]/tbody/tr[1]/td[10]/div/button");
    public By View =By.xpath("//*[@id=\"table_challenge_subs_1\"]/tbody/tr[1]/td[10]/div/div/ul/li[1]/a");
    public By Commentpost =By.xpath("//*[@id=\"submission_preview_box_scores\"]/div/div[2]/button");
    public By CommentPost =By.xpath("//*[@id=\"comments-container\"]/div/div[1]/div/textarea");
    public By sendPost =By.cssSelector("#comments-container > div > div.sk-CommentCapture > div > button");
    public By EditPost =By.xpath("//a[contains(@href, '/en/challenge/call-for-startups/phase/stage-1-open-call-25/submission/ssssp-289') and contains (.,'Edit)]");
    public By DeletePost =By.xpath("//*[@id=\"table_challenge_subs_1\"]/tbody/tr[4]/td[10]/div/div/ul/li[3]/a");

    private String loggedinLink = "https://internal.eu-demo.skipsolabs.com/en/challenge";
    private String callForstart = "https://internal.eu-demo.skipsolabs.com/en/challenge";
    private String ruleslink = "https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups";
    private String idealink = "https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups/phase/stage-1-open-call-25";
    private String leaderboard = "https://internal.eu-demo.skipsolabs.com/en/leaderboard";
    private String proposalLink = "https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups/phase/stage-1-open-call-25/submission/326";
//    private String proposalLink = "https://internal.eu-demo.skipsolabs.com/en/challenge/call-for-startups/phase/stage-1-open-call-25/submission/304/step/1/1";
    private String paymentdetailslink = "https://internal.eu-demo.skipsolabs.com/en/payments/from/resume?slug=tester3-304&id=304";
    private String homelink = "https://internal.eu-demo.skipsolabs.com/en/";
    private String MySubmition = "https://internal.eu-demo.skipsolabs.com/en/profile/my/submissions";
=======
>>>>>>> 2832eebf7d55f78b78c75815eeb6ff044ff76856
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
        Thread.sleep(1000);
        element.findElement(loginBtn2).click();
        Thread.sleep(3000);

//        List<WebElement> loggedinUser = element.findElements(loggedin);
        assertTrue(element.getCurrentUrl().contains(loggedinLink), "link is not the same");
    }

<<<<<<< HEAD
    public void callFor()throws InterruptedException{
            element.findElement(By.xpath("//a[@href='/en/challenge/call-for-startups']")).click();
            Thread.sleep(1000);
            assertTrue(element.getCurrentUrl().contains(callForstart),"link fail");
=======
    public void callFor() throws InterruptedException {
        //        element.findElement(urlcall).click();
        element.findElement(By.xpath("//a[@href='/en/challenge/call-for-startups']")).click();
        Thread.sleep(1000);
        assertTrue(element.getCurrentUrl().contains(callForstart), "link fail");
>>>>>>> 2832eebf7d55f78b78c75815eeb6ff044ff76856
    }
    public void rules()throws InterruptedException{
        Thread.sleep(1000);
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
        Thread.sleep(1000);
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
        Thread.sleep(1000);
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
        Thread.sleep(3000);
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
    public void Alphabetical()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(alphabetical).click();
//        Thread.sleep(2000);
    }
    public void leaderBord()throws InterruptedException{
        element.findElement(leaderbord).click();
        Thread.sleep(1000);
        assertTrue(element.getCurrentUrl().contains(leaderboard), "link is not the same");
    }
//    searchleader
    public void searchLeader(String searchleader)throws InterruptedException{
        element.findElement(searchL).sendKeys(searchleader);
        element.findElement(searchL).sendKeys(Keys.ENTER);
    }

    public void backToCallForStartUps()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(Gobackcallforstartups).click();
    }
    public void submitProposal()throws InterruptedException{
      Thread.sleep(1000);
      element.findElement(Submitproposal).click();
//      Thread.sleep(2000);
//      assertTrue(element.getCurrentUrl().contains(proposalLink), "link is not the same");
    }
    public void nameProposal(String proposalName)throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(Firstnameproposal).sendKeys(proposalName);
    }
    public void selectCategoryProposal()throws InterruptedException{
        element.findElement(Selectcategory).click();
        Thread.sleep(1000);
        element.findElement(Selectcategoryoption).click();
    }
    public void selectWhoAreYouParticipatingAs()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(SelectWhoAreYouParticipatingAs).click();
//        assert element.isEnabled();Describeother
    }
    public void describeOther(String Describeother)throws InterruptedException{
        element.findElement(DescribeOther).sendKeys(Describeother);
    }
    public void contributetFirstName(String ContributetFirstName)throws InterruptedException{
        element.findElement(Contributetfirstname).sendKeys(ContributetFirstName);
    }
    public void contributetLastName(String ContributetLastName)throws InterruptedException{
        element.findElement(Contributetlastname).sendKeys(ContributetLastName);
    }
    public void contributetEmail(String ContributetEmail)throws InterruptedException{
        element.findElement(eontributetemail).sendKeys(ContributetEmail);
    }
    public void newContribute()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(newcontribute).click();
    }
    public void newContributetFirstName(String newcontributetFirstName)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(NewContributetFirstName).sendKeys(newcontributetFirstName);
    }
    public void newContributetLastName(String newcontributetLasttName) throws InterruptedException{
        element.findElement(NewContributetLastName).sendKeys(newcontributetLasttName);
    }
    public void newContributetEmail(String newContributetEmail) throws InterruptedException{
        element.findElement(NewContributetEmail).sendKeys(newContributetEmail);
    }
    public void teamMemberSecondary()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(TeamMemberSecondary).click();
    }
    public void emailFirst(String emailfirst)throws InterruptedException{
        element.findElement(EmailFirst).sendKeys(emailfirst);
    }
    public void emailSecond(String emailsecond)throws InterruptedException{
        element.findElement(EmailSecond).sendKeys(emailsecond);
    }
    public void IdeaImpact()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(MostImpactIdea).click();
    }
    public void describeImpactBold(String describeimpact)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(DescribeImpactbold).click();
        Thread.sleep(1000);
        element.findElement(DescribeImpact).sendKeys(describeimpact);
    }
    public void describeImpactitalic(String describeimpact)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(DescribeImpactItalic).click();
        Thread.sleep(1000);
        element.findElement(DescribeImpact).sendKeys(describeimpact);
    }
    public void describeImpactunderline(String describeimpact)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(describeImpactUnderline).click();
        Thread.sleep(1000);
        element.findElement(DescribeImpact).sendKeys(describeimpact);
    }
    public void  describeImpactStrikethrought(String describeimpact)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(describeImpactStrikeTHrought).click();
        Thread.sleep(1000);
        element.findElement(DescribeImpact).sendKeys(describeimpact);
    }
    public void  describeImpactStrikealigin()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(describeImpactStrikealigin).click();
        Thread.sleep(2000);
        element.findElement(describeImpactStrikealiginOption).click();
    }
    public void uploadFilePdf(String uploadfilepdf)throws InterruptedException{
//        Thread.sleep(1000);
//        element.findElement(UploadFile).click();
//        Thread.sleep(1000);
//        element.findElement(UploadFile).sendKeys(uploadfilepdf);
//        Thread.sleep(21000);
    }
    public void embedVideo(String EmbedVideo)throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(embedvideo).sendKeys(EmbedVideo);
    }
    public void website(String WEbsite)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(weBsite).sendKeys(WEbsite);
        element.findElement(weBsite).sendKeys(Keys.ENTER);
    }
    public void addwebsite(String WEbsite)throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(AddweBsite).click();
        element.findElement(AddweBsitelink).click();
    }
    public void submit()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(SUbmit).click();
//        assertTrue(element.getCurrentUrl().contains(paymentdetailslink),"Link of payment details");
    }
    public void payoffline()throws InterruptedException{
        element.findElement(payOFfline).click();
        assertTrue(element.getCurrentUrl().contains(homelink),"HomeLink");
}
    public void payWithCard()throws InterruptedException{
//            element.findElement(paywithcard).click();

    }
    public void clickTesterMenu()throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(clicktestermenu).click();
    }
    public void clickMySubmition()throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(mysubmition).click();
        assertTrue(element.getCurrentUrl().contains(MySubmition),"Link of payment details");
    }
    public void actionsView()throws InterruptedException{
        Thread.sleep(1000);
        element.findElement(ActionsEdit).click();
        element.findElement(View).click();
    }
    public void commentPost(String commentpost)throws InterruptedException{
        element.findElement(Commentpost).click();
        element.findElement(CommentPost).sendKeys(commentpost);
    }
    public void clickSend()throws InterruptedException{
        Thread.sleep(2000);
        element.findElement(sendPost).click();
    }
    public void gobackToSubmition()throws InterruptedException{
        Thread.sleep(1000);
        element.navigate().to("https://internal.eu-demo.skipsolabs.com/en/profile/my/submissions");
        Thread.sleep(33000);
    }
    public void editPost()throws InterruptedException{
//        Thread.sleep(1000);
//        element.findElement(ActionsEdit).click();
//        Thread.sleep(1000);
//        element.findElement(EditPost).click();
    }
    public void deletepost()throws InterruptedException{
//        Thread.sleep(1000);
//        element.findElement(ActionsEdit).click();
//        Thread.sleep(1000);
//        element.findElement(DeletePost).click();
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
