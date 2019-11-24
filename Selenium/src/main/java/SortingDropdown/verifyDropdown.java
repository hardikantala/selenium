package SortingDropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyDropdown {

public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\workspace-test\\WebDriver\\Drivers\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Select sl = new Select(driver.findElement(By.id("month")));
		
		List<String> actualList = new ArrayList();
		
		List<WebElement> mytools = sl.getOptions();
		
		for (WebElement we : mytools)
		{
			String str = we.getText();
			actualList.add(str);
		}
		
		Collections.sort(actualList, Collections.reverseOrder());
		
		Iterator<String> itr = actualList.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
