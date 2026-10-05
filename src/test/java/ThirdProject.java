import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdProject {
    @Test
    public void thirdProject(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.pidima.ai/login");
        driver.findElement(By.tagName("input")).sendKeys("ahmed.kamel@pidima.aio");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
