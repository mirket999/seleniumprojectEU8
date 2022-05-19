package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {
//        open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        go to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");


//        then click on "forgot_password" link
        WebElement forgotPasswordLink = driver.findElement(By.cssSelector("a[href='/forgot_password']"));
        forgotPasswordLink.click();


//        enter any email
        WebElement enterMailBox = driver.findElement(By.xpath("//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\"]"));
        //WebElement enterMailBox = driver.findElement(By.tagName("input"));
        enterMailBox.sendKeys("demirel9999@yahoo.com");


//        verify that email is displayed in the input box
        String actualMail = enterMailBox.getAttribute("value");
        String expectedMail = "demirel9999@yahoo.com";
        System.out.println("actualMail = " + actualMail);
        WebDriverFactory.actualVsExpectedEquals(actualMail, expectedMail, "Mail Text");

//        click on Retrieve password
        WebElement retrieveButton = driver.findElement(By.xpath("//i[contains(@class, icon-2x)]"));
        retrieveButton.click();

//        verify that confirmation message says 'Your e-mail's been sent!'
        WebElement confirmationMessage = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        String expectedConfirmationMessage = "Your e-mail's been sent!";
        String actualConfirmationMessage = confirmationMessage.getText();
        WebDriverFactory.actualVsExpectedEquals(actualConfirmationMessage, expectedConfirmationMessage, "Confirmation Message");

    }
}
