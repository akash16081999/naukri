package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NaukriEntryDashboardPage {
    WebDriver driver;
    private WebElement LoginBtn;

    public NaukriEntryDashboardPage(WebDriver driver) {
        this.driver = driver;
        LoginBtn = driver.findElement(By.xpath("//a[@title='Jobseeker Login']"));
    }

    public LoginPage openNaukriLoginSlide() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(LoginBtn));
        LoginBtn.click();
        return new LoginPage(driver);
    }
}
