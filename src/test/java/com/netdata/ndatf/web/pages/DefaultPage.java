/**
 *
 */
package com.netdata.ndatf.web.pages;

import com.netdata.ndatf.web.pages.landingpage.sidemenu.SideMenu;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

/**
 * @author glauco
 *
 * This class will be extended by other that implements a page with header and right menu.
 *
 */
public class DefaultPage extends PageObject {

    @FindBy(id=SideMenu.LOCATOR)
    public SideMenu sideMenu;


    public String getCurrentPage() {
        if(withTimeoutOf(Duration.ofSeconds(10)).elementIsPresent(By.xpath("//div[contains(@class,'dashboard-section')]")))
        return "Landing";
        else return "Unknown";

    }
}
