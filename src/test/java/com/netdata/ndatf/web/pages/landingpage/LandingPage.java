/**
 * 
 */
package com.netdata.ndatf.web.pages.landingpage;

import com.netdata.ndatf.web.pages.DefaultPage;
import com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.SystemOverviewPane;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author glauco
 * 
 * This class represents the default page with the monitors.
 *
 */
@DefaultUrl("http://127.0.0.1:19999")
public class LandingPage extends DefaultPage {

	@FindBy(xpath=SystemOverviewPane.LOCATOR)
	public SystemOverviewPane systemOverviewPane;
	
}
