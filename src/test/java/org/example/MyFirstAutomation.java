package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstAutomation extends DriverSetup {
    @Test
    public void testLoadGoogleHomepage() throws InterruptedException {
//        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        Assert.assertEquals(driver.getTitle() , "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
//        Thread.sleep(5000);

//       driver.close();
    }
    @Test
    public void testLoadFacebookHomepage() throws InterruptedException {
//        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Assert.assertEquals(driver.getTitle() , "Facebook – log in or sign up");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
//        Thread.sleep(5000);

//       driver.close();
    }
}
