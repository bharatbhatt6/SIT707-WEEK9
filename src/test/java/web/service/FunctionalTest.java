package web.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FunctionalTest {

    private WebDriver driver;  

    @Test
    public void testLoginAndAnswerQuestions() throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "/Users/bharatbhatt/Desktop/chromedriver-mac-arm64/chromedriver");
    	WebDriver driver = new ChromeDriver();
        // Test successful login
        driver.get("http://127.0.0.1:8083/login");
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("passwd"));
        WebElement dobField = driver.findElement(By.name("dob"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameField.sendKeys("ahsan");
        Thread.sleep(2000);
        passwordField.sendKeys("ahsan_pass");
        Thread.sleep(2000);
        dobField.sendKeys("01-01-2000");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        assertEquals("http://127.0.0.1:8083/q1", driver.getCurrentUrl());

        WebElement number1FieldQ1 = driver.findElement(By.id("number1"));
        WebElement number2FieldQ1 = driver.findElement(By.id("number2"));
        WebElement resultFieldQ1 = driver.findElement(By.id("result"));
        WebElement submitButtonQ1 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1FieldQ1.sendKeys("2");
        Thread.sleep(1000);
        number2FieldQ1.sendKeys("3");
        Thread.sleep(1000);
        resultFieldQ1.sendKeys("5");
        Thread.sleep(1000);
        submitButtonQ1.click();
        Thread.sleep(1000);
        assertEquals("http://127.0.0.1:8083/q2", driver.getCurrentUrl());

        
        WebElement number1FieldQ2 = driver.findElement(By.id("number1"));
        WebElement number2FieldQ2 = driver.findElement(By.id("number2"));
        WebElement resultFieldQ2 = driver.findElement(By.id("result"));
        WebElement submitButtonQ2 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1FieldQ2.sendKeys("5");
        Thread.sleep(1000);
        number2FieldQ2.sendKeys("3");
        Thread.sleep(1000);
        resultFieldQ2.sendKeys("2");
        Thread.sleep(1000);
        submitButtonQ2.click();
        Thread.sleep(1000);
        assertEquals("http://127.0.0.1:8083/q3", driver.getCurrentUrl());

       
        WebElement number1FieldQ3 = driver.findElement(By.id("number1"));
        WebElement number2FieldQ3 = driver.findElement(By.id("number2"));
        WebElement resultFieldQ3 = driver.findElement(By.id("result"));
        WebElement submitButtonQ3 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1FieldQ3.sendKeys("2");
        Thread.sleep(1000);
        number2FieldQ3.sendKeys("3");
        Thread.sleep(1000);
        resultFieldQ3.sendKeys("6");
        Thread.sleep(1000);
        submitButtonQ3.click();
        Thread.sleep(1000);
        assertEquals("http://127.0.0.1:8083/q3", driver.getCurrentUrl()); // Assuming q4 is the next question
        Thread.sleep(4000);
        
        String text = driver.getPageSource();
        
        Assert.assertTrue(text.contains("All answers are correct."));
        driver.quit();

    }

    @Test
    public void testLoginAndAnswerwrongQuestion() throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "/Users/bharatbhatt/Desktop/chromedriver-mac-arm64/chromedriver");
    	WebDriver driver = new ChromeDriver();
        // Test successful login
        driver.get("http://127.0.0.1:8083/login");
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("passwd"));
        WebElement dobField = driver.findElement(By.name("dob"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/input[4]"));

        usernameField.sendKeys("ahsan");
        Thread.sleep(2000);
        passwordField.sendKeys("ahsan_pass");
        Thread.sleep(2000);
        dobField.sendKeys("01-01-2000");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        assertEquals("http://127.0.0.1:8083/q1", driver.getCurrentUrl());

        
        WebElement number1FieldQ1 = driver.findElement(By.id("number1"));
        WebElement number2FieldQ1 = driver.findElement(By.id("number2"));
        WebElement resultFieldQ1 = driver.findElement(By.id("result"));
        WebElement submitButtonQ1 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1FieldQ1.sendKeys("2");
        Thread.sleep(2000);
        number2FieldQ1.sendKeys("3");
        Thread.sleep(2000);
        resultFieldQ1.sendKeys("4");
        Thread.sleep(2000);
        submitButtonQ1.click();
        Thread.sleep(2000);
        
        String text = driver.getPageSource();
        
        Assert.assertTrue(text.contains("Wrong answer, try again."));
        
        WebElement t2number1FieldQ1 = driver.findElement(By.id("number1"));
        WebElement t2number2FieldQ1 = driver.findElement(By.id("number2"));
        WebElement t2resultFieldQ1 = driver.findElement(By.id("result"));
        WebElement t2submitButtonQ1 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        t2number1FieldQ1.sendKeys("2");
        Thread.sleep(2000);
        t2number2FieldQ1.sendKeys("3");
        Thread.sleep(2000);
        t2resultFieldQ1.sendKeys("5");
        Thread.sleep(2000);
        t2submitButtonQ1.click();
        Thread.sleep(2000);
        
        
        
        assertEquals("http://127.0.0.1:8083/q2", driver.getCurrentUrl());

        
        WebElement number1FieldQ2 = driver.findElement(By.id("number1"));
        WebElement number2FieldQ2 = driver.findElement(By.id("number2"));
        WebElement resultFieldQ2 = driver.findElement(By.id("result"));
        WebElement submitButtonQ2 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1FieldQ2.sendKeys("5");
        Thread.sleep(2000);
        number2FieldQ2.sendKeys("3");
        Thread.sleep(2000);
        resultFieldQ2.sendKeys("2");
        Thread.sleep(2000);
        submitButtonQ2.click();
        Thread.sleep(2000);
        assertEquals("http://127.0.0.1:8083/q3", driver.getCurrentUrl());

        
        WebElement number1FieldQ3 = driver.findElement(By.id("number1"));
        WebElement number2FieldQ3 = driver.findElement(By.id("number2"));
        WebElement resultFieldQ3 = driver.findElement(By.id("result"));
        WebElement submitButtonQ3 = driver.findElement(By.xpath("/html/body/form/input[4]"));

        number1FieldQ3.sendKeys("2");
        Thread.sleep(2000);
        number2FieldQ3.sendKeys("3");
        Thread.sleep(2000);
        resultFieldQ3.sendKeys("6");
        Thread.sleep(2000);
        submitButtonQ3.click();
        Thread.sleep(2000);
        assertEquals("http://127.0.0.1:8083/q3", driver.getCurrentUrl()); // Assuming q4 is the next question
        Thread.sleep(4000);
        
        String text1 = driver.getPageSource();
        
        Assert.assertTrue(text1.contains("All answers are correct."));
        driver.quit();

    }
    
}
