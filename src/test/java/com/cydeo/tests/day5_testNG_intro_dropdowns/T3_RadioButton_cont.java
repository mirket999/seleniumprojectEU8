package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {
//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #3: Utility method task for (continuation of Task2)
//            1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
//
//        4. Verify “Hockey” radio button is selected after clicking.
        List<WebElement> allSportButtons = driver.findElements(By.xpath("//input[@name='sport']"));

//        for (WebElement each : allSportButtons) {
//            System.out.println("each.getAttribute(\"id\") = " + each.getAttribute("id"));
//            if (each.getAttribute("id").equals("hockey")){
//                hockeyButton.click();
//                System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());
//                break;
//            }
//        }
        clickAndVerifyRadioButton(driver, "color", "black");
//
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
//
//        Create a utility method to handle above logic.
//        Method name: clickAndVerifyRadioButton
//        Return type: void or boolean
//        Method args:
//        1. WebDriver
//        2. Name attribute as String (for providing which group of radio buttons)
//        3. Id attribute as String (for providing which radio button to be clicked)
//
//        Method should loop through the given group of radio buttons. When it finds the
//        matching option, it should click and verify option is Selected.
//                Print out verification: true

    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idAttribute){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        for (WebElement eachButton : radioButtons) {
            if (eachButton.getAttribute("id").equals(idAttribute)){
                eachButton.click();
                System.out.println(idAttribute + " button is Selected? = " + eachButton.isSelected());
                break;
            }
        }
    }
}
