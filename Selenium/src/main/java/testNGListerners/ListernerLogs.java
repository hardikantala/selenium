package testNGListerners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(testNGListerners.TestNGITestListener.class)
public class ListernerLogs {
	
	@Test
	public void titleVerify()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace-test\\WebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void designToFail()
	{
		System.out.println("This is dummy failed method");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "designToFail")
	public void designToSkipped()
	{
		System.out.println("This is skipped method");
	}
}
