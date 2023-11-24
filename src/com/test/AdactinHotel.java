package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.debugger.Debugger.ContinueToLocationTargetCallFrames;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Adactin\\ref\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		
		driver.manage().window().maximize();
		
		WebElement userid = driver.findElement(By.xpath("//input[@name='username']"));
		
		userid.sendKeys("Logeshanbalagan"); 
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("logesh6214");
		
        WebElement login = driver.findElement(By.className("login_button"));
		
	    login.click();
	    
	    Thread.sleep(1000);
	    
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select s=new Select(location);
		
		s.selectByValue("Melbourne");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		
		Select s1=new Select(hotel);
		
		s1.selectByValue("Hotel Hervey");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		Select s2=new Select(roomtype);
		
		s2.selectByValue("Super Deluxe");
		
		WebElement roomno= driver.findElement(By.id("room_nos"));
		
		Select s3=new Select(roomno);
		
		s3.selectByValue("3");
		
	//	WebElement checkin = driver.findElement(By.id("datepick_in"));
		
	//	Select s4=new Select(checkin);
		
	//	s4.selectByValue("13/11/2023");
		
	//	WebElement checkout = driver.findElement(By.className("date_pick"));
		
	//	Select s5=new Select(checkout);
		
	//	s5.selectByValue("14/11/2023");
         
		WebElement member = driver.findElement(By.id("adult_room"));
		
		Select s6=new Select(member);
		
		s6.selectByValue("2");
		
        WebElement child = driver.findElement(By.id("child_room"));
        
        Select s7=new Select(child);
        
        s7.selectByValue("1");
        
		WebElement search = driver.findElement(By.className("reg_button"));
		
        search.click();
        
		Thread.sleep(1000);
		
		WebElement ok = driver.findElement(By.id("radiobutton_0"));
		
		ok.click();
		
		WebElement done= driver.findElement(By.xpath("//input[@type='submit']"));
		
		done.click();
		
		WebElement firstname = driver.findElement(By.className("reg_input"));
		
		firstname.sendKeys("Logesh");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		
		lastname.sendKeys("Anbalagan");
		
		WebElement address = driver.findElement(By.id("address"));
		
		address.sendKeys("no.2,GreensTechnology,"
				+ "Anna nagar,Chennai-40");
		
		WebElement creditcard = driver.findElement(By.xpath("//input[@name='cc_num']"));
		
	    creditcard.sendKeys("2222 4053 4324 8877");
		
	    WebElement type = driver.findElement(By.id("cc_type"));
	    
	    Select s8=new Select(type);
	    
	    s8.selectByValue("MAST");
		
	    WebElement month = driver.findElement(By.id("cc_exp_month"));
	    
	    Select s9=new Select(month);
	    
	    s9.selectByValue("3");
	    
	    WebElement year = driver.findElement(By.id("cc_exp_year"));
	    
	    Select s10=new Select(year);
	    
	    s10.selectByValue("2024");
	    
	    WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	    
	    cvv.sendKeys("123");
	    
	    WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
	    
	    booknow.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement itinery = driver.findElement(By.id("my_itinerary"));
	    
	    itinery.click();
	    
	    
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
	}
	
}
