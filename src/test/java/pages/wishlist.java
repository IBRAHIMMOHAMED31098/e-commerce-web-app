package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class wishlist {
    // <p class="content">The product has been added to your <a href="/wishlist">wishlist</a></p>
    WebDriver driver;

    public wishlist(WebDriver driver) {
        this.driver= driver;
    }
    public void click_wishlist_button(){
        By buttons = By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
        List<WebElement> wishlistbuttons = driver.findElements(buttons);
        wishlistbuttons.get(2).click();

    }
    public void wishlist_assertion() throws InterruptedException {



//        WebElement successBar = driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
//        Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed(),"success msg");


       // driver.findElement(By.cssSelector("span[title=\"Close\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement wishlist = driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(wishlist));
        driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]")).click();
        String count =   driver.findElement(By.className("qty-input")).getAttribute("value");

        int countint=    Integer.parseInt(count);

        Assert.assertTrue(countint>0);


    }

}
