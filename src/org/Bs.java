package org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bs {
	
	public static WebDriver driver;

	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KaVi\\eclipse-workspace\\git\\TestNg\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void close() {
		driver.quit();

	}
	
	public static void type(WebElement e, String s) {
		e.sendKeys(s);
	}
	
	public static void btn(WebElement e) {
		e.click();

	}
	public static void enter(WebElement e) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void wt() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
	public static void get(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println(text);

	}
	
	public static void window() {
		String pw = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String cw : all) {
			if(!(pw.equals(cw))) {
				driver.switchTo().window(cw);
				
			}
			
		}
	}
public static void right(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).perform();

}

}
