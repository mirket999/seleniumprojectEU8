package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        WebElement rememberMeCheckBox = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedLabel = "Remember me on this computer";
        String actualLabel = rememberMeCheckBox.getText();
        System.out.println("expectedLabel = " + expectedLabel);
        System.out.println("actualLabel = " + actualLabel);

        if (actualLabel.equals(expectedLabel)){
            System.out.println("Label verification PASSED");
        } else {
            System.out.println("Label verification FAILED");
        }


//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedLinkText = "Forgot your password?";
        String actualLinkText = forgotPasswordLink.getText();

        System.out.println("expectedLinkText = " + expectedLinkText);
        System.out.println("actualLinkText = " + actualLinkText);
        if (actualLabel.equals(expectedLabel)){
            System.out.println("Link Text verification PASSED");
        } else {
            System.out.println("Link Text verification PASSED");
        }

//        5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String actualHref = forgotPasswordLink.getAttribute("href");
        String expectedHref = "forgot_password=yes";
        System.out.println("actualHref = " + actualHref);
        System.out.println("expectedHref = " + expectedHref);

        if (actualHref.contains(expectedHref)){
            System.out.println("Href Attribute Value Verification PASSED");
        } else {
            System.out.println("Href Attribute Value Verification FAILED");
        }

//
//
//
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.


    }
}
