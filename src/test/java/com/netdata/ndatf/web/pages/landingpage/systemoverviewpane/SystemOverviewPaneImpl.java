/**
 *
 */
package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane;

import java.util.List;
import java.util.stream.Collectors;

import com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.monitors.DefaultMonitorImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.monitors.DefaultMonitorPane;
import com.netdata.ndatf.web.pages.webelements.NetDataWebElementFacadeImpl;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * @author glauco
 *
 */
public class SystemOverviewPaneImpl extends NetDataWebElementFacadeImpl implements SystemOverviewPane{

	@Override
	public List<DefaultMonitorPane> getMonitorsList() throws Exception {
		return findElements(By.xpath("//div[@class='netdata-container-easypiechart']")).stream().map(element ->
                new DefaultMonitorImpl(getDriver(), getLocator(), element, getImplicitTimeoutInMilliseconds()))
                .collect(Collectors.toList());
	}

	public SystemOverviewPaneImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds,
			long waitForTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public SystemOverviewPaneImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
		super(driver, locator, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public SystemOverviewPaneImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds, By bySelector) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds, bySelector);
		// TODO Auto-generated constructor stub
	}

	public SystemOverviewPaneImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public SystemOverviewPaneImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			long implicitTimeoutInMilliseconds) {
		super(driver, locator, webElement, implicitTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

	public SystemOverviewPaneImpl(WebDriver driver, ElementLocator locator, WebElement webElement,
			WebElement resolvedELement, By bySelector, long timeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
		super(driver, locator, webElement, resolvedELement, bySelector, timeoutInMilliseconds, waitForTimeoutInMilliseconds);
		// TODO Auto-generated constructor stub
	}

}
