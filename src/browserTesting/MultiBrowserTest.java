package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static  String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static String Browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {
        if (Browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }else if (Browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        }else if (Browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        // Maximise the browser window
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        //Find the UserName Field Element
        WebElement usernameField = driver.findElement(By.name("username"));
        // Type the UserName to UserName field element
        usernameField.sendKeys("Admin123");
        driver.findElement(By.name("Password")).sendKeys("admin123");
    }
}


