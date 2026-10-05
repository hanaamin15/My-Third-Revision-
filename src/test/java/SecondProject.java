import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondProject {
    @Test
    public void SecondProject(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();
        driver.findElement(By.xpath("//button[@class='radius']")).click();
    }
}
