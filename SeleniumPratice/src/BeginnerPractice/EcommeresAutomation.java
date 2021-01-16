package BeginnerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommeresAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement login=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		login.click();
		WebElement number=driver.findElement(By.xpath("//input[@id='ap_email']"));
		number.sendKeys("9536082987");
		WebElement coutinue=driver.findElement(By.xpath("//span[@id='continue']//input[@id='continue']"));
		coutinue.click();
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Umesh9536");
		WebElement siginSubmit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		
		siginSubmit.click();
		
		WebElement shopByCategory=driver.findElement(By.xpath("//i[@class='nav-i']"));
		shopByCategory.click();
		driver.findElement(By.xpath("//span[normalize-space()=\"Men's Fashion\"]")).click();
		driver.findElement(By.xpath("//body/div/div[@class='a-section sbdViewClass']/div[@class='a-row sbdContainer']/div[@class='a-section sbdCategory']/div[@class='a-section a-spacing-base sbdCategoryContent']/div[1]/div[2]/a[1]/div[1]/div[1]")).click();
		driver.close();

	}

}
