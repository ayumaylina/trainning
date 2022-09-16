package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://formy-project.herokuapp.com/";
		 driver.get(baseUrl);
		
		 List<WebElement> drop = driver.findElements(By.partialLinkText("Drop"));
		 drop.get(1).click(); //karena list kita gaperluu tau isinya berapa, dinamis
	}
}