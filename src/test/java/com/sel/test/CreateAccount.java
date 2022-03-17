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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author srmhome
 */
public class CreateAccount {

    public CreateAccount() {
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
    public void testSearchMice() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           driver.get("https://www.advantageonlineshopping.com/#/");
    driver.findElement(By.id("menuUser")).click();
    driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
    driver.findElement(By.name("usernameRegisterPage")).click();
    driver.findElement(By.name("usernameRegisterPage")).clear();
    driver.findElement(By.name("usernameRegisterPage")).sendKeys("Johan");
    driver.findElement(By.name("emailRegisterPage")).clear();
    driver.findElement(By.name("emailRegisterPage")).sendKeys("Smith");
    driver.findElement(By.name("emailRegisterPage")).click();
    driver.findElement(By.name("emailRegisterPage")).clear();
    driver.findElement(By.name("emailRegisterPage")).sendKeys("johan@xyz.com");
    driver.findElement(By.name("passwordRegisterPage")).clear();
    driver.findElement(By.name("passwordRegisterPage")).sendKeys("Home!@#$%1");
    driver.findElement(By.name("confirm_passwordRegisterPage")).clear();
    driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Home!@#$%1");
    driver.findElement(By.xpath("//div[@id='formCover']/div[2]/div/sec-view/div/label")).click();
    driver.findElement(By.name("first_nameRegisterPage")).clear();
    driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Johan");
    driver.findElement(By.name("last_nameRegisterPage")).clear();
    driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Smith");
    driver.findElement(By.name("phone_numberRegisterPage")).click();
    driver.findElement(By.name("phone_numberRegisterPage")).clear();
    driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("6305159258");
    driver.findElement(By.name("countryListboxRegisterPage")).click();
    new Select(driver.findElement(By.name("countryListboxRegisterPage"))).selectByVisibleText("United States");
    driver.findElement(By.name("cityRegisterPage")).click();
    driver.findElement(By.name("cityRegisterPage")).clear();
    driver.findElement(By.name("cityRegisterPage")).sendKeys("Naperville,");
    driver.findElement(By.name("addressRegisterPage")).clear();
    driver.findElement(By.name("addressRegisterPage")).sendKeys("1560 Wall Street, Suite #111");
    driver.findElement(By.name("state_/_province_/_regionRegisterPage")).clear();
    driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Illinois");
    driver.findElement(By.name("postal_codeRegisterPage")).clear();
    driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("60563");
    driver.findElement(By.name("i_agree")).click();
    driver.findElement(By.id("register_btnundefined")).click();
  }

    }

