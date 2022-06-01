package com.cydeo.utilities;

/*
In this class only general utility methods that are NOT related to some specific page.
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    public static void switchWindowAndVerifyTitle(WebDriver driver, String expectedInUrl, String expectedInTitle){
        Set<String> windowHandles = driver.getWindowHandles();
        for (String eachHandle : windowHandles) {
            driver.switchTo().window(eachHandle);
            System.out.println("eachHandle = " + eachHandle);

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


}