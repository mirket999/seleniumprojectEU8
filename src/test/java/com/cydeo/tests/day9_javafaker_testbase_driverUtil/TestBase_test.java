package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.tests.base.TestBase;
import org.testng.annotations.Test;

public class TestBase_test extends TestBase {

    @Test
    public void test1 (){
        driver.get("https://google.com");
    }
}
