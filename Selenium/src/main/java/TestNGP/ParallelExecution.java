package TestNGP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void getTitle(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\workspace-test\\Selenium\\drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("ie"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\workspace-test\\Selenium\\drivers\\chromedriver.exe");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 driver.quit();
	}

}
