package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GetTagName {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

 String baseUrl = "https://formy-project.herokuapp.com/form";
 driver.get(baseUrl);

 WebElement isiTag = driver.findElement(By.tagName("h1"));
 System.out.println(isiTag.getText());
}
}