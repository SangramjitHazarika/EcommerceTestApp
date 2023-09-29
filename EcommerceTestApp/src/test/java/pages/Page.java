package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public abstract class Page {

	public Page(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public abstract WebElement getHomePageELement();

	public abstract WebElement getShopPageELement();
}
