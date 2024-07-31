package com.shakeel.obss;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VIewproduct {

	WebDriver driver = new ChromeDriver();

	@Test
	public void viewProd() {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("view")).click();

	}

}
