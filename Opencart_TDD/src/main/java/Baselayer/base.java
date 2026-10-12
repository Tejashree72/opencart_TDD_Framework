package Baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageLayer.homepage;
import pageLayer.registerPage;

public class base {
	public static WebDriver driver;
	public homepage home_obj;
	public registerPage reg_obj;
	@BeforeMethod
 public void initilizer()
 { 
		String broswer="Edge";
 if(broswer.equalsIgnoreCase("chrome"))
 {
	 driver =new ChromeDriver(); 
 }
 else if(broswer.equalsIgnoreCase("Firefox"))
 {
	 driver =new FirefoxDriver();  
 }
 else if(broswer.equalsIgnoreCase("Edge"))
 {
	 driver =new EdgeDriver();  
 }
 else
 {
	 
	 System.out.println(" Give the valid broswer action");
 }
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	home_obj=new homepage(driver);
	reg_obj =new  registerPage(driver);
 }
	@AfterMethod
 public void tearDown()
 {
	driver.quit();; 
 }
}
