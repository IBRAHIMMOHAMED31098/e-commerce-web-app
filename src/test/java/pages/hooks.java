package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
  public static WebDriver driver  ;



    public void OpenBrowser(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

   }
   public void QuitBrowser() throws InterruptedException {
       Thread.sleep(1000);
       driver.quit();
   }
}
