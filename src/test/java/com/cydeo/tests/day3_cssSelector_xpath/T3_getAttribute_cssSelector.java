package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();



//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “Log in” button text is as expected:
//        Expected: Log In
        WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String expectedText = "Log In";
        String actualText = logInButton.getAttribute("value");
        System.out.println("expectedText = " + expectedText);
        System.out.println("actualText = " + actualText);

        if (actualText.equals(expectedText)){

        }
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//        PS2: Pay attention to where to get the text of this button from






    }
}
