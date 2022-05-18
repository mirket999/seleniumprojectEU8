package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement userNameInput = driver.findElement(By.id("inputEmail"));
        userNameInput.sendKeys("demirel999@yahoo.com");
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("hsgsgdgdg123");
        Thread.sleep(2500);
        WebElement sigInButton = driver.findElement(By.tagName("button"));
        sigInButton.click();
        String actualText = driver.findElement(By.className("alert alert-danger")).getText();
        Thread.sleep(2500);
        String expectedText = "Sorry, Wrong Email or Password";
        Thread.sleep(2500);

        if (actualText.equals(expectedText)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }


    }
}
