package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Generic class for webdriver Library.
 * @author Rohit Gupta
 *
 */
public class WebDriverCommonLib {
	/**
	 *  Implicit wait for Element in GUI.
	 * @param driver
	 */
	public void waitForElementInGUI(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	/**
	 * Explicit wait for element.
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Custom Wait for Enabled Element
	 * @param element
	 */
	public void customWaitForEnabledElement(WebElement element) {
		int i = 0;
		while(i<=100) {
			try {
				element.isEnabled();
			}catch(Exception e) {
				i++;
			}
		}
	}
	/**
	 * Select the option from Listbox Based on index.
	 * @param element
	 * @param index
	 */
	public void selectOption(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * Select the option from Listbox based on visible Text.
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

}
