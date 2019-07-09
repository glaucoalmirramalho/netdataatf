package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.monitors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.netdata.ndatf.web.pages.webelements.NetDataWebElementFacadeImpl;

public class DefaultMonitorImpl extends NetDataWebElementFacadeImpl implements DefaultMonitorPane{
	
	@Override
	public String getMonitorTitle() throws Exception {
		return findElements(By.tagName("span")).get(1).getText();
	}

	@Override
	public String getMonitorLabel() throws Exception {
		return findElements(By.tagName("span")).get(0).getText();
	}

	@Override
	public String getMonitorUnits() throws Exception {
		return findElements(By.tagName("span")).get(2).getText();
	}

	public DefaultMonitorImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds,
			long waitForTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public DefaultMonitorImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public DefaultMonitorImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds, By bySelector) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds, bySelector);
		// TODO Auto-generated constructor stub
	}

	public DefaultMonitorImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public DefaultMonitorImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public DefaultMonitorImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			WebElement resolvedELement, By bySelector, long timeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
		super(driver, locator, webElement, resolvedELement, bySelector, timeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}
	
	

}
