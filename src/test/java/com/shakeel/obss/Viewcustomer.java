package com.shakeel.obss;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viewcustomer {

	WebDriver driver = new ChromeDriver();

	@Test
	public void viewCust() {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("cust-view")).click();

	}

}
