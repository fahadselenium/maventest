package com.Test.NET.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","E:\\Desktop and Download Data\\Desktop\\Selenium\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");


	}

}
