package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 implements webDriver1,webDriver2
{

	public void chromeRelated()
	{
		System.out.println("Chrome Related Method Executed");
	}
	
	public static void main(String[] args)
	{
		
		webDriver1 v=new Chrome1();
		
		//v.chromeRelated();
		v.get1();
		
	//	WebDriver driver=new ChromeDriver();
		
		
	
		
	}

	public void get1()
	{
		System.out.println("WebDriver related Method");
		
	}

}
