package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {

    // Test for searching a product
    @Test
    public void testSearchFunction() {
        // Set the path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\DEPI\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");  // Change to the actual URL of the website you are testing

        // Find the search box element and search for "Laptop"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        // Check if the search results are displayed
        WebElement results = driver.findElement(By.id("searchResults"));
        assertTrue(results.isDisplayed(), "Results should be displayed!");

        driver.quit();  // Close the browser after the test
    }
    
    // Test for verifying the page title after the search
    @Test
    public void testSearchPageTitle() {
        // Set the path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\DEPI\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");  // Change to the actual URL of the website you are testing

        // Find the search box element and search for "Laptop"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        // Check if the page title contains the search term "Laptop"
        String title = driver.getTitle();
        assertTrue(title.contains("Laptop"), "Page title should contain the search term!");

        driver.quit();  // Close the browser after the test
    }
}
