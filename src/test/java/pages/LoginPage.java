package pages;

import org.openqa.selenium.By;

public class LoginPage 
{

	/*
	 * public By username=By.name("username");
	 * 
	 * public By password=By.name("password");
	 */
	
	public By objName(String value)
	{
		return By.name(value);
	}
	
	public By login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public By objPIM=By.linkText("PIM");
	
}
