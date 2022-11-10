import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		            ///Title///
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Swag Labs";
		Assert.assertEquals(actualTitle1, expectedTitle1);
		
		
		   ///Items// 
		int expectedTitl2= 6;
		List <WebElement> baton =driver.findElements(By.className("btn"));
		for(int i=0; i<baton.size();i++) {
			baton.get(i).click();
		}
		String y =driver.findElement(By.className("shopping_cart_badge")).getText();
		int actualTitle2=Integer.parseInt(y);
		Assert.assertEquals(actualTitle2, expectedTitl2);
		
	

	}

}
