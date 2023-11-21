package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    static String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the 'register' link
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        //verify the text 'Register'
        String expectedText = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the Register link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //select gender radio button
        driver.findElement(By.xpath("//label[@for='gender']"));
        //Enter First Name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ABC");
        //Enter Lastname
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("a");
        //select day month and year
        driver.findElement(By.xpath("//label[text()='Date of birth:']"));
        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyz12@gmail.com");
        //enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prime123");
        //enter confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Prime123");
        //click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        //verify the text Your registration completed
        String expectedText = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}