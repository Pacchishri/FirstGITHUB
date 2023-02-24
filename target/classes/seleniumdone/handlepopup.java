package seleniumdone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlepopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\OneDrive\\Desktop\\Automation file\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click(); // For File upload just send keys(path of the file )instead of clicking 
		
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("alert message not correct");
		}
		Thread.sleep(2000);
		alert.accept(); //for Ok button
		//alert.dismiss();//for Cancel button		
		//driver.quit();	
		
		}

}
