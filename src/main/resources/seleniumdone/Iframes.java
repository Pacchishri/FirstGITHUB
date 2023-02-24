package seleniumdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes { //NoSuch element found is common prediction 
	// frame has two main properties one INDEX and NAME

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\OneDrive\\Desktop\\Automation file\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();//

	}

	
}
