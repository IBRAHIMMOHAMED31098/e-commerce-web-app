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
import pages.hovering;
import static pages.hooks.driver;

public class HSD {

    hovering hove ;
    hooks hook  = new hooks();
    @BeforeTest
    @Given("user go to main  page")
    public void user_open_browser()
    {

        hook.OpenBrowser();
        hove = new hovering(driver);



    }
    @Test
    @When("hover on main category and select sub_category")
    public void Hovering_click()
    {
        hove.hovering();

    }
    @Then("directed to its page")
    public void assertion(){
        hove.hovering_assertion();
    }
    @AfterTest
    @Then("Close the browser")
    public void quit_browser() throws InterruptedException {
        hook.QuitBrowser();
    }
}
