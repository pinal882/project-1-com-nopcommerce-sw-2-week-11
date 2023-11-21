package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
//1.
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();//click on login link
        String expectedText = "Welcome, Please Sign In!";
        //find the actual text element and get the text from element
        WebElement actualTextelement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextelement.getText();
        //Verify expected and actual text
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
//2.
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Enter valid username
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abcd987@gmail.com");
        //Enter valid password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Prime1234");
        //click on login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //verify the logout text is display
        String expectedText = "Log out";
        WebElement actualTextElement = driver.findElement(By.linkText("Log out"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    //3.
    public void verifyTheErrorMessage() {
        //Click on the login Link
        driver.findElement(By.linkText("Log in")).click();
        //Enter Invalid username
        driver.findElement(By.name("Email")).sendKeys("prime123@gmail.com");
        //Enter Invalid password
        driver.findElement(By.name("Password")).sendKeys("123pr");
        //click on login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //Verify the error message
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}