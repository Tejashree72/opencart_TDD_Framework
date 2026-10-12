package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	public WebDriver driver;
	public homepage(WebDriver d) {
    driver =d;
    PageFactory.initElements(d, this);
	}
	
	
	
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount_link;
	
	@FindBy(xpath="//a[text()='Register'][1]")
	private WebElement register_link;
	
	@FindBy(xpath="//a[text()='Login'][1]")
	private WebElement login_link;
	
	public void clickON_register_link()
	{
		register_link.click();
	}
	public void clickON_My_Account()
	{
		myAccount_link.click();
	}
}
