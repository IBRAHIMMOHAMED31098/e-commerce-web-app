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
import pages.hooks;
import pages.registrationpage;
import org.testng.asserts.SoftAssert;
import static pages.hooks.driver;


public class RSD {

    registrationpage reg ;
    hooks hook  = new hooks();
    @Given("user navigate to registration page")

public void user_open_browser()
    {

        hook.OpenBrowser();
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
       reg = new registrationpage(driver);


    }
@When("user enter valid reg data and press enter")
public void register()
{


    reg.registration_steps();
    Select select_day = new Select(driver.findElement(By.name("DateOfBirthDay")));
    Select select_month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    Select select_year = new Select(driver.findElement(By.name("DateOfBirthYear")));

    select_day.selectByVisibleText("28");
    select_month.selectByVisibleText("September");
    select_year.selectByVisibleText("1998");
    reg.get_register_button().click();


}
@Then("user should register successfully")
public void Assert_registration()

{
    String AR ;
    String ER ="Your registration completed";
    //https://demo.nopcommerce.com/registerresult/1?returnUrl=/
    AR = reg.success_registeration();
    System.out.println(AR);
    Assert.assertEquals(AR,ER);

}
@Then("the browser should be closed")
public void quit_driver() throws InterruptedException {   hook.QuitBrowser();
}

}
