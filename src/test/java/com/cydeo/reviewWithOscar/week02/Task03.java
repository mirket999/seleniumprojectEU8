package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task03 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // go to https://www.demoblaze.com/index.html
        driver.get("https://www.demoblaze.com/index.html");
        HandleWait.staticWait(2);

        // click on Laptops button
        WebElement laptopsButton = driver.findElement(By.linkText("Laptops"));
        laptopsButton.click();
        HandleWait.staticWait(2);

        // click on "Sony vaio i5" link
        WebElement productLink = driver.findElement(By.partialLinkText("Sony vaio i5"));
        productLink.click();
        HandleWait.staticWait(2);

        // verify if the price is 790
        WebElement priceContainer = driver.findElement(By.xpath("//h3[@class='price-container']"));
        int expectedPrice = 790;

        // get the text, substract the int part as String, convert it to integer.
        int actualPrice = Integer.parseInt(priceContainer.getText().split(" ")[0].substring(1));

        if (actualPrice==expectedPrice){
            System.out.println("Price Verification Test PASSED");
        } else {
            System.out.println("actualPrice = " + actualPrice);
            System.out.println("expectedPrice = " + expectedPrice);
            System.out.println("Price Verification Test FAILED");
        }

    }
}
