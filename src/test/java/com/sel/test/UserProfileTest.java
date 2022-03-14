/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author srmhome
 */
public class UserProfileTest {
    
    public UserProfileTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testprofile(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://nlilaramani.github.io/");
        driver.findElement(By.partialLinkText("User Registration")).click();
        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.id("fname")).sendKeys("Robert");
        driver.findElement(By.name("lname")).sendKeys("Daley");
        driver.findElement(By.id("username")).sendKeys("Rob");
        driver.findElement(By.className("pwd")).sendKeys("testpwd");
        driver.findElements(By.name("g")).get(0).click();
       WebElement e=driver.findElement(By.tagName("select"));
        Select s=new Select(e);
        s.selectByIndex(1);
        

        
    
    }
}
