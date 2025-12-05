package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    @Test
    public void testLoginPage() {
        // تحديد مسار ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\DEPI\\chromedriver-win64\\chromedriver.exe");

        // إنشاء نسخة من ChromeDriver
        WebDriver driver = new ChromeDriver();

        // فتح صفحة تسجيل الدخول
        driver.get("https://www.example.com/login");

        // التحقق من عنوان الصفحة
        String title = driver.getTitle();
        assertEquals("Login - Example", title);

        // إغلاق المتصفح
        driver.quit();
    }
}
