/**
 * 
 */
package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane.monitors;

/**
 * @author glauco
 * 
 * This class represents the default steps that can be 
 * performed by any monitor at the Landing page.
 *
 */
public interface DefaultMonitorPaneActions {
	
	/**
	 * Gets the displayed monitor name.
	 * @return Displayed monitor name.
	 * @throws Exception
	 */
	public String getMonitorTitle() throws Exception;
	
	/**
	 * Gets the displayed monitor measuring.
	 * @return Displayed monitor measuring.
	 * @throws Exception
	 */
	public String getMonitorLabel() throws Exception;
	
	/**
	 * Gets the displayed monitor units.
	 * @return Displayed monitor units.
	 * @throws Exception
	 */
	public String getMonitorUnits() throws Exception;

}
