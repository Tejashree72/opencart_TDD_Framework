package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
	public WebDriver driver;
	public registerPage(WebDriver d) {
driver=d;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement box_First_name;
	
	@FindBy(id="input-lastname")
	private WebElement box_Last_name;
	
	@FindBy(id="input-email")
	private WebElement box_Email;
	
	@FindBy(id="input-telephone")
	private WebElement box_telphone;
	
	@FindBy(id="input-password")
	private WebElement box_Pass;
	
	@FindBy(id="input-confirm")
	private WebElement box_con_pass;
	
	@FindBy(xpath="//input[@value='0']")
	private WebElement radio_btn_No;

	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement check_box_policy;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement button_contine;
	
	public void enter_First_Name(String name)
	{
		box_First_name.sendKeys(name);
	
	}
	public void enter_Last_Name(String name)
	{
		box_Last_name.sendKeys(name);
	
	}
	
	public void enter_mail(String mail)
	{
		box_Email.sendKeys(mail);
	
	}
	public void enter_tel(String phn)
	{
		box_telphone.sendKeys(phn);
	
	}
	public void enter_pass(String pass)
	{
		box_Pass.sendKeys(pass);
	
	}
	public void enter_con_pass(String paas)
	{
		box_con_pass.sendKeys(paas);
	
	}
	
	public void click_redio()
	{
		radio_btn_No.click();
	
	}
	public void click_btn_policy()
	{
		check_box_policy.click();
	
	}
	public void click_continue()
	{
		button_contine.click();
	
	}
	

	

}
