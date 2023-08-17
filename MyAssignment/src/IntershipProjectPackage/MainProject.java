package IntershipProjectPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainProject {  
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(1000);
		List <WebElement> list=driver.findElements("//ul[@role='listbox']//li/descendant::div@class='sbl1'");
		
		System.out.println(list.size());
		
		for (int i=0; i<=list.size();i++) {
			String listItem=list.get(i).getText();
			if (listItem.contains("Java Online Compiler"))
			{
				list.get(i).click();
				break;
				
			}
		}
	}


}
