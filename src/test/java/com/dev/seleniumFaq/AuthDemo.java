package com.dev.seleniumFaq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://omayo.blogspot.com/");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
