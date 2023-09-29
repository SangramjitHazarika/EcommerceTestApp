package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPage {

	public ProductPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement addToCardBtn;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"size_select_1\"]")
	private WebElement sizeBtn;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"buy_done_button\"]")
	private WebElement buyDoneBtn;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"bag\"]")
	private WebElement cartIcon;

	public WebElement getProductPageELement() {
		return addToCardBtn;
	}

	public WebElement getSizeBtn() {
		return sizeBtn;
	}

	public WebElement getBuyDoneBtn() {
		return buyDoneBtn;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}
}
