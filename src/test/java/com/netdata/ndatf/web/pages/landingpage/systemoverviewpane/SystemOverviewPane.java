/**
 * 
 */
package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane;

import com.netdata.ndatf.web.pages.panes.DefaultPanel;

import net.serenitybdd.core.annotations.ImplementedBy;

/**
 * @author glauco
 * 
 * This interface represents the System Overview webelement. 
 *
 */
@ImplementedBy(SystemOverviewPaneImpl.class)
public interface SystemOverviewPane extends DefaultPanel, SystemOverviewPaneActions{

	String LOCATOR = "//div[@class='netdata-chart-row']";

}
