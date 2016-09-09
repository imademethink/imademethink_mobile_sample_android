package zother;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppiumProgramatically2 {

	public AndroidDriver<MobileElement> driver;
	public DesiredCapabilities cap;
	public AppiumDriverLocalService service;
	
	@BeforeTest
	public void startServer(){
		service = AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder()
						.usingDriverExecutable(new File("E:\\aaaTool_MobileTesting_Selendroid\\AppiumForWindows-1.1.0.0\\Appium\\node.exe"))
						.withAppiumJS(new File("E:\\aaaTool_MobileTesting_Selendroid\\AppiumForWindows-1.1.0.0\\Appium\\node_modules\\appium\\bin\\appium.js"))
						.withIPAddress("127.0.0.1")
						.usingPort(4723)
	    );
		
	}
	
//	@AfterTest
	
	
	@Test
	public void sczxc() throws InterruptedException{
		service.start();
		Thread.sleep(5000);
		service.stop();
		
	}
}
