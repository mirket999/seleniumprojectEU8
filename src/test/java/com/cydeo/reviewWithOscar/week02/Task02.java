package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task02 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // title verification before log-in
        // expected title is "Web Orders Login"
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        WebDriverFactory.actualVsExpectedEquals(actualTitle, expectedTitle, "Title");

        // enter username as "Tester"
        WebElement usernameBox = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']"));
        usernameBox.sendKeys("Tester");

        // enter password as "test"
        WebElement passwordBox = driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
        passwordBox.sendKeys("test");

        // click on Login button
        WebElement logInButton = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$login_button']"));
        logInButton.click();

        String expectedHomePageTitle = "Web Orders";
        if(expectedHomePageTitle.equals(driver.getTitle())){
            System.out.println("PASSED");
        }else{
            System.exit(-1);
        }

        HandleWait.staticWait(2);
        driver.close();

    }
}
