package AdvanceSele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");

		WebElement link1=driver.findElement(By.linkText("Go to Dashboard"));
		link1.click();

		driver.navigate().back();

		WebElement link2=driver.findElement(By.partialLinkText("Find the URL without "));
		String wheregoing=link2.getAttribute("class");
		System.out.println(wheregoing);

		WebElement linl3brok=driver.findElement(By.linkText("Broken?"));
		linl3brok.click();

		String gettit=driver.getTitle();
		if(gettit.contains("404")) {
			System.out.println("page error");
		}
		else {
			System.out.println("error working");
		}
		Thread.sleep(3000);
		
		driver.navigate().back();
		WebElement link1again=driver.findElement(By.linkText("Go to Dashboard"));
		link1again.click();
		driver.navigate().back();
		
		List <WebElement> totallinks=driver.findElements(By.tagName("a"));
		int numoflinks=totallinks.size();
		System.out.println(numoflinks);
		
	}

}
