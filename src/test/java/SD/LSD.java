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
import pages.loginpage;
import org.openqa.selenium.support.Color;
import static pages.hooks.driver;


public class LSD {

    loginpage login ;
    hooks hook  = new hooks();
    @Given("user navigate to homepage")
    public void user_open_browser()
    {

        hook.OpenBrowser();
        login = new loginpage(driver);


    }
    @When("^user enter\"(.*)\" and \"(.*)\"$")
    public void login(String username,String password)

    {
        login.login_steps(username,password);

    }
    @Then("user should login successfully")
    public void Assert_successful_login ()
    {


        SoftAssert soft = new SoftAssert();
        String AR= login.success_login();
        String ER="https://demo.nopcommerce.com/";
        System.out.println(AR);
        soft.assertEquals(AR,ER);
        soft.assertTrue(driver.findElement(By.cssSelector("a[href=\"/customer/info\"]")).isDisplayed());

        soft.assertAll();
    }
    @Then("user should fail to login")
    public void failure_login_assertion(){
        login.failure_login();
    }
    @Then("browser should be closed")
    public void quit_browser() throws InterruptedException {
        hook.QuitBrowser();
    }

}
