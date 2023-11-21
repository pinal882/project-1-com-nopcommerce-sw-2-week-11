package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    static String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void UserShouldNavigateToComputerPageSuccessfully() {
        //click on the 'computers ' tab
        driver.findElement(By.partialLinkText("Computers")).click();
        //verify the text 'computers
        String expectedText = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on 'electronics' tab
        driver.findElement(By.partialLinkText("Electronics")).click();
        //Verify the text 'Electronics'
        String expectedText = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the 'Apparel' tab
        driver.findElement(By.xpath("//a[@href='/apparel']")).click();
        //verify the text 'Apparel'
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);


    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on digital downloads tab
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        //verify the text Digital Downloads
        String expectedText = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);


    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the books tab
        driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
        //verify the text books
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on jewelery tab
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
        //verify the text jewelery
        String expectedText = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on gift card
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
        //verify the text gift card
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
