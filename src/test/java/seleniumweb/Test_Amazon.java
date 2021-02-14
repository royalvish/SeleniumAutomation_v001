package seleniumweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;



public class Test_Amazon {
	static WebDriver Driver;
			
	@Test
	public void AmazonHomePageTitleVerification() throws Exception
	{
		System.setProperty("webdriver.gecko.driver","G:\\Browser_Drivers\\geckodriver.exe");
		/*System.setProperty("webdriver.chrome.driver", "G:\\Browser_Drivers\\chromedriver.exe");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("profile.defualt_content_setting_values.notification", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", map);		
		Driver = new ChromeDriver(options);*/
		FirefoxOptions opt= new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		Driver = new FirefoxDriver(opt);
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.get("https://www.myntra.com");
		Driver.manage().window().maximize();
		String appTitle=Driver.getTitle();
		System.out.println("Website Title is:"+ appTitle);
		Thread.sleep(3000); 
		//String expTitle="amazon";
		if (appTitle.equals (appTitle)){
			System.out.println("Website Title Verification Successfull");
			}
		else{
			System.out.println("Website Title Verification Failed");

			}
		}
		
	@Test
	public void AmazonSigninPageTitleVerification() throws Exception
	    
		
		{
		WebElement ele_profile = Driver.findElement(By.xpath("//*[@class='desktop-userTitle']"));
		WebElement ele_login = Driver.findElement(By.xpath("//*[@class='desktop-linkButton']"));
		Actions action = new Actions(Driver);
		action.moveToElement(ele_profile).moveToElement(ele_login).click().perform();
		String appTitle1 = Driver.getTitle();
		System.out.println("Website Title is:"+ appTitle1);
		Thread.sleep(5000); 
				
		if (appTitle1.equals (appTitle1)){
			System.out.println("Login Page Verification Successfull");
			}
		else{
			System.out.println("Login Page Verification Failed");

			}	
		
		Driver.close();
		
		
		}
		
	
	
		
	}


