package com.adidas.selenium;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase_EnterCommentFlow {

    static String url = "http://store.demoqa.com";
    static String validEmail = RandomStringUtils.random(10,true,false) + "@email.com";
    static String invalidEmail = "invalidemail";
    static String name = RandomStringUtils.random(6,true,false);
    static String comment = RandomStringUtils.random(24,true,false);
    static WebDriver driver = null;


    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kguttiko\\Documents\\GitHub\\keyword-driven-framework\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        PageMethods pom = new PageMethods();
        pom.enterComment(driver, comment, name, invalidEmail);;
        Assert.assertEquals(pom.verifyError(driver),true);
        pom.enterComment(driver, comment, name, validEmail);
        Assert.assertEquals(pom.verifyComment(driver,comment,name),true);
        System.out.println("Test Case Execution completed succesfully");
        System.out.println("Test Case Status : PASSED");
        driver.quit();
    }

}
