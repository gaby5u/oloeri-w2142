package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.FormaPage;

public class FormeTest {

    public static WebDriver driver;

//    @BeforeClass
    public static void BeforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public static void main(String[] args) {
        BeforeClass();
        Test();
        close();
    }

//    @Test
    public static void Test ()
    {
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage page = new FormaPage(driver);
        page.setFirstNameEl("Oloeri");
        page.setLastNameEl("Gabriela");
        page.setUserEmailEl("gabrielaoloeri45@gmail.com");
        page.setUserNumberEl("068799349");
        page.setCurrentAddressEl("or.Chisinau, str. Burebista 3/2");
    }


//    @AfterClass
    public static void close(){
        driver.quit();
    }
}
