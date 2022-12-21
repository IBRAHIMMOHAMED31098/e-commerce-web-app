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
import pages.currencies;
import pages.hooks;

import static pages.hooks.driver;

public class CSD {

    currencies cu ;
    hooks hook  = new hooks();
    @Given("user go to homepage")
    public void user_open_browser() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.navigate().to("https://demo.nopcommerce.com/");
        hook.OpenBrowser();
        cu = new currencies(driver);
        Thread.sleep(1000);

    }
    @When("user select euro")
    public void currency_selection() throws InterruptedException {
        cu.select_currency();


    }
    @Then("all currencies turn into euro")
    public void curr_assertion()
    {
        cu.curr_Asseration();
    }
    @Then("browser quit")
    public void quit_browser() throws InterruptedException {
        hook.QuitBrowser();
    }
}
