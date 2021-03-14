import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.image.Kernel;

public class youtubeSeleniumTest {
    @Test
    public void openVideo() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.youtube.com");
        //webDriver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-button-renderer/a/paper-button")).click();
        webDriver.findElement(By.id("search")).sendKeys("What is Selenium");
        webDriver.findElement(By.id("search-icon-legacy")).click();

        WebDriverWait wait = new WebDriverWait(webDriver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='video-title']//*[text()='What is Selenium? Tutorial for Beginners']"))).click();


        //webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("ozer.gurbanov2@gmail.com");
        //webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
        //webDriver.quit();

    }
}
