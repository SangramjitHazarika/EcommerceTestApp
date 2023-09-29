package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class ShirtPage extends Page {

	public ShirtPage(AndroidDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='19:76b65834-f054-43cc-9738-77725c62d89e']")
	private WebElement homeScreenBtn;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[2]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement shopScreenBtn;

	@Override
	public WebElement getHomePageELement() {
		return homeScreenBtn;
	}

	@Override
	public WebElement getShopPageELement() {
		return shopScreenBtn;
	}
}
