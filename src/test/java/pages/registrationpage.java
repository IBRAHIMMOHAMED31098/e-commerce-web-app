package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class registrationpage {
    WebDriver driver ;

    public registrationpage(WebDriver driver) {

        this.driver = driver;


    }



//    Select select_day = new Select(driver.findElement(By.name("DateOfBirthDay")));
//    Select select_month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
//    Select select_year = new Select(driver.findElement(By.name("DateOfBirthYear")));

//    public void getSelect_day() {
//
//        select_day.selectByVisibleText("28");
//    }
//    public void getSelect_month() {
//
//        select_month.selectByVisibleText("September");
//    }
//    public void getSelect_year() {
//
//        select_year.selectByVisibleText("1998");
//    }



public WebElement get_gender_male(){
    By gender = By.id("gender-male");
    WebElement male_gender_element = driver.findElement(gender);
    return male_gender_element;

}
    public WebElement get_gender_female(){
        By gender = By.id("gender-female");
        WebElement female_gender_element = driver.findElement(gender);
        return female_gender_element;

    }
    public WebElement get_firstname(){
        By firstName = By.id("FirstName");
        WebElement firstName_element = driver.findElement(firstName);
        return firstName_element;

    }
    public WebElement get_lastname() {
        By lastName = By.id("LastName");
        WebElement lastName_element = driver.findElement(lastName);
        return lastName_element;

    }
    public WebElement get_Email() {
        By Email = By.id("Email");
        WebElement Email_element = driver.findElement(Email);
        return Email_element;
    }
    public WebElement get_company_name() {
        By company = By.id("Company");
        WebElement company_element = driver.findElement(company);
        return company_element;

    }
    public WebElement get_password() {
        By password = By.id("Password");
        WebElement password_element = driver.findElement(password);
        return password_element;
    }
    public WebElement get_confirm_password() {
        By password = By.id("ConfirmPassword");
        WebElement confirm_password_element = driver.findElement(password);
        return confirm_password_element;
    }
    public WebElement get_register_button() {
        By button = By.id("register-button");
        WebElement button_element = driver.findElement(button);
        return button_element;
    }
    public String success_registeration()
    { By success_msg= By.cssSelector("div[class=\"result\"]");
        WebElement msg_element= driver.findElement(success_msg);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(msg_element.getCssValue("color"),"rgba(76, 177, 124, 1)");
        System.out.println(msg_element.getCssValue("color"));
       String AR= msg_element.getText() ;
       soft.assertAll();
        return AR;
    }

    public void registration_steps(){
        get_gender_male().click();
        get_firstname().sendKeys("ibrahim");
        get_lastname().sendKeys("mohamed");
//        getSelect_day();
//        getSelect_month();
//        getSelect_year();
        get_Email().sendKeys("ib.mo.ak.13@gmail.com");
        get_company_name().sendKeys("udacity");
        get_password().sendKeys("123456789");
        get_confirm_password().sendKeys("123456789");
//        get_register_button().click();

    }


}
