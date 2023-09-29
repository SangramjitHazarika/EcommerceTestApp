package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.Page;
import pages.ProductPage;
import pages.ShirtPage;

public class ShirtPageTest extends BaseClass {
	private static WebDriverWait wait;

	@Test
	public void productSelectTest() throws InterruptedException {
		Page shirtPage = new ShirtPage(driver);

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(shirtPage.getHomePageELement()));

		shirtPage.getHomePageELement().click();

		System.out.println("Completed Test One...");
	}

	@Test
	public void placeOrderTest() throws InterruptedException {
		Page shirtPage = new ShirtPage(driver);

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(shirtPage.getShopPageELement()));

		shirtPage.getShopPageELement().click();

		ProductPage productPage = new ProductPage(driver);

		wait.until(ExpectedConditions.visibilityOf(productPage.getProductPageELement()));

		productPage.getProductPageELement().click();

		wait.until(ExpectedConditions.visibilityOf(productPage.getSizeBtn()));

		productPage.getSizeBtn().click();

		wait.until(ExpectedConditions.visibilityOf(productPage.getBuyDoneBtn()));

		productPage.getBuyDoneBtn().click();

		wait.until(ExpectedConditions.visibilityOf(productPage.getCartIcon()));

		productPage.getCartIcon().click();

		System.out.println("Completed Test Two... Order Placed");
	}
}
