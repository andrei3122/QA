package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class OrangeHRM {

    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
             
        // Find username field and enter username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        
        // Find password field and enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        
        // Find login button and click it
        WebElement loginButton = driver.findElement(By.cssSelector("button[type=submit]"));
        loginButton.click();
        
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
        
        // Click a button called apply leave
        WebElement applyLeave = driver.findElement(By.cssSelector("button[title='Apply Leave']"));
        applyLeave.click();
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        // Click My Leave tab
        driver.findElement(By.linkText("My Leave")).click();
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        // Dropdown select button
        List<WebElement> dropdowns = driver.findElements(By.cssSelector("div.oxd-select-text"));
        dropdowns.get(1).click();        
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        // Select US-Personal
        WebElement option = driver.findElement(By.xpath("//div[@role='option' and .//span[text()='US - Personal']]"));
        option.click();
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        dropdowns.get(1).click();  
        try { Thread.sleep(1000); } catch (InterruptedException e) { }

        driver.findElement(By.xpath("//div[@role='option' and .//span[text()='US - Bereavement']]")).click();
        try { Thread.sleep(1000); } catch (InterruptedException e) { }

        dropdowns.get(1).click();  
        try { Thread.sleep(1000); } catch (InterruptedException e) { }

        driver.findElement(By.xpath("//div[@role='option' and .//span[text()='US - FMLA']]")).click();
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        dropdowns.get(1).click();
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        driver.findElement(By.xpath("//div[@role='option' and .//span[text()='US - Vacation']]")).click();
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        dropdowns.get(1).click();
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        driver.findElement(By.xpath("//div[@role='option' and text()='-- Select --']")).click();


        
    }
}
