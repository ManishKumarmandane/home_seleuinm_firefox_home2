package WebDriverFireFox.W;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AFirefox
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.gecko.driver","C:/Software/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        //driver.
       // driver.close();
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource());
        //System.out.println(driver.manage());
  // driver.quit();
  // driver.navigate();
     //   driver.close();






    }
}
