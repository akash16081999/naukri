package com.qa.base;

import com.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private WebDriver driver;
    private static WebDriver dr;

    public void initDriver() {
        String browser = System.getProperty("browser");
        System.out.println("Enter :" + browser);

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            dr = driver;

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        }else{
            try {
                throw new Exception("no browser found with given argument :" +browser);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        driver.manage().window().maximize();
        driver.get(System.getProperty("url"));

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        System.out.println(driver + " " + "/n" + dr);

    }


    public WebDriver getDriver() {
        return driver;
    }

    public static WebDriver getDr() {
        return dr;
    }
}
