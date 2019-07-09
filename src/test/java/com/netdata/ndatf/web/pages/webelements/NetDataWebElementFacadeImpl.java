/**
 * 
 */
package com.netdata.ndatf.web.pages.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.WebElementFacadeImpl;

/**
 * @author glauco
 * 
 * Every new WebElement must extend this class.
 *
 */
public class NetDataWebElementFacadeImpl extends WebElementFacadeImpl implements NetDataWebElementFacade {

	public NetDataWebElementFacadeImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds,
			long waitForTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public NetDataWebElementFacadeImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public NetDataWebElementFacadeImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds, By bySelector) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds, bySelector);
		// TODO Auto-generated constructor stub
	}

	public NetDataWebElementFacadeImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public NetDataWebElementFacadeImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public NetDataWebElementFacadeImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			WebElement resolvedELement, By bySelector, long timeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
		super(driver, locator, webElement, resolvedELement, bySelector, timeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

}
