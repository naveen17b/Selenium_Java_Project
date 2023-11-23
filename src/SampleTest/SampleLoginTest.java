package SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.name("input[placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.wait(2000);
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		//driver.findElement(By.className("input.password")).sendKeys("secret_sauce");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.wait(2000);
		
		driver.findElement(By.name("login-button")).click();
		driver.close();
		

	}

}
