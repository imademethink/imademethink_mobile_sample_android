package zother;

import java.io.File;

import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppiumProgramatically {

	
	private static AppiumServiceBuilder service = null;
	
	public static void main(String[] args) {
		
		//stopAppium();
		
		startAppium();
		stopAppium();
	}
	
	
	public static void startAppium(){
		System.out.println("startAppium===1");
		service = new AppiumServiceBuilder().usingDriverExecutable(new File ("E:\\aaaTool_MobileTesting_Selendroid\\AppiumForWindows-1.1.0.0\\Appium\\node_modules\\npm\\bin\\npm"))
				                            .withAppiumJS(new File("E:\\aaaTool_MobileTesting_Selendroid\\AppiumForWindows-1.1.0.0\\Appium\\node_modules\\appium\\bin\\appium.js"));
		//service.build().start();
		service.build().start();
		
		System.out.println("startAppium===2");
	}
	
	public static void stopAppium(){
		System.out.println("stopAppium===1");
		try{
			service.build().stop();
		}catch(Exception ee){
			System.out.println("exception while stopping");
			System.out.println("==" + ee.getStackTrace());
		}
		
		
		System.out.println("stopAppium===2");
	}
	

}
