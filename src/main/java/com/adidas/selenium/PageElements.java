package com.adidas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageElements {

    static String url = "http://store.demoqa.com";

    static WebElement element = null;

    public static WebElement locator_SamplePage(WebDriver driver){
        element = driver.findElement(By.id("menu-item-54"));
        return element;
    }


    public static WebElement locator_emailid(WebDriver driver){
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement locator_Comment(WebDriver driver){
        element = driver.findElement(By.id("comment"));
        return element;
    }
    public static WebElement locator_Name(WebDriver driver) {
        element = driver.findElement(By.id("author"));
        return element;

    }

    public static WebElement locator_PostComment(WebDriver driver){
        element = driver.findElement(By.id("submit"));
        return element;
    }

    public static WebElement locator_BackButton(WebDriver driver){
        element = driver.findElement(By.partialLinkText("Back"));
        return element;
    }

    public static WebElement locator_ErrorMessage(WebDriver driver){
        element = driver.findElement(By.xpath("//body[@id='error-page']/p[2]"));
        return element;
    }
    public static WebElement locator_EnteredComment(WebDriver driver){
        element = driver.findElement(By.className("comment-body"));
        return element;
    }

    public static WebElement locator_EnteredName(WebDriver driver){
        element = driver.findElement(By.className("fn"));
        return element;
    }

}
