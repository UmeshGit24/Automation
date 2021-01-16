package BeginnerPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFilter {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
		String[] tableData=new String[list.size()];
		for(int i=0;i<tableData.length;i++) {
			tableData[i]=list.get(i).getText().trim();
		}
		print(tableData);
		
		
//		System.out.println(list);
	}

	public static void print(String[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			
		}
	}
}
