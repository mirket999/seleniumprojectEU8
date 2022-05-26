package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_DateDropdownPractice {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){
        //    TC #6: Selecting date on dropdown and verifying
//1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

//2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @BeforeMethod
    public void setUpMethod () throws InterruptedException {
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


    @Test
    public void yearDropdownTest() {
        //            3. Select “December 1st, 1923” and verify it is selected.


//    Select year using  : visible text
        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropDown.selectByVisibleText("1923");

        Assert.assertEquals(yearDropDown.getFirstSelectedOption().getText(), "1923");

    }

    @Test
    public void monthDropdownTest() {

//    Select month using   : value attribute
        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropDown.selectByValue("11");

        Assert.assertEquals(monthDropDown.getFirstSelectedOption().getText(), "December");
    }

    @Test
    public void dayDropdownTest() {

//    Select day using : index number
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);

        Assert.assertEquals(dayDropDown.getFirstSelectedOption().getText(), "1");


    }

//    TC #6: Selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown
//            3. Select “December 1st, 1923” and verify it is selected.
//    Select year using  : visible text
//    Select month using   : value attribute
//    Select day using : index number

}
