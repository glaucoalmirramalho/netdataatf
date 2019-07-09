/**
 * 
 */
package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane;

import java.util.List;

import com.netdata.ndatf.web.pages.landingpage.LandingPage;
import com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.monitors.DefaultMonitorPane;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

/**
 * @author glauco
 * 
 * This class contains the methods that will get the screenshots.
 *
 */
public class SystemOverviewSteps implements SystemOverviewPaneActions {
	
	LandingPage landingPage;

	/* (non-Javadoc)
	 * @see com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.SystemOverviewPaneActions#getMonitorsList()
	 */
	@Override
	@Step("Retrieve Monitors list from System Overview pane.")
	public List<DefaultMonitorPane> getMonitorsList() throws Exception {
		return landingPage.systemOverviewPane.getMonitorsList();
	}

}
