package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocator extends DriverSetup{
    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com/");

        //Locate using Id
        WebElement searchBox= driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("SQA Engineer");
        Thread.sleep(2000);
        searchBox.clear();


        //Locate using LinkText
        WebElement gmaillink= driver.findElement(By.linkText("Gmail"));

        System.out.println(gmaillink.getText());
//        gmaillink.click();

        //Locate using Partial LinkText
        WebElement imagelink= driver.findElement(By.partialLinkText("mage"));
        System.out.println(imagelink.getText());

        //Locate using CSS selector
       WebElement countryName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));
        System.out.println(countryName.getText());

        //Locate using xpath
        WebElement language =driver.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(language.getText());

        Thread.sleep(5000);
    }

}
