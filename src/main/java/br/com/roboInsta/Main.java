package br.com.roboInsta;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {		
		ChromeDriver driver = new ChromeDriver();
		login(driver);
		
//		WebElement form = driver.findElement(By.id("searchForm"));
//		WebElement search = driver.findElement(By.id("getSearch"));
//		search.sendKeys("praia");
//		search.sendKeys(Keys.RETURN);
		driver.get("http://statigr.am/viewer.php#/tag/praia/");
		
	}
	
	
	public static void login(ChromeDriver driver){
		driver.get("http://statigr.am/viewer.php");
//		driver.findElement(By.className("login_header_desktop")).click();
		driver.findElement(By.id("id_username")).sendKeys("Janinest4you");        
		driver.findElement(By.id("id_password")).sendKeys("NmsyKGTXwGNK");
		driver.findElementByClassName("button-green").click();		
	}

}
