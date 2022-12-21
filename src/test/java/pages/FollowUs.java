package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.ArrayList;

public class FollowUs {
    WebDriver driver;

    public FollowUs(WebDriver driver) {
        this.driver=driver;
    }
    public void Social_media_icon(String selector)
    {
        By FB_icon = By.cssSelector(selector);
        WebElement FB_icon_element = driver.findElement(FB_icon);
        FB_icon_element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }
    public void LINK_assertion(String E_URL){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String A_URL= driver.getCurrentUrl() ;
        System.out.println("tap1 :" + E_URL);
        Assert.assertEquals(A_URL,E_URL);


        
    }


}
