package com.scp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleAutomationScript {

	
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.out.println("changes...");
		
		/**
		 * 
		 * Selenium ka version < 3 hota hai
		 * 		Firefox is the default browser
		 * 		Firefox <47
		 * 
		 * Selenium ka version >=3 
		 * 		no default browser  - you need to driver executable path (Geckodriver)
		 * 		greater than 50
		 *
		
		
		
		
	WebDriver -- browser
			close  -- will close current window jiske upar context rahega
			quit  -- will close all windows opened in selnium context
			findelement
			findelements
			getPageSource
			getTitle
			getCurrenturl
			get
			
			getWindowhandle
			getWindowHandles
			switchTo
			manage
			navigate
			
		
		Webelement Methods
		 * clear
		 * getText
		 * sendKeys
		 * findelement
		 * findelements
		 * submit
		 * click
		 * getSize
		 * getRect
		 * getLoct
		 * isDisplayed
		 * isEnabled
		 * isSelected
		 * getAttributeValue
		 * getCSSValue
		 * 		
		 * 
		 * 
		 * 
		 * <input type ="submit"/>  -- submit() click()
		 * <input type ="button"/> -- click()
		 * 
		 * 
		 */
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Yogesh\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement firstnameInputBox = driver.findElement(By.name("firstname"));
		WebElement lastnameInputBox = driver.findElement(By.name("lastname"));
		firstnameInputBox.sendKeys("xxxxxx");
		lastnameInputBox.sendKeys("yyyy");

		WebElement yrOfExp = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[2]/div/form/fieldset/div[18]/strong/label"));
		System.out.println(yrOfExp.getText());
		
		
		List<WebElement> genderTypes = driver.findElements(By.name("sex"));
		for(int i=0;i<genderTypes.size();i++){
			WebElement item = genderTypes.get(i);
			String value = item.getAttribute("value");
			if(value.equals("Female")){
				item.click();
			}
		

		
		Thread.sleep(5000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_M);
		
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		
		
		
		
		/**
		 * WebElement
		 * 		click  - click()
		 * 		enter text -- sendKeys
		 * 		get text -- getText()
		 * 		
		 * 
		 * 
		 */
		
		
	}
	}	
}

