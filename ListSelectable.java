package AdvanceSele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yogaa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/list.xhtml");
		
		List<WebElement> lisel=driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		int sizee=lisel.size();
		System.out.println(sizee);
         
		Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).click(lisel.get(0)).click(lisel.get(1)).click(lisel.get(2)).build().perform();
//		act.clickAndHold(lisel.get(0));
//		act.clickAndHold(lisel.get(1));
//		act.build().perform();
	
	}

}
