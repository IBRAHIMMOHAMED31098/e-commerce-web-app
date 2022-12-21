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
import pages.slider;
import static pages.hooks.driver;

public class SliderSD {

    slider sd ;
    hooks hook  = new hooks();
   // @Given( "go to home page")
    @BeforeTest
    @Given("go to home page")
    public void user_open_browser()
    {

        hook.OpenBrowser();
        sd = new slider(driver);


    }
    @When("select 1st slider")
    @Test
    public void SlIDER1() throws InterruptedException {
        sd.sl1();

    }
    @Then("1st product diplayed")
    public void slider1_assertion() throws InterruptedException {
        sd.sl1_assertion();
    }
    @Then("select 2nd slider")
    @Test(priority = 1)
    public void SlIDER2() throws InterruptedException {
        sd.sl2();

    }
    @Then("2nd product diplayed")
    @Test
    public void slider2_assertion() throws InterruptedException {
        sd.sl2_assertion();
    }




//@Then("quit_browser")
    @AfterTest
    @Then("quit_browser")
    public void quit_browser() throws InterruptedException {
        hook.QuitBrowser();
    }

}
