package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator2 extends DriverSetup{
    @Test
    public void testFacebook() throws InterruptedException {
        driver.get("https://www.facebook.com/");

        //locate using className
        WebElement email = driver.findElement(By.className("inputtext"));
        email.sendKeys("abc23@gmail.com");

        //locate using Id
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("1234567890");

        //locate using css selector
        WebElement title = driver.findElement(By.cssSelector("h2[class='_8eso']"));
        System.out.println(title.getText());

        Thread.sleep(5000);

    }



}
