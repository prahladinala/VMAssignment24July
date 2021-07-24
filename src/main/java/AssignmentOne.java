import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssignmentOne {
    public static WebDriver driver;

    @Test
    public void agent(){
        driver.get("https://webapps.tekstac.com/Agent_Registration/");

        // ENTER FIRST NAME
        driver.findElement(By.xpath("//*[@id=\"agent-form\"]/input[1]")).sendKeys("John");

        // ENTER LAST NAME
        driver.findElement(By.xpath("//*[@id=\"agent-form\"]/input[2]")).sendKeys("Smith");

        // ENTER USER NAME
        driver.findElement(By.xpath("//*[@id=\"agent-form\"]/input[3]")).sendKeys("JohnSmith");

        // ENTER PASSWORD
        driver.findElement(By.xpath("//*[@id=\"agent-form\"]/input[4]")).sendKeys("pass@123");

        // ENTER MOBILE NUMBER
        driver.findElement(By.xpath("//*[@id=\"agent-form\"]/input[5]")).sendKeys("9876543210");

        // ENTER EMAIL ADDRESS
        driver.findElement(By.xpath("//*[@id=\"agent-form\"]/input[6]")).sendKeys("John@gmail.com");

        // CLICK ON SUBMIT BUTTON
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).submit();
    }

    @BeforeClass
    public void beforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Java Projects\\SeleniumTesting\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass()
    {
        String data =driver.findElement(By.xpath("//body/table[1]")).getText();
        System.out.println(data);
    }
}
