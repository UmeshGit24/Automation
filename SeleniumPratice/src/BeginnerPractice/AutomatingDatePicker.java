package BeginnerPractice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Date d=new Date(1);
		System.out.println(d);
		WebElement datePicker=driver.findElement(By.xpath("//label[@for='departure']"));
		datePicker.click();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MMMM-YYYY");
		String date=formatter.format(d);
		String[] spilter=date.split("-");
		String month_year=spilter[1];
		String month_date=spilter[0];
		selectDate(month_year,month_date, driver);
		
		
		

	}

	public static void  selectDate(String month_year,String month_date,WebDriver driver) {
		List<WebElement> elements =driver.findElements(By.xpath("//body/div[@id='root']/div/div/div/div[@data-cy='flightSW']/div/div/div/div/div/div/div/div[@lang='en']/div/div/div/div"));
		for (int i=0; i<elements.size();i++)
		{
		System.out.println(elements.get(i).getText());
		}

				
				
		
		
			
	}
}
