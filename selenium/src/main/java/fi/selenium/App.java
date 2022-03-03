package fi.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	WebDriver driver;
public void launchBrowser() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagdish More\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver = new ChromeDriver();
  	driver.get("https://www.google.com/");

}
public void navigateToSelinium()
{
	driver.navigate().to("https://en.wikipedia.org/wiki/Selenium_(software)");
	driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
	driver.navigate().to("http://www.seleniumhq.org");
	System.out.println(driver.getCurrentUrl());
	driver.close();
}

public static void main(String[] args) throws InterruptedException 
{
	App ob = new App();
	ob.launchBrowser();
	ob.navigateToSelinium();
}
}