package webdriverdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxexample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("books");
		Thread.sleep(10000);
		element.submit();		
		driver.quit();	
		
		//iDE>>gmail regirstration
		//amazon cart adding
	}

}

