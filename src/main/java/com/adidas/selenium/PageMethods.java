package com.adidas.selenium;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import com.adidas.selenium.PageElements.*;
import org.testng.Assert;

public class PageMethods {



    public void enterComment(WebDriver driver, String comment, String name, String email){

        PageElements.locator_SamplePage(driver).click();
        PageElements.locator_Comment(driver).sendKeys(comment);
        PageElements.locator_Name(driver).sendKeys(name);
        PageElements.locator_emailid(driver).sendKeys(email);
        PageElements.locator_PostComment(driver).click();
        System.out.println("Completed posting comment");

    }

    public boolean verifyComment(WebDriver driver, String comment, String name){

        String enteredComment = PageElements.locator_EnteredComment(driver).getText();
        String enteredName = PageElements.locator_Name(driver).getText();

        if(enteredComment.equals(comment) && enteredName.equals(name)){
            return true;
        }
        else{
            System.out.println("Entered comment is not displayed. Execution will be halted and Test Case failed");
            return false;
        }
    }

    public boolean verifyError(WebDriver driver){
        String errorMessage = PageElements.locator_ErrorMessage(driver).getText();
        if(errorMessage.equals("ERROR: please enter a valid email address.")){
            PageElements.locator_BackButton(driver).click();
            System.out.println("ErrorMessage: "+errorMessage);
            return true;
        }
        else{
            System.out.println("No Error Message is displayed. Execution will be halted and Test Case failed");
            return false;
        }

    }



}
