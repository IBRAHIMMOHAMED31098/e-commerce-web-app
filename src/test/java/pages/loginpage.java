package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;


public class loginpage {
    WebDriver driver;

    public loginpage(WebDriver driver) {
        this.driver= driver;

    }
    // log in page
public  WebElement get_login_button()
{
    By login_button = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    WebElement login_button_element = driver.findElement(login_button);
    return login_button_element;
}
    public WebElement get_Email() {
        By Email = By.id("Email");
        WebElement Email_element = driver.findElement(Email);
        return Email_element;
    }
    public WebElement get_password() {
        By password = By.id("Password");
        WebElement password_element = driver.findElement(password);
        return password_element;
    }
    public  WebElement get_LOGIN_button()
    {
        By LOGIN_button = By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement LOGIN_button_element = driver.findElement(LOGIN_button);
        return LOGIN_button_element;
    }
    public String success_login()
    { String URL = driver.getCurrentUrl();

        return URL;
    }
    public void failure_login(){
        SoftAssert soft = new SoftAssert();
        By ERROR_msg = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        soft.assertEquals(Color.fromString(driver.findElement(ERROR_msg).getCssValue("color")).asHex(),"#e4434b");
        soft.assertAll();
    }
    public void login_steps(String email, String password)
    {
        get_login_button().click();
        get_Email().sendKeys(email);
        get_password().sendKeys(password);
        get_LOGIN_button().click();

    }
    // log in button



}
