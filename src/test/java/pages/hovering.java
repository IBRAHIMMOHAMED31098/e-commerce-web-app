package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class hovering {
    WebDriver driver ;

    public hovering(WebDriver driver) {
        this.driver = driver;
    }
    public void hovering()
    {        Actions actions = new Actions(driver);
        By category_menu = By.cssSelector("a[href=\"/computers\"]");
        WebElement category_menu_element = driver.findElement(category_menu);
        actions.moveToElement(category_menu_element).perform();
       By sub_category = By.cssSelector("a[href=\"/desktops\"]");
       WebElement sub_category_menu= driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
       sub_category_menu.click();
    }
    public void hovering_assertion(){
        By tittle = By.cssSelector("div[class=\"page-title\"]");
        WebElement tittle_element = driver.findElement(tittle);
        System.out.println(tittle_element.getText().toLowerCase());
        tittle_element.getText().toLowerCase().trim();
    }

}
