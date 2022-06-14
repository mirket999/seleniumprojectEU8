package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

// TC #1: Web table practice
// 1. Go to: https://practice.cydeo.com/web-tables
// 2. Verify Bob’s name is listed as expected.
// Expected: “Bob Martin”
// 3. Verify Bob Martin’s order date is as expected
// Expected: 12/31/2021
//
WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
    driver.get("https://practice.cydeo.com/web-tables");

    }


    @Test
    public void orderName(){
// 2. Verify Bob’s name is listed as expected.
// Expected: “Bob Martin”

        WebElement name = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String actualTextOfName = name.getText();
        String expectedTextOfName = "Bob Martin";
        Assert.assertTrue(actualTextOfName.equalsIgnoreCase(expectedTextOfName));

        // 3. Verify Bob Martin’s order date is as expected
        // Expected: 12/31/2021
       String actualDateText = WebTableUtils.returnOrderDate(driver,"Robert Baratheon");
        String expectedDateText = "12/04/2021";

        Assert.assertEquals(actualDateText, expectedDateText);

        WebTableUtils.orderVerify(driver, "Alexandra Gray", "04/15/2021");
    }

}
