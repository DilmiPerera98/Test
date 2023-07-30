package com.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainText {

    private WebDriver driver;
    @BeforeAll
    public static  void setupDriver(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void Test() {
        driver.get("http://localhost:3000/login");

        driver.findElement(By.id(":r9:")).sendKeys("shamika");
        driver.findElement(By.name("password")).sendKeys("123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
