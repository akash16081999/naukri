package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaukriEntryDashboardPage {
    WebDriver driver;
    private WebElement LoginBtn;

    public NaukriEntryDashboardPage(WebDriver driver) {
        this.driver = driver;
        LoginBtn = driver.findElement(By.xpath("//a[@title='Jobseeker Login']"));
    }

    public LoginPage openNaukriLoginSlide() {
        LoginBtn.click();
        return new LoginPage(driver);
    }
}
