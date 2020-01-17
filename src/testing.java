
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;
import org.openqa.selenium.firefox.FirefoxDriver;





public class testing {
    public static void main(String[] args){
       // WebDriver driver = new FirefoxDriver();
        ChromeDriver driver= new ChromeDriver();

       // FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com ");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}