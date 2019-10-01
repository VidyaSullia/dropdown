package org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KaVi\\eclipse-workspace\\git\\Welcome\\Dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		
	/*	 WebElement down = driver.findElement(By.xpath("//label[text()='Selenium Commands']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView(true)", down);
		*/
		
		WebElement sel = driver.findElement(By.id("continentsmultiple"));
		
		Select s=new Select(sel);
		List<WebElement> op = s.getOptions();
		
		for (WebElement allop : op) {
			String t = allop.getText();
			if(t.equals("Asia")||t.equals("Africa")||t.equals("Europe")) {
				s.selectByVisibleText(t);
			}
			System.out.println(t);
		}
		System.out.println();
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement x : all) {
			String text = x.getText();
			System.out.println(text);
		}
		System.out.println();
		WebElement first = s.getFirstSelectedOption();
		String text1 = first.getText();
		System.out.println(text1);
		
		driver.quit();
	}
	
	
}

