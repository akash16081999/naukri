package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final WebDriver driver;

    private final WebElement emailFied;
    private final WebElement passwordField;
    private final WebElement loginIntoHomeBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        emailFied = driver.findElement(By.xpath("(//form[@name='login-form']//input)[1]"));
        passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        loginIntoHomeBtn = driver.findElement(By.xpath("//button[@type='submit']"));

    }


    public void loginToAccount() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(emailFied));
        emailFied.sendKeys(System.getProperty("email"));
        passwordField.sendKeys(System.getProperty("password"));
        loginIntoHomeBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
