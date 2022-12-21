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
import pages.hooks;
import pages.wishlist;
import static pages.hooks.driver;

public class WSD {

    wishlist wl ;
    hooks hook  = new hooks();
    @BeforeTest
    @Given("user  go to main page")
    public void user_open_browser() throws InterruptedException {

        hook.OpenBrowser();
        wl = new wishlist(driver);

        Thread.sleep(1000);

    }
    @Test
    @When("user add item to wishlist")

    public void add_to_wishlist() throws InterruptedException {
        wl.click_wishlist_button();

        wl.wishlist_assertion();


    }
    @Then("wishlist counter should be incremented by 1")
    public void wishl_assertion() throws InterruptedException {


    }
    @Then("QUIT browser")
    public void quit_browser() throws InterruptedException {
        hook.QuitBrowser();
    }
}
