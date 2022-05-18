package com.cydeo.tests.day2_locators_getText_getAttribute.practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {
//        TC #3: Back and forth navigation
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com
        driver.get("https://google.com");
        Thread.sleep(2500);

//        3- Click to Gmail from top right.
       WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

      // Second alternative to locate this web element by className:
       // WebElement gmailLink = driver.findElement(By.className("gb_d"));



//        4- Verify title contains:
//        Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification PASSED");
        }


//        5- Go back to Google by using the .back();
        driver.navigate().back();

//        6- Verify title equals:
//        Expected: Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        } else {
            System.out.println("Title Verification FAILED!");
        }




    }
}

