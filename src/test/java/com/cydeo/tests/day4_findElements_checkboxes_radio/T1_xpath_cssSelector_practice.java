package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

//        XPATH and CSS Selector PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)
//        a. “Home” link
        WebElement homeLink1_ex1 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink1_ex2 = driver.findElement(By.cssSelector("a[href='/']"));

//        b. “Forgot password” header
        WebElement forgotPasswordLink_ex1 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement forgotPasswordLink_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement forgotPasswordLink_ex3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


//        c. “E-mail” text
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel_ex2 = driver.findElement(By.xpath("//label[text()='E-mail']"));


//        d. E-mail input box
        WebElement emailInputBox_ex1 = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement emailInputBox_ex2 = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement emailInputBox_ex3 = driver.findElement(By.xpath("//input[contains(@pattern, '9._%+')]"));

//        e. “Retrieve password” button
        WebElement retrievePassword_ex1 = driver.findElement(By.cssSelector("button[class='radius']"));
        WebElement retrievePassword_ex2 = driver.findElement(By.xpath("//button[@type='submit']"));



//        f. “Powered by Cydeo text
        WebElement poweredByCydeoText_ex1 = driver.findElement(By.xpath("//div[text()='Powered by ']"));
        WebElement poweredByCydeoText_ex2 = driver.findElement(By.cssSelector("div[style='text-align: center;']"));


//        4. Verify all web elements are displayed.
        System.out.println("homeLink1_ex1.isDisplayed() = " + homeLink1_ex1.isDisplayed());
        System.out.println("forgotPasswordLink_ex1.isDisplayed() = " + forgotPasswordLink_ex1.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed() = " + emailLabel_ex1.isDisplayed());
        System.out.println("emailInputBox_ex1.isDisplayed() = " + emailInputBox_ex1.isDisplayed());
        System.out.println("retrievePassword_ex1.isDisplayed() = " + retrievePassword_ex1.isDisplayed());
        System.out.println("poweredByCydeoText_ex1.isDisplayed() = " + poweredByCydeoText_ex1.isDisplayed());
//        First solve the task with using cssSelector only. Try to create 2 different
//        cssSelector if possible
//
//        Then solve the task using XPATH only. Try to create 2 different
//        XPATH locator if possible








    }
}
