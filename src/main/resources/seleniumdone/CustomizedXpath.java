package seleniumdone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\OneDrive\\Desktop\\Automation file\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    //Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Relative Xpath: Not preferd it starts from root 
		//Absoulte Xpath or Customized Xpath:preferd 
	//	driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("laptop");
       Actions action =new Actions(driver);
       action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
       //*****************************************************
       //Listing WebElements
      List<WebElement> element= driver.findElements(By.tagName("a"));
      System.out.println(element.size());
      for(int i=0;i<element.size();i++) {
      System.out.println(element.get(i).getText());
      }
       
	}

}
