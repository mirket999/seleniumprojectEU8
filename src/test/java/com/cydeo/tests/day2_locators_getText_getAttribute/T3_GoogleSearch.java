package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        WebElement googleSearchBar = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        googleSearchBar.sendKeys("apple" + Keys.ENTER);
        Thread.sleep(2500);
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith("apple")){
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
        }

        driver.close();

    }
}
