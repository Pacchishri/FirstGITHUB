package seleniumdone;



import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovement_dragdrop_implicitwait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\OneDrive\\Desktop\\Automation file\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    //Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Hard Wait 
		Thread.sleep(5000);
		//---------------------------------------------------------------------------------------------------
		//MOUSEMOVEMENT
		// moveToelement
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"))).build().perform();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		//-------------------------------------------------------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/div/a[1]/div/div")).click();
        // DragAndDrop
		
	}

}
