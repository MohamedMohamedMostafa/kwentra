import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenKwentra {
    public static WebDriver driver ;
    @BeforeTest
    public void OpenChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
    @Test(priority = 1)
    public void login() {
        driver.navigate().to("https://testingtasks.kwentra.com/frontoffice/#/profileslist?tenant_id=59");
        driver.findElement(By.id("id_auth-username")).sendKeys("testuser");
        driver.findElement(By.id("id_auth-password")).sendKeys("Test_user1234");
        driver.findElement(By.id("login-submit-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div/div/div/div/ul/li[1]/a")).click();

    }

    @Test(priority = 2)
    public void profiles() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
    }
    @Test(priority =3 )
    public void create_case_one(){
        driver.findElement(By.id("first_name-field")).sendKeys("tony");
        driver.findElement(By.id("last_name-field")).sendKeys("bob");
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }
    @Test(priority =4 )
    public void create_case_two(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
        driver.findElement(By.id("first_name-field")).sendKeys("tony");
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }
    @Test(priority =5 )
    public void create_case_three(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
        driver.findElement(By.id("last_name-field")).sendKeys("bob");
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }
    @Test(priority =6 )
    public void create_case_four(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
        driver.findElement(By.id("first_name-field")).sendKeys("lolo");
        driver.findElement(By.id("last_name-field")).sendKeys("bob");
        driver.findElement(By.id("passport-field")).sendKeys("2985462222");
        driver.findElement(By.id("mobile-field")).sendKeys("01092093920");
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }
    @Test(priority =7 )
    public void create_case_five(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
        driver.findElement(By.id("first_name-field")).sendKeys("lolo");
        driver.findElement(By.id("passport-field")).sendKeys("2985462222");
        driver.findElement(By.id("mobile-field")).sendKeys("01092093920");
        driver.findElement(By.id("saveAndAdd-btn")).click();
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }
    @Test(priority =8 )
    public void create_case_sex(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
        driver.findElement(By.id("last_name-field")).sendKeys("lolo");
        driver.findElement(By.id("passport-field")).sendKeys("2985462222");
        driver.findElement(By.id("mobile-field")).sendKeys("01092093920");
        driver.findElement(By.id("saveAndAdd-btn")).click();
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }
    @Test(priority =9 )
    public void create_case_seven(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("Profiles")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("create-btn")).click();
        driver.findElement(By.id("passport-field")).sendKeys("2985462222");
        driver.findElement(By.id("mobile-field")).sendKeys("01092093920");
        driver.findElement(By.id("saveAndAdd-btn")).click();
        driver.findElement(By.id("saveAndAdd-btn")).click();
    }

}
