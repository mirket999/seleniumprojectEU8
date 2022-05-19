package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_getAttribute_xPath_Practice {
    public static void main(String[] args) {
//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver chromeDriver = WebDriverFactory.getDriver("chrome");
        chromeDriver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        chromeDriver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//        3- Enter incorrect username into login box:
        WebElement logInBox = chromeDriver.findElement(By.xpath("//*[@name='USER_LOGIN']"));
        logInBox.sendKeys("incorrect");


//        4- Click to `Reset password` button
        WebElement resetPasswordButton = chromeDriver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPasswordButton.click();


//        5- Verify “error” label is as expected
//        Expected: Login or E-mail not found
        WebElement errorPopUp = chromeDriver.findElement(By.cssSelector("div[class='errortext']"));
        String expectedErrorMessage = "Login or E-mail not found";
        String actualErrorMessage = errorPopUp.getText();
        WebDriverFactory.actualVsExpectedEquals(actualErrorMessage, expectedErrorMessage, "Error Label Test");
//
//
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//        PS2: Pay attention to where to get the text of this button from


    }
}
