/**
 * 
 */
package com.netdata.ndatf.web.pages.landingpage.systemoverviewpane;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * @author glauco
 * 
 * This class contains the Cucumber steps.
 *
 */
public class SystemOverviewStepsDefinitions {

	@Steps
	SystemOverviewSteps systemOverviewSteps;

	@Then("the System Overview pane will show the monitor '(.*)'")
	public void getMonitorsList(String monitorName) throws Exception {
		assertTrue("Monitor " + monitorName + " not found",
		systemOverviewSteps.getMonitorsList().stream().filter(monitor -> {
			boolean found = false;
			try {
				String monitorTitle = monitor.getMonitorTitle();
				found = monitorTitle.equals(monitorName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return found;
		}).findAny().isPresent());
	}

}
