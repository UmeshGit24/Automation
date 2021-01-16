package BeginnerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class StartingWithSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// TODO Auto-generated method stub
		String expectedTitle="Google";
		String actualTitle="";
		actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test case passed");
			WebElement search=driver.findElement(By.cssSelector("input[title='Search']"));
			search.sendKeys("selenium");
			search.sendKeys(Keys.ENTER);
//			WebElement query=driver.findElement(By.xpath("//span[@class='wFncld z1asCe MZy1Rb']//*[local-name()='svg']"));
//			 ((WebElement) driver).click();
			driver.close();
		}
		else {
			System.out.println("testcase not passed");
			driver.close();
		}

	}

}
