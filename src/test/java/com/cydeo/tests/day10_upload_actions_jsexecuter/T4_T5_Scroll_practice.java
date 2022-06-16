package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_T5_Scroll_practice {
    @Test
    public void scrollPractice(){
//        TC #4: Scroll practice
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

//        3- Scroll down to “Powered by CYDEO”
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
      //  js.executeScript("window.scrollBy(0,3000)");

//        4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//div[text()='Powered by ']"))).perform();
//
//        TC #5: Scroll practice 2
//        1- Continue from where the Task 4 is left in the same test.
//        2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Driver.getDriver().findElement(By.linkText("Home")), Keys.PAGE_UP).perform();


    }
}
