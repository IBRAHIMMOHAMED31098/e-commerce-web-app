package SD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FollowUs;
import pages.hooks;

import static pages.hooks.driver;

public class FSD {

    FollowUs follow ;
    hooks hook  = new hooks();
    @BeforeTest
    @Given("user go to main page1")
    public void user_open_browser() throws InterruptedException {
//
        hook.OpenBrowser();
        follow = new FollowUs(driver);

        Thread.sleep(1000);

    }
    @Test
    @When("^user click on facebook icon \"(.*)\"$")
    public void follow_us_on_facebook(String selector){
        follow.Social_media_icon(selector);
        System.out.println(selector);


    }
    @Then("^user directed to facebook \"(.*)\"$")
    public void get_facebook_link(String E_URL){
        follow.LINK_assertion(E_URL);

    }
    @Then("^user click on twitter icon \"(.*)\"$")
    public void follow_us_on_twitter(String selector){
        follow.Social_media_icon(selector);

    }
    @Then("^user directed to twitter \"(.*)\"$")
    public void get_twitter_link(String E_URL){
        follow.LINK_assertion(E_URL);

    }
    @Then("^user click on youtube icon \"(.*)\"$")
    public void follow_us_on_youtube(String selector){
        follow.Social_media_icon(selector);

    }
    @Then("^user directed to youtube \"(.*)\"$")
    public void get_youtube_link(String E_URL){
        follow.LINK_assertion(E_URL);

    }
    @Then("^user click on rss icon \"(.*)\"$")
    public void follow_us_on_rss(String selector){
        follow.Social_media_icon(selector);

    }
    @Then("^user directed to rss \"(.*)\"$")
    public void get_rss_link(String E_URL){
        follow.LINK_assertion(E_URL);

    }
    @AfterTest
    @Then("close bowser")
    public void quit_browser() throws InterruptedException {
       hook.QuitBrowser();
    }
}
