package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type doesn't exist!!!");
            return null;
        }

    }

    public static void actualVsExpectedEquals(String actual, String expected, String TestType){


        if (actual.equals(expected)){
            System.out.println(TestType + " Verification Test PASSED!");
        } else {
            System.out.println(TestType + " Verification Test FAILED!");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
    }
}
