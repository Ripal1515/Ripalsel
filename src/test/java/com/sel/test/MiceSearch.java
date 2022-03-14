/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author srmhome
 */
public class MiceSearch {
    
    public MiceSearch() {
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
  public void testGoogleStore() throws Exception {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       Thread.sleep(10000);
       driver.get("https://www.advantageonlineshopping.com/#/category/Mice/5");
    driver.findElement(By.id("29")).click();
    driver.get("https://www.advantageonlineshopping.com/#/product/29");
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.linkText("MICE")).click();
    driver.get("https://www.advantageonlineshopping.com/#/category/Mic/5");
    driver.findElement(By.id("30")).click();
    driver.get("https://www.advantageonlineshopping.com/#/product/30");
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[3]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.findElement(By.id("menuCart")).click();
  }
}
    
   
