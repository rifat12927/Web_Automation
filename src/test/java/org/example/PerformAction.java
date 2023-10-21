package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.naming.ldap.Control;
import javax.swing.*;

public class PerformAction extends DriverSetup{
    @Test
    public void testAction() throws InterruptedException {
        driver.get("https://demoqa.com/menu");
        WebElement mainItem2 = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        Actions actions= new Actions(driver);
        actions.clickAndHold(mainItem2).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']")).click();
        Thread.sleep(2000);


    }
    @Test
    public void testMultiselect() throws InterruptedException {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        Actions actions= new Actions(driver);
        driver.switchTo().frame("iframeResult");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        actions.keyDown(Keys.CONTROL).click(select.getOptions().get(1)).click(select.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
    }
}
