package SampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProject {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "/D:/Software testing/chromedriver-win64/chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandles());
		driver.close();

	}

}
