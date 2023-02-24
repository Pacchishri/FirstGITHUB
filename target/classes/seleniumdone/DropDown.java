package seleniumdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=8397568893402112163&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20460&hvtargid=kwd-296458795081&hydadcr=14452_2154371&gclid=Cj0KCQjwnvOaBhDTARIsAJf8eVNKxJyfjyM0qu3nNYYsdCBQ2co4xQdTA4e9NZweayjaWf1E3u3yYsoaAnFhEALw_wcB");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("prasanna");
		WebElement data=driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		Select select=new Select(data);
		select.selectByVisibleText("Deals");
		//driver.quit();
Assert.isTrue(false, null, args);
	}

}
