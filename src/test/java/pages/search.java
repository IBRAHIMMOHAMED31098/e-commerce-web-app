package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class search {
    WebDriver driver;
    public search(WebDriver driver) {
        this.driver= driver ;

    }
    public void search_by_name_steps(String product_name)
    {
        By search_bar = By.id("small-searchterms");
        WebElement search_bar_element = driver.findElement(search_bar);
        search_bar_element.sendKeys(product_name);
        search_bar_element.sendKeys(Keys.ENTER);
    }
    public void search_by_sKu_steps(String sKu)
    {
        By search_bar = By.id("small-searchterms");

        WebElement search_bar_element = driver.findElement(search_bar);
        search_bar_element.sendKeys(sKu);
        search_bar_element.sendKeys(Keys.ENTER);
        By item_img= By.cssSelector(" img[alt=\"Picture of Build your own computer\"]");
        WebElement item_img_element = driver.findElement(item_img);
         item_img_element.click();
    }
    public List<WebElement> search_Asseration(String product_name)
    {
        By PN = By.cssSelector("h2[class=\"product-title\"]");
        List<WebElement> items = driver.findElements(PN);
        SoftAssert soft = new SoftAssert();
        int i = 0 ;
        for(WebElement j : items)
        {

            String AR =items.get(i).getText().toLowerCase();
            String ER = product_name;
            soft.assertTrue(AR.contains(ER),"1st true");
            i++;

        }

        String A_URL = driver.getCurrentUrl();
        String E_URL= "https://demo.nopcommerce.com/search?q=";
        soft.assertTrue(A_URL.contains(E_URL),"1st true");
        soft.assertAll();

        return items;

    }
    public void search_sku_asseration(String P_sku)
    {
//        By item_img= By.cssSelector(" img[alt=\"Picture of Build your own computer\"]");
//        WebElement item_img_element = driver.findElement(item_img);
//        item_img_element.click();
        By p_sku =By.id("sku-1");
        WebElement item = driver.findElement(p_sku);
        String A_sku = item.getText();
        String E_sku = P_sku;
        Assert.assertEquals(A_sku,E_sku);
    }

}
