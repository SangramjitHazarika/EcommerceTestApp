package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AndroidDriver driver;

	@BeforeTest
	public void setup() {

		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus S");
			caps.setCapability(MobileCapabilityType.APP, "/Users/d2c-sangramjit.h/Downloads/myntra.apk");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
			caps.setCapability("appPackage", "com.myntra.android");
			caps.setCapability("appActivity", "com.myntra.android.activities.react.ReactActivity");

			URL url = new URL("http://127.0.0.1:4723/");
			driver = new AndroidDriver(url, caps);

		} catch (Exception e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}

	}

	@Test
	public void sampleTest() {
		System.out.println("I am inside sample test");
	}

	@AfterSuite
	public void closeDown() {
		driver.close();
		driver.quit();
	}

}
