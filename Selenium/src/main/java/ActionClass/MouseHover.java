package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\workspace-test\\Selenium\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement features = driver.findElement(By.xpath("//a[@href = '/features']"));
		actions.moveToElement(features).build().perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
  			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("ul[class = 'main-menu__ul']>:nth-child(2)>ul>li>:first-child")).click();
	}

}
