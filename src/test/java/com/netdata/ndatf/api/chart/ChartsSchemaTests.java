/**
 * 
 */
package com.netdata.ndatf.api.chart;

import java.util.Arrays;
import java.util.Collection;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;

/**
 * @author glauco
 *
 */
@RunWith(SerenityParameterizedRunner.class)
public class ChartsSchemaTests {

	@TestData
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] { { "system.cpu", "array" }, { "system.cpu", "json" },
				{ "system.ram", "json" }, { "system.ram", "array" }, { "system.ipv4", "array" },
				{ "system.io", "array" }, { "system.swap", "array" }, });
	}

	@SuppressWarnings("unused")
	private final String chartName;
	@SuppressWarnings("unused")
	private final String format;

	public ChartsSchemaTests(String chartName, String format) {
		this.chartName = chartName;
		this.format = format;
	}

	@Steps
	NetdataAPISteps netdataAPISteps;

	@Before
	public void startup() throws Exception{
		
		// Given
		netdataAPISteps.chartGetToNetdata(chartName, format, 100);

		// When
		netdataAPISteps.aResponseIsReceivedFromNetdata();

	}
	
	@Test
	public void testStatusCode() throws Exception{
		
		// Then
		netdataAPISteps.statusCodeEqualsTo(HttpStatus.SC_OK);
		
	}

	@Test
	public void testMimeTypeFromNetdataCharts() throws Exception {

		// Then
		netdataAPISteps.mimeTypeEqualsTo("application/json");

	}

	@Test
	public void testSchemaFromNetdataCharts() throws Exception {

		// Then
		netdataAPISteps.schemaEqualsTo(chartName, format);

	}

}
