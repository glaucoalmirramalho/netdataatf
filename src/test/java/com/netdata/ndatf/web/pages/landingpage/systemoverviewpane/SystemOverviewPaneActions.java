/**
 * 
 */
package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane;

import java.util.List;

import com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.monitors.DefaultMonitorPane;
import org.openqa.selenium.WebElement;

/**
 * @author glauco
 * 
 * This class represents the actions available at the System Overview pane.
 *
 */
public interface SystemOverviewPaneActions {
	
	/**
	 * This method returns the monitors displayed.
	 * @return Visible monitors.
	 * @throws Exception
	 */
	public List<DefaultMonitorPane> getMonitorsList() throws Exception;

}
