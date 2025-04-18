package org.example.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.driver.DriverManager.getDriver;

public class Waithelper {

    public  static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public static void checkVisiblity(By locator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void checkVisiblityOfElement(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
