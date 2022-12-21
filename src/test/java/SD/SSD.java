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
import pages.search;
import static pages.hooks.driver;

public class SSD {

    search sea ;
    hooks hook  = new hooks();
    @Given("User navigate to main page")
    @BeforeTest
    public void user_open_browser()
    {
//
        hook.OpenBrowser();
        sea = new search(driver);



    }
    @When("^he enters the products names \"(.*)\" and click search$")
    public void Search_By_Name(String product_name)
    {
       sea.search_by_name_steps(product_name);
    }
    @Then("^user should find the \"(.*)\"$")
    public void search_assertion(String product_name)
    {
        sea.search_Asseration(product_name);
        System.out.println(sea.search_Asseration(product_name).size());
    }
    @Then("^user enter the product sku \"(.*)\" and press search$")
    public void search_by_sku(String sKu)
    {
        sea.search_by_sKu_steps(sKu);
    }
    @Then("^user should find the product \"(.*)\"$")
    public void sku_asseration(String P_sku)
    {
        sea.search_sku_asseration( P_sku) ;
    }
    @Then("quit browser")

    public void quit_browser() throws InterruptedException {
        hook.QuitBrowser();
    }



}
