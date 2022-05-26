package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_StateDropdownPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //    TC #5: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

//2. Go to http://practice.cybertekschool.com/dropdown
driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void stateDropdownTest(){
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        stateDropdown.selectByIndex(48);

        //5. Select California
        stateDropdown.selectByValue("CA");

        //6. Verify
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "California" );
        //    final selected option is California.
        //    Use all Select options. (visible text, value, index)
    }

//    TC #5: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//            3. Select Illinois
//4. Select Virginia
//5. Select California
//6. Verify
//    final selected option is California.
//    Use all Select options. (visible text, value, index)





}
