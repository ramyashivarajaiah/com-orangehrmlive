package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-2 - ProjectName : com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;
    public static void main(String[] args) {

        //1. Setup chrome browser.
        String baseUrl = "https://opensource-demo.orangehrmlive.com/"; //String = data types, baseUrl = variable

        // Launch the chrome browser
        WebDriver driver = new ChromeDriver(); // using chromeDriver coz we are testing on chrome

        //2. Open URL
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        //Giving implicit wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); // window will be open for 50 seconds before the next code execute

        //3. Print the title of the page

        System.out.println("The Title of the page is: " + driver.getTitle()); // calling the title directly in print statement

        //4. Print the current url
        System.out.println("The current Url is: " + driver.getCurrentUrl()); //calling the current url directly in print statement

        //5. Print the page source
        System.out.println("The page source is: " + driver.getPageSource()); //calling the page source directly in print statement

        //6. Click on ‘Forgot your password?’ link
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //7. Print the current url
        System.out.println(driver.getCurrentUrl());

        //8. Navigate back to the login page.
        driver.navigate().back();

        //9. Refresh the page
        driver.navigate().refresh();

        //10. Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Admin");

        //11. Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        //12. Click on Login Button
        driver.findElement(By.tagName("button")).click();

        //13. Close the browser
        driver.quit();


    }

}
