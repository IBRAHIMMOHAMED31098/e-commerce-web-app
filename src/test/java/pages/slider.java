package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class slider {
    WebDriver driver ;

    public slider(WebDriver driver) {
        this.driver = driver;
    }
    public void sl1() throws InterruptedException {
        By slider =By.cssSelector("a[rel=\"0\"]");
        WebElement slider_element = driver.findElement(slider);
        By img = By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[\"1\"]");
        WebElement img_element= driver.findElement(img);
        //slider_element.click();
        Thread.sleep(1000);
        img_element.click();
    }
    public void sl2() throws InterruptedException {
        By slider =By.cssSelector("a[rel=\"1\"]");
        WebElement slider_element = driver.findElement(slider);
        By img = By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[\"2\"]");
        WebElement img_element= driver.findElement(img);
        //slider_element.click();
        Thread.sleep(1000);
        img_element.click();
    }
    public void sl1_assertion() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","1st url");
    }
    public void sl2_assertion() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","2nd url");
    }
}
