package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class currencies {
    WebDriver driver ;

    public currencies(WebDriver driver) {
        this.driver= driver ;
    }
    public void select_currency()


        {
            Select select_currency = new Select(driver.findElement(By.name("customerCurrency")));
            select_currency.selectByVisibleText("Euro");
        }
        public List<WebElement> curr_Asseration()
        {
            By IC = By.xpath("//span[@class=\"price actual-price\"]");
            List<WebElement> items_curr = driver.findElements(IC);
            SoftAssert soft = new SoftAssert();
            int i = 0 ;
            for(WebElement j : items_curr)
            {
                System.out.println(j.getText());
                String AR =items_curr.get(i).getText();
                String ER = "€";
                soft.assertTrue(AR.contains(ER),"1st true");
                i++;

            }
            soft.assertAll();
            return items_curr;

        }



}
