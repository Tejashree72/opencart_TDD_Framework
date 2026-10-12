package testLayer;


import org.testng.annotations.Test;

import Baselayer.base;
import pageLayer.homepage;
import pageLayer.registerPage;

public class registerTest extends base{
	
	
	//WebDriver driver;
	@Test
	public void TC01_verify_registerpage_mandtory_field()
	{
		
		home_obj.clickON_My_Account();
		home_obj.clickON_register_link();
		
		
		 reg_obj.enter_First_Name("teju");
		 reg_obj.enter_Last_Name("jadhav");
		 reg_obj.enter_mail("teju@123.com");
		 reg_obj.enter_tel("980578900");
		 reg_obj.enter_pass("tkj@12");
		 reg_obj.enter_con_pass("tkj@12");
		 reg_obj.click_redio();
		 reg_obj.click_btn_policy();
		 reg_obj.click_continue();
		
	}
	

}
