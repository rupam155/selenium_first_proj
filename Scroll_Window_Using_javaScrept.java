package Java_Script_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Window_Using_javaScrept {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
	        driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();

			
			JavascriptExecutor jsp=(JavascriptExecutor)driver;
			Thread.sleep(2000);
			jsp.executeScript("window.scrollBy(0,1000)"); // scroll for adject by manually By down
			Thread.sleep(2000);
			jsp.executeScript("window.scrollBy(0,-1000)"); // scroll for adject by manually  By Up
			Thread.sleep(2000);
			jsp.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //scrool for End of Page
			Thread.sleep(2000);
			jsp.executeScript("window.scrollTo(- document.body.scrollHeight,0)"); //scrool for top of page
			
		
		
		
	}

}
