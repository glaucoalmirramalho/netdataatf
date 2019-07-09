package com.netdata.ndatf.web.pages.landingpage.sidemenu;

import com.netdata.ndatf.web.pages.webelements.NetDataWebElementFacadeImpl;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;
import java.util.stream.Collectors;

public class SideMenuImpl extends NetDataWebElementFacadeImpl implements SideMenu {
    public SideMenuImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
    }

    public SideMenuImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
        super(driver, locator, implicitTimeoutInMilliseconds);
    }

    public SideMenuImpl(WebDriver driver, ElementLocator locator, WebElement webElement, long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds, By bySelector) {
        super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds, bySelector);
    }

    public SideMenuImpl(WebDriver driver, ElementLocator locator, WebElement webElement, long implicitTimeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
        super(driver, locator, webElement, implicitTimeoutInMilliseconds, waitForTimeoutInMilliseconds);
    }

    public SideMenuImpl(WebDriver driver, ElementLocator locator, WebElement webElement, long implicitTimeoutInMilliseconds) {
        super(driver, locator, webElement, implicitTimeoutInMilliseconds);
    }

    public SideMenuImpl(WebDriver driver, ElementLocator locator, WebElement webElement, WebElement resolvedELement, By bySelector, long timeoutInMilliseconds, long waitForTimeoutInMilliseconds) {
        super(driver, locator, webElement, resolvedELement, bySelector, timeoutInMilliseconds, waitForTimeoutInMilliseconds);
    }

    @Override
    public List<WebElement> getMenus() throws Exception {
        return findElements(By.xpath("//li[@class='active']/ul/li"));
    }

    @Override
    public void selectMenu(String menuName) throws Exception {
        getMenus().stream().filter(menu -> menu.getText().equals(menuName)).findFirst().get().click();
    }
}
