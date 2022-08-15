package com.webtable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafLoaf {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		
		
		//find no of coloumn 
		List<WebElement> findElements = driver.findElements(By.tagName("th"));
		System.out.println("no of coloumn are:"+findElements.size());
		
		//find the no row
		
		List<WebElement> findElements2 = driver.findElements(By.tagName("tr"));
		
		System.out.println("no of row are:"+findElements2.size());
		
		//to find the pargess value of learn to interact with elements
		
		String value="Learn to";
		
		String xpath="//font[contains(text(),'"+value+"')]//parent::td//following-sibling::td[1]";
		
		List<WebElement> findElements3 = driver.findElements(By.xpath(xpath));
		
		List<String> progressValue=new ArrayList();
		
		for (int i = 0; i < findElements3.size(); i++) {
			
			progressValue.add(findElements3.get(i).getText());		
		}
		
		
	System.out.println(progressValue);	
		
	}
	
	

}
