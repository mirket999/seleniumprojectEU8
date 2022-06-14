package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_getTableGetEmail_method extends TestBase {

    //TASK:
//TC #3: Create a custom method
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/tables
//3- Write custom method:
//
//• Method name: getTableGetEmail()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String tableNum
//• Arg3: String firstName

public static void getTableGetEmail(WebDriver driver, String tableNum, String firstName){
WebElement email = driver.findElement(By.xpath("//table[@id='"+tableNum+"']//td[.='"+firstName+"']/following-sibling::td[1]"));
String emailText = email.getText();
    System.out.println("emailText = " + emailText);

}
    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/tables");
        getTableGetEmail(driver, "table2", "Tim");
    }



}
