package by.it_academy.tafbugred.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage{
    public class WebDriverSingleton{
        public static WebDriver driver;

        public static WebDriver getInstance(){
            if(driver == null){
                driver = new ChromeDriver();
            }
            return driver;
        }
    }
}
