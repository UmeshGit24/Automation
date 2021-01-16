package BeginnerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Deleting all the cookies
		driver.manage().deleteAllCookies();
//		driver.get("https://ultimateqa.com/filling-out-forms/");
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='female']"));
		radioButton.click();
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='Bike']"));
		checkBox.click();
		System.out.println(checkBox.getText());
		
		Select bus=new Select(driver.findElement(By.xpath("//div[@class='et_pb_blurb_description']//select")));
		bus.selectByVisibleText("Opel");
//		bus.deselectByVisibleText("Opel");
		Thread.sleep(1000);
		bus.selectByIndex(0);
		
		
		
	}
}
