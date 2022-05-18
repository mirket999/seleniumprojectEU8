package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));

        //Expected: Registration form

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text Verification is PASSED!");
        } else {
            System.out.println("Header Text Verification is FAILED!");

        }

        //4- Locate “First name” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value

        WebElement firstNameInputBox = driver.findElement(By.name("firstname"));
        String actualPlaceHolder = firstNameInputBox.getAttribute("placeholder");
        String expectedPlaceHolder = "first name";



        /* WE CAN ALSO USE BOOLEAN TO VERIFY REQUIREMENT:
        boolean doesPlaceHolderMatch = driver.findElement(By.name("firstname")).getAttribute("placeholder").equals(expectedPlaceHolder);
        System.out.println("doesPlaceHolderMatch = " + doesPlaceHolderMatch);
        */

        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Place Holder Verification is PASSED!");
        } else {
            System.out.println("Place Holder Verification is FAILED!");
        }
driver.close();

    }
}
